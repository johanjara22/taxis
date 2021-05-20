/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;


import implementacion.ImplementacionServicioIM;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;// poderlo llamar en el htmx
import javax.faces.bean.RequestScoped;// que tanto se debe mantener la info en memoria
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


@ManagedBean
@RequestScoped

public class Consultar {
 
  
   
    private ImplementacionServicioIM oper = new ImplementacionServicioIM();
    private List<BeanServicio> eqs = oper.consultarServicio();
    
    


    public ImplementacionServicioIM getOper() {
        return oper;
    }

    public void setOper(ImplementacionServicioIM oper) {
        this.oper = oper;
    }

    public List<BeanServicio> getEqs() {
        return eqs;
    }

    public void setEqs(List<BeanServicio> eqs) {
        this.eqs = eqs;
    }
    


}
