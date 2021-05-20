/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import implementacion.ImplementacionCarreraIM;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import webservice.Taxista;

/**
 *
 * @author Notebook
 */
@ManagedBean
public class BeanCarrera {
   private String nombre_cliente;
   private int telefono_cliente;
   private int cedulacliente;
   private String estado;
   private boolean estado2;
   private int id_carrera;
   private BeanServicio servicio;
   private int idservicio;

    public BeanCarrera() {
                HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

         idservicio = (int) session.getAttribute("servicio");
        
    }


    /**
     * @return the nombre_cliente
     */
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    /**
     * @param nombre_cliente the nombre_cliente to set
     */
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    /**
     * @return the telefono_cliente
     */
    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    /**
     * @param telefono_cliente the telefono_cliente to set
     */
    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cedulacliente
     */
    public int getCedulacliente() {
        return cedulacliente;
    }

    /**
     * @param cedulacliente the cedulacliente to set
     */
    public void setCedulacliente(int cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public  BeanCarrera listar(){
    ImplementacionCarreraIM impl = new ImplementacionCarreraIM();
    
    int pk=servicio.getId_servicio();
    BeanCarrera bcd=impl.listar(pk);
    
    bcd.getNombre_cliente();
    bcd.getCedulacliente();
    bcd.getTelefono_cliente();
    bcd.getEstado();
    
    
    return bcd;
    }
    public void terminarcarrera(){
    ImplementacionCarreraIM im= new ImplementacionCarreraIM();
    BeanCarrera bc= new BeanCarrera();
    
    bc.setId_carrera(getId_carrera());
    bc.setEstado2(false);
    im.terminarcarrera(bc);
            }

    /**
     * @return the estado2
     */
    public boolean isEstado2() {
        return estado2;
    }

    /**
     * @param estado2 the estado2 to set
     */
    public void setEstado2(boolean estado2) {
        this.estado2 = estado2;
    }

    /**
     * @return the id_carrera
     */
    public int getId_carrera() {
        return id_carrera;
    }

    /**
     * @param id_carrera the id_carrera to set
     */
    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    /**
     * @return the servicio
     */
    public BeanServicio getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(BeanServicio servicio) {
        this.servicio = servicio;
    }

    /**
     * @return the idservicio
     */
    public int getIdservicio() {
        return idservicio;
    }

    /**
     * @param idservicio the idservicio to set
     */
    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }
    
}
