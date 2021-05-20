
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidarClienteResponse_QNAME = new QName("http://webservice/", "validarClienteResponse");
    private final static QName _ValidarCliente_QNAME = new QName("http://webservice/", "validarCliente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarClienteResponse }
     * 
     */
    public ValidarClienteResponse createValidarClienteResponse() {
        return new ValidarClienteResponse();
    }

    /**
     * Create an instance of {@link ValidarCliente }
     * 
     */
    public ValidarCliente createValidarCliente() {
        return new ValidarCliente();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "validarClienteResponse")
    public JAXBElement<ValidarClienteResponse> createValidarClienteResponse(ValidarClienteResponse value) {
        return new JAXBElement<ValidarClienteResponse>(_ValidarClienteResponse_QNAME, ValidarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "validarCliente")
    public JAXBElement<ValidarCliente> createValidarCliente(ValidarCliente value) {
        return new JAXBElement<ValidarCliente>(_ValidarCliente_QNAME, ValidarCliente.class, null, value);
    }

}
