/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import Beans.BeanCarrera;
import Beans.BeanCarreraCliente;

/**
 *
 * @author Notebook
 */
public interface ImplementacionCarrera {
    public BeanCarrera listar( int pk);
    public int terminarcarrera(BeanCarrera bc);
    public int registrarCarrera (BeanCarreraCliente clie);
    public BeanCarreraCliente listarCarreaCliente(int pk) ;
    }
