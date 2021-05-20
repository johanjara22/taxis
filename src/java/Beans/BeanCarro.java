/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import implementacion.ImplementacionCarroIM;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Notebook
 */
@ManagedBean
public class BeanCarro {
     private String placa;
    private String modelo;
    private String marca;
    private boolean estado;
    
  public void registrarCarro()
    {
    ImplementacionCarroIM impl= new ImplementacionCarroIM();
    BeanCarro bc =new BeanCarro();
    
    bc.setPlaca(getPlaca());
    bc.setModelo(getModelo());
    bc.setMarca(getMarca());
    
     int vl =impl.crear_carro(bc);
        
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
               FacesMessage.SEVERITY_INFO, "Info", "Ingreso persona al sistema"));
       
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
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
    
  
}
