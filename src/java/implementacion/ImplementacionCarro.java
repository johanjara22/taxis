
package implementacion;


import Beans.BeanCarro;
import java.util.List;


public interface ImplementacionCarro {
 public List<BeanCarro> listarcarro();
 public int editar(BeanCarro bc);
 public int crear_carro(BeanCarro bc);
 
}
