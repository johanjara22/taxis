/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import Beans.BeanCarrera;
import Beans.BeanCarreraCliente;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Notebook
 */
public class ImplementacionCarreraIM implements ImplementacionCarrera{

   @Override
    public int registrarCarrera (BeanCarreraCliente clie){
        Conexion con = new Conexion();
        Connection c = con.conectarse();
      
        if (c!=null){
            try{
                
               PreparedStatement ps = c.prepareStatement("insert into carrera (id_servicio,cedula_cliente, estado_carrera ) values (?,?,?)");
               ps.setInt(1, clie.getIdServicio());
               ps.setInt(2, clie.getCedulacliente());
               ps.setBoolean(3, clie.isEstado());
              //  ps.setInt(4, clie.getIdCarrera());
                
                int rta =ps.executeUpdate(); 
                return rta;
                               
            }catch (SQLException e) {
                System.err.println("erroor al insertar la carrera"+e);
                 Logger.getLogger(ImplementacionCarreraIM.class.getName()).log(Level.SEVERE, null, e);
            }
                    
        } 
        return 0;
        
    }
    
    @Override
    public BeanCarreraCliente listarCarreaCliente(int pk) {
        Conexion con = new Conexion();
        Connection c = con.conectarse();
        if (c != null) {
            try { 
                    PreparedStatement ps=c.prepareCall("select id_servicio, t.nombre_taxista, c.placa, c.marca, c.modelo " +
                    "from servicio s inner join taxista t on (s.cedula_taxista = t.cedula_taxista) inner join carro c "
                            + " on (s.placa=c.placa) where id_servicio = ?");
                    ps.setInt(1, pk);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                       
                        BeanCarreraCliente beancarCli = new BeanCarreraCliente();
                        
                        int idServicio=rs.getInt("id_servicio");
                        beancarCli.setIdServicio(idServicio);
                        
                        String nombre = rs.getString("nombre_taxista");
                        beancarCli.setNombreTaxista(nombre);
                        
                        String placa = rs.getString("placa");
                        beancarCli.setPlaca(placa);
                        
                        String marca= rs.getString("marca");
                        beancarCli.setMarca(marca);
                        
                        String modelo= rs.getString("modelo");
                        beancarCli.setModelo(modelo);
                    
                    return beancarCli;
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(ImplementacionCarreraIM.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        return null;

    }        

    
    @Override
    public BeanCarrera listar(int pk) {
        Conexion con = new Conexion();
        Connection c = con.conectarse();
        if (c != null) {
            try {
                    PreparedStatement ps=c.prepareCall("select ca.cedula_cliente,nombre_cliente, telefono_cliente, ca.estado_carrera\n" +
                    " from carrera as ca join cliente as c\n" +
                    " on ca.cedula_cliente =  c.cedula_cliente\n" +
                    "join servicio as ser\n" +
                    "on ca.id_servicio = ser.id_servicio\n" +
                    "join carro as car\n" +
                    "on ser.placa = car.placa\n" +
                    "where ser.id_servicio=?;\n" +
                    " ");
                    ps.setInt(1, pk);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        String estadocarrera;
                        BeanCarrera beancar = new BeanCarrera();

                        String nombrecliente= rs.getString("nombre_cliente");
                        beancar.setNombre_cliente(nombrecliente);

                         int cedulacliente = rs.getInt("cedula_cliente");
                        beancar.setCedulacliente(cedulacliente);

                                            int telefonocliente = rs.getInt("telefono_cliente");
                        beancar.setTelefono_cliente(telefonocliente);

                        boolean estado= rs.getBoolean("estado_carrera");
                        beancar.setEstado2(estado);

                        if(estado==true){
                            estadocarrera="Carrera en progreso";
                            beancar.setEstado(estadocarrera);
                        }
                        else{
                            estadocarrera="Carrera finalizada";
                        }

                    return beancar;//salir
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(ImplementacionCarreraIM.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        return null;

    }        
    
    
    @Override
    public int terminarcarrera(BeanCarrera bc) {
        
        Conexion con = new Conexion();
        Connection c = con.conectarse();
        if (c != null) {
            try {
               PreparedStatement ps = c.prepareStatement("Update carrera set estado_carrera=? where id_carrera=?" );
               ps.setBoolean(1,bc.isEstado2() );
               ps.setInt(2, bc.getId_carrera());
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
    
