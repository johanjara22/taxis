/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import Beans.BeanServicio;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;

/**
 *
 * @author Notebook
 */
public class ImplementacionServicioIM implements ImplementacionServicio{

    @Override
    public List<BeanServicio> listar() {
        Conexion con = new Conexion();
        Connection c = con.conectarse();
        if (c != null) {
            try {
                PreparedStatement ps=c.prepareCall("select ser.id_servicio, ta.cedula_taxista, ta.nombre_taxista,ser.hora, ca.placa, ser.estado_servicio\n" +
"from servicio as ser join taxista as ta\n" +
"on ser.cedula_taxista = ta.cedula_taxista\n" +
"join carro as ca\n" +
"on ser.placa = ca.placa\n" +
"where ser.estado_servicio=true;");
                List<BeanServicio> rta = new ArrayList<BeanServicio>();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    BeanServicio ser = new BeanServicio();
                    rta.add(ser);
                    int servicio= rs.getInt("id_servicio");
                    ser.setId_servicio(servicio);
                    
                    int cedula = rs.getInt("cedula_taxista");
                    ser.setCedula(cedula);
                    
                    String placa= rs.getString("placa");
                    ser.setPlaca(placa);
                    
                    String nombre= rs.getString("nombre_taxista");
                    ser.setNombre(nombre);
                    
                    Timestamp hora= rs.getTimestamp("hora");
                    ser.setHora(hora);
                    
                    
                               }
                      } catch (SQLException e) {
                          System.err.println("error"+e);
            }
              finally{
            con.desconectarse(c);}
    }
   
    
        return null;
    
    }

   
    @Override
    public int asignacion_carro(BeanServicio dto) {
        Conexion con = new Conexion();
        Connection c = con.conectarse();
        if (c != null) {
            try {
                PreparedStatement ps = c.prepareStatement("Insert into servicio(cedula_taxista,placa) "
                        + "values(?,?)");
                ps.setInt(1, dto.getCedula());
                ps.setString(2, dto.getPlaca());
           
                int rta=ps.executeUpdate();
                return rta;
            } catch (SQLException e) {
                System.out.println("error"+e);
            }
            finally{
            con.desconectarse(c);}
        }
        return 0;
    }
public List<BeanServicio> consultarServicio() {
        Conexion con = new Conexion();
        Connection c = con.conectarse();
        if (c != null)
        {
            try {
                PreparedStatement ps = c.prepareStatement("SELECT id_servicio, s.placa, v.marca, estado_servicio " +
                "from servicio s inner join carro v on (s.placa = v.placa) where estado_servicio=true "
                 + "order by s.hora  desc ");
                List<BeanServicio> rta = new ArrayList<BeanServicio>();
                ResultSet rs =ps.executeQuery();//es un objeto que genera una tabla en columnas según tenga el select
                while (rs.next()) {  // debe traer todos los registro de la tabla                  
                    BeanServicio e = new BeanServicio();
                    rta.add(e);
                    int id_servicio = rs.getInt("id_servicio");
                    e.setId_servicio(id_servicio);
                   
                    String placa = rs.getString("placa");
                    e.setPlaca(placa);
                    
                    String marca = rs.getString("marca");
                    e.setMarca(marca);
                    
                   boolean disponibilidad = rs.getBoolean("estado_servicio");
                    e.setEstado(disponibilidad);
                    
                    
                }
                System.out.println("tamano"+rta.size());
                return rta;
                                           
                        
            } catch (SQLException ex) {
                System.err.println(""+ex);            }  finally {
                
                con.desconectarse(c);
                
            }
        }
        return null;
    }
    @Override
    public int terminar_turno(BeanServicio ser) {
         Conexion con = new Conexion();
        Connection c = con.conectarse();
        if (c != null) {
            try {
               PreparedStatement ps = c.prepareStatement("Update servicio set disponibilidad=? where id_servicio=?" );
               ps.setBoolean(1, ser.isDisponibilidad());
               ps.setInt(2, ser.getId_servicio());
               ps.executeUpdate();
               
            } catch (SQLException e) {
                System.err.println("error"+e);
            }
            finally{
            con.desconectarse(c);}
    }
        return 0;
    
}

   
}
