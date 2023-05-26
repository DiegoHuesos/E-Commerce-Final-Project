
package TiendaOnlineCA;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the TiendaOnlineCA package. 
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

    private final static QName _RespuestaElement_QNAME = new QName("http://xml.netbeans.org/schema/TiendaOnlineXML", "RespuestaElement");
    private final static QName _InputElement_QNAME = new QName("http://xml.netbeans.org/schema/TiendaOnlineXML", "InputElement");
    private final static QName _ListaEnterosElement_QNAME = new QName("http://xml.netbeans.org/schema/TiendaOnlineXML", "ListaEnterosElement");
    private final static QName _ListaLibrosElement_QNAME = new QName("http://xml.netbeans.org/schema/TiendaOnlineXML", "ListaLibrosElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: TiendaOnlineCA
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link ListaEnteros }
     * 
     */
    public ListaEnteros createListaEnteros() {
        return new ListaEnteros();
    }

    /**
     * Create an instance of {@link Respuesta }
     * 
     */
    public Respuesta createRespuesta() {
        return new Respuesta();
    }

    /**
     * Create an instance of {@link PedidoInput }
     * 
     */
    public PedidoInput createPedidoInput() {
        return new PedidoInput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/TiendaOnlineXML", name = "RespuestaElement")
    public JAXBElement<Respuesta> createRespuestaElement(Respuesta value) {
        return new JAXBElement<Respuesta>(_RespuestaElement_QNAME, Respuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidoInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/TiendaOnlineXML", name = "InputElement")
    public JAXBElement<PedidoInput> createInputElement(PedidoInput value) {
        return new JAXBElement<PedidoInput>(_InputElement_QNAME, PedidoInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaEnteros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/TiendaOnlineXML", name = "ListaEnterosElement")
    public JAXBElement<ListaEnteros> createListaEnterosElement(ListaEnteros value) {
        return new JAXBElement<ListaEnteros>(_ListaEnterosElement_QNAME, ListaEnteros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/TiendaOnlineXML", name = "ListaLibrosElement")
    public JAXBElement<Pedido> createListaLibrosElement(Pedido value) {
        return new JAXBElement<Pedido>(_ListaLibrosElement_QNAME, Pedido.class, null, value);
    }

}
