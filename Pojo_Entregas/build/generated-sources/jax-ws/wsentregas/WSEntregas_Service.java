
package wsentregas;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSEntregas", targetNamespace = "http://wsentregas/", wsdlLocation = "http://localhost:8080/WAEntregas/WSEntregas?WSDL")
public class WSEntregas_Service
    extends Service
{

    private final static URL WSENTREGAS_WSDL_LOCATION;
    private final static WebServiceException WSENTREGAS_EXCEPTION;
    private final static QName WSENTREGAS_QNAME = new QName("http://wsentregas/", "WSEntregas");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WAEntregas/WSEntregas?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSENTREGAS_WSDL_LOCATION = url;
        WSENTREGAS_EXCEPTION = e;
    }

    public WSEntregas_Service() {
        super(__getWsdlLocation(), WSENTREGAS_QNAME);
    }

    public WSEntregas_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSENTREGAS_QNAME, features);
    }

    public WSEntregas_Service(URL wsdlLocation) {
        super(wsdlLocation, WSENTREGAS_QNAME);
    }

    public WSEntregas_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSENTREGAS_QNAME, features);
    }

    public WSEntregas_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSEntregas_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSEntregas
     */
    @WebEndpoint(name = "WSEntregasPort")
    public WSEntregas getWSEntregasPort() {
        return super.getPort(new QName("http://wsentregas/", "WSEntregasPort"), WSEntregas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSEntregas
     */
    @WebEndpoint(name = "WSEntregasPort")
    public WSEntregas getWSEntregasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsentregas/", "WSEntregasPort"), WSEntregas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSENTREGAS_EXCEPTION!= null) {
            throw WSENTREGAS_EXCEPTION;
        }
        return WSENTREGAS_WSDL_LOCATION;
    }

}
