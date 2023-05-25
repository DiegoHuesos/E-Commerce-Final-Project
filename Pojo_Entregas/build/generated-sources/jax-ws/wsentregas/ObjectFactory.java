
package wsentregas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsentregas package. 
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

    private final static QName _Edit_QNAME = new QName("http://wsentregas/", "edit");
    private final static QName _FindRange_QNAME = new QName("http://wsentregas/", "findRange");
    private final static QName _Count_QNAME = new QName("http://wsentregas/", "count");
    private final static QName _CountResponse_QNAME = new QName("http://wsentregas/", "countResponse");
    private final static QName _FindResponse_QNAME = new QName("http://wsentregas/", "findResponse");
    private final static QName _FindAll_QNAME = new QName("http://wsentregas/", "findAll");
    private final static QName _Remove_QNAME = new QName("http://wsentregas/", "remove");
    private final static QName _Envio_QNAME = new QName("http://wsentregas/", "envio");
    private final static QName _FindRangeResponse_QNAME = new QName("http://wsentregas/", "findRangeResponse");
    private final static QName _CrearEnvio_QNAME = new QName("http://wsentregas/", "crearEnvio");
    private final static QName _Find_QNAME = new QName("http://wsentregas/", "find");
    private final static QName _Create_QNAME = new QName("http://wsentregas/", "create");
    private final static QName _FindAllResponse_QNAME = new QName("http://wsentregas/", "findAllResponse");
    private final static QName _CrearEnvioResponse_QNAME = new QName("http://wsentregas/", "crearEnvioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsentregas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link FindRange }
     * 
     */
    public FindRange createFindRange() {
        return new FindRange();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link Envio }
     * 
     */
    public Envio createEnvio() {
        return new Envio();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link CrearEnvio }
     * 
     */
    public CrearEnvio createCrearEnvio() {
        return new CrearEnvio();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link CrearEnvioResponse }
     * 
     */
    public CrearEnvioResponse createCrearEnvioResponse() {
        return new CrearEnvioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Envio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "envio")
    public JAXBElement<Envio> createEnvio(Envio value) {
        return new JAXBElement<Envio>(_Envio_QNAME, Envio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEnvio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "crearEnvio")
    public JAXBElement<CrearEnvio> createCrearEnvio(CrearEnvio value) {
        return new JAXBElement<CrearEnvio>(_CrearEnvio_QNAME, CrearEnvio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEnvioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsentregas/", name = "crearEnvioResponse")
    public JAXBElement<CrearEnvioResponse> createCrearEnvioResponse(CrearEnvioResponse value) {
        return new JAXBElement<CrearEnvioResponse>(_CrearEnvioResponse_QNAME, CrearEnvioResponse.class, null, value);
    }

}
