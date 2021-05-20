
package implementacion;

import Beans.BeanServicio;

import java.util.List;


public interface ImplementacionServicio {
    public List <BeanServicio>listar();
    public int asignacion_carro(BeanServicio ser);
    public int terminar_turno(BeanServicio ser);
    public List<BeanServicio> consultarServicio();
}
