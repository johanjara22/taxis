
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para operation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsuarioTaxista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CedulaTaxista" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation", propOrder = {
    "usuarioTaxista",
    "cedulaTaxista"
})
public class Operation {

    @XmlElement(name = "UsuarioTaxista")
    protected String usuarioTaxista;
    @XmlElement(name = "CedulaTaxista")
    protected int cedulaTaxista;

    /**
     * Obtiene el valor de la propiedad usuarioTaxista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioTaxista() {
        return usuarioTaxista;
    }

    /**
     * Define el valor de la propiedad usuarioTaxista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioTaxista(String value) {
        this.usuarioTaxista = value;
    }

    /**
     * Obtiene el valor de la propiedad cedulaTaxista.
     * 
     */
    public int getCedulaTaxista() {
        return cedulaTaxista;
    }

    /**
     * Define el valor de la propiedad cedulaTaxista.
     * 
     */
    public void setCedulaTaxista(int value) {
        this.cedulaTaxista = value;
    }

}
