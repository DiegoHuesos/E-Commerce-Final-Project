
package TiendaOnlineCA;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PedidoLibrosPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/TiendaOnline3/src/PedidoLibros")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PedidoLibrosPortType {


    /**
     * 
     * @param part1
     * @return
     *     returns TiendaOnlineCA.Respuesta
     */
    @WebMethod(operationName = "PedidoLibrosOperation")
    @WebResult(name = "RespuestaElement", targetNamespace = "http://xml.netbeans.org/schema/TiendaOnlineXML", partName = "part1")
    public Respuesta pedidoLibrosOperation(
        @WebParam(name = "InputElement", targetNamespace = "http://xml.netbeans.org/schema/TiendaOnlineXML", partName = "part1")
        PedidoInput part1);

}
