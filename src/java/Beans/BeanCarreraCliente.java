/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import implementacion.ImplementacionCarreraIM;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import webservice.Cliente;
//import webservices.Persona;

/**
 *
 * @author Patricia
 */
@ManagedBean
@RequestScoped
public final class BeanCarreraCliente {
    

   private int cedulacliente;
   private boolean estado;
   private int idServicio;
   private int idCarrera;
  private Cliente cliente;
  private String nombreTaxista;
  private String placa;
  private String marca;
  private String modelo;


   

    public BeanCarreraCliente() {
        
      HttpSession session =(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
//      cedulacliente = (int) session.getAttribute("carrera");
        cliente  = (Cliente)session.getAttribute("ValidCliente");
        if (cliente == null)
        {
            cliente = new Cliente();
            cedulacliente = cliente.getCedula();
        }  
        cedulacliente = cliente.getCedula();
}

    public  BeanCarreraCliente listarCarreraCliente(){
        ImplementacionCarreraIM impl = new ImplementacionCarreraIM();

        int pk = idServicio;
        BeanCarreraCliente bcd=impl.listarCarreaCliente(pk);

        bcd.getIdServicio();
        bcd.getNombreTaxista();
        bcd.getPlaca();
        bcd.getMarca();
        bcd.getModelo();


        return bcd;
    }
   
    public String insertarCarreraCliente(){
        BeanCarreraCliente carC = new BeanCarreraCliente();
        ImplementacionCarreraIM Recarre = new ImplementacionCarreraIM();
       
//        setCedulacliente(cliente.getCedula());
        carC.setCedulacliente(getCedulacliente());
        carC.setEstado(true);
        carC.setIdServicio(getIdServicio());
        
        Recarre.registrarCarrera(carC);
        carC.carreraCli();
       return "carreraCliente";
       
    }
    
  public String carreraCli(){
       return "carreraCliente";
       
    }
    
    public int getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(int cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombreTaxista() {
        return nombreTaxista;
    }

    public void setNombreTaxista(String nombreTaxista) {
        this.nombreTaxista = nombreTaxista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   
    
    
}
