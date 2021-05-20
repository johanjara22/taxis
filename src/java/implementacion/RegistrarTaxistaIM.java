/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import Beans.BeanTaxista;
import conexion.Conexion;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patricia
 */
public class RegistrarTaxistaIM  {
    
    
    public int RegistrarTaxista(BeanTaxista ta){
        Conexion con = new Conexion();
        Connection c = con.conectarse();
      
        if (c!=null){
            try{
                
                PreparedStatement ps = c.prepareStatement("insert into taxista (cedula_taxista, nombre_taxista, telefono_taxista, usuario_taxista) values (?,?,?,?)");
                ps.setInt(1,ta.getCedula());
                ps.setString(2, ta.getNombre());
                ps.setInt(3, ta.getTelefono());
                ps.setString(4, ta.getUsuario());
                int rta =ps.executeUpdate(); 
                return rta;
               
            }catch (SQLException e) {
                System.err.println("errooooooooooooooooooooooooooor"+e);
                 Logger.getLogger(RegistrarTaxistaIM.class.getName()).log(Level.SEVERE, null, e);
            }
                    
        } 
        return 0;
        
    }
         
    
    
}
