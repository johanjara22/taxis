/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import implementacion.RegistrarTaxistaIM;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


/**
 *
 * @author Notebook
 */
@ManagedBean
public class BeanTaxista {
    
     private int cedula;
    private String nombre;
    private int telefono;
    private String usuario;
    private BeanTaxista taxista;

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
     public void insertarPersona(){
        BeanTaxista per = new BeanTaxista();
         RegistrarTaxistaIM retax = new RegistrarTaxistaIM();
        
        per.setCedula(getCedula());
        per.setNombre(getNombre());
        per.setTelefono(getTelefono());
        per.setUsuario(getUsuario());
        
        int vl =retax.RegistrarTaxista(per);
        if (vl == 0){
        //   return "";
        }
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
               FacesMessage.SEVERITY_INFO, "Info", "Ingreso persona al sistema"));
       
    }

    /**
     * @return the taxista
     */
    public BeanTaxista getTaxista() {
        return taxista;
    }

    /**
     * @param taxista the taxista to set
     */
    public void setTaxista(BeanTaxista taxista) {
        this.taxista = taxista;
    }
}
