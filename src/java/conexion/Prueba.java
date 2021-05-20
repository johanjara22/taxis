/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;


import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.sql.Connection;
import static java.util.Collections.list;
import java.util.List;


/**
 *
 * @author 01-04
 */
public class Prueba { 
    
    
   /* public static void main2(String[] args) {
        OperacionesEquipoIM oper=new OperacionesEquipoIM();
        List <Equipo> eqs = oper.consultar();
        for (Equipo eq : eqs) {
            System.out.println(eq);
            
        }
    }*/
    public static void main(String[] args) {
       
        
       /* OperacionesEquipoIM oper=new OperacionesEquipoIM();
  Equipo e =new Equipo();
  
  e.setCodigo(5);
  e.setNombre("huila");
  e.setEstadio("AG");
        
        int rta = oper.insertar(e);
        System.out.print(rta);*/
        
        
        
        
        
        
        
    Conexion con= new Conexion();
    Connection c =con.conectarse();
    System.out.println(c);
    }
               
    
}
