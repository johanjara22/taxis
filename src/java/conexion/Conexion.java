
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Notebook
 */
public class Conexion {
    
    public Connection conectarse(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection c= DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/apptaxis", "admin","johanjara22");
            System.out.println("Conectado");
            return c;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void desconectarse(Connection c){
        if(c!=null){
        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}
}
