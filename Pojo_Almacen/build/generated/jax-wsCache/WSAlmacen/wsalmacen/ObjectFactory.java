
package wsalmacen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsalmacen package. 
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

    private final static QName _RestarLibros_QNAME = new QName("http://wsalmacen/", "restarLibros");
    private final static QName _FindRange_QNAME = new QName("http://wsalmacen/", "findRange");
    private final static QName _Edit_QNAME = new QName("http://wsalmacen/", "edit");
    private final static QName _CountResponse_QNAME = new QName("http://wsalmacen/", "countResponse");
    private final static QName _FindResponse_QNAME = new QName("http://wsalmacen/", "findResponse");
    private final static QName _Count_QNAME = new QName("http://wsalmacen/", "count");
    private final static QName _Remove_QNAME = new QName("http://wsalmacen/", "remove");
    private final static QName _GetCantidad_QNAME = new QName("http://wsalmacen/", "getCantidad");
    private final static QName _RestarLibrosResponse_QNAME = new QName("http://wsalmacen/", "restarLibrosResponse");
    private final static QName _FindAll_QNAME = new QName("http://wsalmacen/", "findAll");
    private final static QName _FindRangeResponse_QNAME = new QName("http://wsalmacen/", "findRangeResponse");
    private final static QName _Libros_QNAME = new QName("http://wsalmacen/", "libros");
    private final static QName _Find_QNAME = new QName("http://wsalmacen/", "find");
    private final static QName _GetCantidadResponse_QNAME = new QName("http://wsalmacen/", "getCantidadResponse");
    private final static QName _FindAllResponse_QNAME = new QName("http://wsalmacen/", "findAllResponse");
    private final static QName _Create_QNAME = new QName("http://wsalmacen/", "create");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsalmacen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RestarLibros }
     * 
     */
    public RestarLibros createRestarLibros() {
        return new RestarLibros();
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
     * Create an instance of {@link GetCantidad }
     * 
     */
    public GetCantidad createGetCantidad() {
        return new GetCantidad();
    }

    /**
     * Create an instance of {@link RestarLibrosResponse }
     * 
     */
    public RestarLibrosResponse createRestarLibrosResponse() {
        return new RestarLibrosResponse();
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
     * Create an instance of {@link Libros }
     * 
     */
    public Libros createLibros() {
        return new Libros();
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
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link GetCantidadResponse }
     * 
     */
    public GetCantidadResponse createGetCantidadResponse() {
        return new GetCantidadResponse();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarLibros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "restarLibros")
    public JAXBElement<RestarLibros> createRestarLibros(RestarLibros value) {
        return new JAXBElement<RestarLibros>(_RestarLibros_QNAME, RestarLibros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCantidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "getCantidad")
    public JAXBElement<GetCantidad> createGetCantidad(GetCantidad value) {
        return new JAXBElement<GetCantidad>(_GetCantidad_QNAME, GetCantidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarLibrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "restarLibrosResponse")
    public JAXBElement<RestarLibrosResponse> createRestarLibrosResponse(RestarLibrosResponse value) {
        return new JAXBElement<RestarLibrosResponse>(_RestarLibrosResponse_QNAME, RestarLibrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Libros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "libros")
    public JAXBElement<Libros> createLibros(Libros value) {
        return new JAXBElement<Libros>(_Libros_QNAME, Libros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCantidadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "getCantidadResponse")
    public JAXBElement<GetCantidadResponse> createGetCantidadResponse(GetCantidadResponse value) {
        return new JAXBElement<GetCantidadResponse>(_GetCantidadResponse_QNAME, GetCantidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsalmacen/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

}
