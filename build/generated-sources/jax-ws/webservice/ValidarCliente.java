
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validarCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validarCliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsuarioCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CedulaCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarCliente", propOrder = {
    "usuarioCliente",
    "cedulaCliente"
})
public class ValidarCliente {

    @XmlElement(name = "UsuarioCliente")
    protected String usuarioCliente;
    @XmlElement(name = "CedulaCliente")
    protected int cedulaCliente;

    /**
     * Obtiene el valor de la propiedad usuarioCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioCliente() {
        return usuarioCliente;
    }

    /**
     * Define el valor de la propiedad usuarioCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioCliente(String value) {
        this.usuarioCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad cedulaCliente.
     * 
     */
    public int getCedulaCliente() {
        return cedulaCliente;
    }

    /**
     * Define el valor de la propiedad cedulaCliente.
     * 
     */
    public void setCedulaCliente(int value) {
        this.cedulaCliente = value;
    }

}
