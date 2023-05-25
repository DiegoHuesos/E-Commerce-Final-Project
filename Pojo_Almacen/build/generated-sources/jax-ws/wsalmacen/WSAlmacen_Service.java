
package wsalmacen;

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
@WebServiceClient(name = "WSAlmacen", targetNamespace = "http://wsalmacen/", wsdlLocation = "http://localhost:8080/WAAlmacen/WSAlmacen?WSDL")
public class WSAlmacen_Service
    extends Service
{

    private final static URL WSALMACEN_WSDL_LOCATION;
    private final static WebServiceException WSALMACEN_EXCEPTION;
    private final static QName WSALMACEN_QNAME = new QName("http://wsalmacen/", "WSAlmacen");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WAAlmacen/WSAlmacen?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSALMACEN_WSDL_LOCATION = url;
        WSALMACEN_EXCEPTION = e;
    }

    public WSAlmacen_Service() {
        super(__getWsdlLocation(), WSALMACEN_QNAME);
    }

    public WSAlmacen_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSALMACEN_QNAME, features);
    }

    public WSAlmacen_Service(URL wsdlLocation) {
        super(wsdlLocation, WSALMACEN_QNAME);
    }

    public WSAlmacen_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSALMACEN_QNAME, features);
    }

    public WSAlmacen_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSAlmacen_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSAlmacen
     */
    @WebEndpoint(name = "WSAlmacenPort")
    public WSAlmacen getWSAlmacenPort() {
        return super.getPort(new QName("http://wsalmacen/", "WSAlmacenPort"), WSAlmacen.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSAlmacen
     */
    @WebEndpoint(name = "WSAlmacenPort")
    public WSAlmacen getWSAlmacenPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsalmacen/", "WSAlmacenPort"), WSAlmacen.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSALMACEN_EXCEPTION!= null) {
            throw WSALMACEN_EXCEPTION;
        }
        return WSALMACEN_WSDL_LOCATION;
    }

}
