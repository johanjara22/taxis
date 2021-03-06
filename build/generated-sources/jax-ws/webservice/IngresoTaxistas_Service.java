
package webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ingresoTaxistas", targetNamespace = "http://webservice/", wsdlLocation = "http://localhost:51777/Sesion_de_taxistas/ingresoTaxistas?wsdl")
public class IngresoTaxistas_Service
    extends Service
{

    private final static URL INGRESOTAXISTAS_WSDL_LOCATION;
    private final static WebServiceException INGRESOTAXISTAS_EXCEPTION;
    private final static QName INGRESOTAXISTAS_QNAME = new QName("http://webservice/", "ingresoTaxistas");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:51777/Sesion_de_taxistas/ingresoTaxistas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INGRESOTAXISTAS_WSDL_LOCATION = url;
        INGRESOTAXISTAS_EXCEPTION = e;
    }

    public IngresoTaxistas_Service() {
        super(__getWsdlLocation(), INGRESOTAXISTAS_QNAME);
    }

    public IngresoTaxistas_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), INGRESOTAXISTAS_QNAME, features);
    }

    public IngresoTaxistas_Service(URL wsdlLocation) {
        super(wsdlLocation, INGRESOTAXISTAS_QNAME);
    }

    public IngresoTaxistas_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INGRESOTAXISTAS_QNAME, features);
    }

    public IngresoTaxistas_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IngresoTaxistas_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IngresoTaxistas
     */
    @WebEndpoint(name = "ingresoTaxistasPort")
    public IngresoTaxistas getIngresoTaxistasPort() {
        return super.getPort(new QName("http://webservice/", "ingresoTaxistasPort"), IngresoTaxistas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IngresoTaxistas
     */
    @WebEndpoint(name = "ingresoTaxistasPort")
    public IngresoTaxistas getIngresoTaxistasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "ingresoTaxistasPort"), IngresoTaxistas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INGRESOTAXISTAS_EXCEPTION!= null) {
            throw INGRESOTAXISTAS_EXCEPTION;
        }
        return INGRESOTAXISTAS_WSDL_LOCATION;
    }

}
