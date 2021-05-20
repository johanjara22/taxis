/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;


import Beans.BeanCarro;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Notebook
 */
public class ImplementacionCarroIM implements ImplementacionCarro{

    @Override
    public List<BeanCarro> listarcarro() {
        Conexion con = new Conexion();
        Connection c = con.conectarse();
        if (c != null) {
            try {
                PreparedStatement ps=c.prepareCall("select *from vehiculo");
                List<BeanCarro> rta = new ArrayList<BeanCarro>();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    BeanCarro carro = new BeanCarro();
                    rta.add(carro);
                    
                    String placa= rs.getString("placa");
                    carro.setPlaca(placa);
                    
                    String marca= rs.getString("marca");
                   carro.setMarca(marca);
                    
                    String modelo= rs.getString("modelo");
                    carro.setModelo(modelo);
                    
                   
                }
                return rta;
            } catch (Exception e) 
            {
            }
   
    }
        
        return null;
    }

    @Override
    public int editar(BeanCarro dto) {
        
        Conexion con = new Conexion();
        Connection c = con.conectarse();
        if (c != null) {
            try {
                PreparedStatement ps= c.prepareStatement("Update carro "
                        + "set estado_carro=? WHERE placa=?" );
                ps.setBoolean(1, dto.isEstado());
                ps.setString(2, dto.getPlaca());
                ps.executeUpdate();
                
            } catch (SQLException e) {
                System.err.println("error"+ e);
            }
        
    }
        return 0;
    }

    @Override
    public int crear_carro(BeanCarro dto) {
        Conexion con = new Conexion();
        Connection c = con.conectarse();
        if (c != null) {
            try {
                PreparedStatement ps= c.prepareStatement("insert into carro "
                        + "(placa,modelo,marca)values(?,?,?)" );
               ps.setString(1, dto.getPlaca());
               ps.setString(2, dto.getModelo());
               ps.setString(3, dto.getMarca());
               
                ps.executeUpdate();
                
            } catch (SQLException e) {
                System.err.println("error"+ e);
            }
        
    }
        return 0;
    }
    }
    
    
    
