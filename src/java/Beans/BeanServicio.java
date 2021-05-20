/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import implementacion.ImplementacionCarroIM;
import implementacion.ImplementacionServicioIM;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import webservice.Taxista;

/**
 *
 * @author Notebook
 */

@ManagedBean
public class BeanServicio {
    
    private Taxista taxista;
    private BeanCarro carro;
    private int id_servicio;
    private String placa;
    private int cedula;
    private boolean disponibilidad;
    private List<BeanServicio> services;
    private java.sql.Timestamp hora;
    private boolean estado;
    private String nombre;
    private BeanServicio servicio;
private String marca;
    public BeanServicio() {
       
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

        taxista = (Taxista) session.getAttribute("ValidTaxista");

        if (taxista == null) {
            taxista = new Taxista();
        }

        cedula = taxista.getCedula();
        disponibilidad = true;
    
    }

    /**
     * @return the taxista
     */
    public Taxista getTaxista() {
        return taxista;
    }

    /**
     * @param taxista the taxista to set
     */
    public void setTaxista(Taxista taxista) {
        this.taxista = taxista;
    }

    /**
     * @return the carro
     */
    public BeanCarro getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(BeanCarro carro) {
        this.carro = carro;
    }

    /**
     * @return the id_servicio
     */
    public int getId_servicio() {
        return id_servicio;
    }

    /**
     * @param id_servicio the id_servicio to set
     */
    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

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
     * @return the disponibilidad
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public void asignacion_carro() {
        ImplementacionCarroIM opera_carr = new ImplementacionCarroIM();
        ImplementacionServicioIM oper = new ImplementacionServicioIM();
        BeanServicio se = new BeanServicio();
        BeanCarro bc = new BeanCarro();

        se.setCedula(getCedula());
        se.setDisponibilidad(isDisponibilidad());
        se.setPlaca(getPlaca());
        oper.asignacion_carro(se);

        bc.setPlaca(getPlaca());
        bc.setEstado(false);

        opera_carr.editar(bc);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
               FacesMessage.SEVERITY_INFO, "Info", "Carro asignado"));

     HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

        session.setAttribute("servicio",se.id_servicio);
    }
public List<BeanServicio> listar()
    {
        ImplementacionServicioIM oper= new ImplementacionServicioIM();
       
       setServices(oper.listar());
        
        for (BeanServicio ser : getServices()) {
           
            ser.getId_servicio();
            ser.getCedula();
            ser.getPlaca();
            ser.getNombre();
            ser.getHora();
            
            
                          
                  }

        return null;
    }

public void terminar_turno(){
ImplementacionServicioIM im = new ImplementacionServicioIM();
BeanServicio bs= new BeanServicio();

bs.setId_servicio(id_servicio);
bs.setDisponibilidad(false);
}
    /**
     * @return the services
     */
    public List<BeanServicio> getServices() {
        return services;
    }

    /**
     * @param services the services to set
     */
    public void setServices(List<BeanServicio> services) {
        this.services = services;
    }

    /**
     * @return the hora
     */
    public java.sql.Timestamp getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(java.sql.Timestamp hora) {
        this.hora = hora;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
