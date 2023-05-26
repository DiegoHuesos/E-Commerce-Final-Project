
package pojo_pagos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pojo_pagos package. 
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

    private final static QName _Find_QNAME = new QName("http://wspagos/", "find");
    private final static QName _RestarSaldoResponse_QNAME = new QName("http://wspagos/", "restarSaldoResponse");
    private final static QName _FindRangeResponse_QNAME = new QName("http://wspagos/", "findRangeResponse");
    private final static QName _ValidarUsuarioResponse_QNAME = new QName("http://wspagos/", "validarUsuarioResponse");
    private final static QName _CrearFacturaResponse_QNAME = new QName("http://wspagos/", "crearFacturaResponse");
    private final static QName _ValidarUsuario_QNAME = new QName("http://wspagos/", "validarUsuario");
    private final static QName _CheckMontoResponse_QNAME = new QName("http://wspagos/", "checkMontoResponse");
    private final static QName _RestarSaldo_QNAME = new QName("http://wspagos/", "restarSaldo");
    private final static QName _Usuario_QNAME = new QName("http://wspagos/", "usuario");
    private final static QName _FindAllResponse_QNAME = new QName("http://wspagos/", "findAllResponse");
    private final static QName _Create_QNAME = new QName("http://wspagos/", "create");
    private final static QName _FindRange_QNAME = new QName("http://wspagos/", "findRange");
    private final static QName _CheckMonto_QNAME = new QName("http://wspagos/", "checkMonto");
    private final static QName _Edit_QNAME = new QName("http://wspagos/", "edit");
    private final static QName _VincularLibroResponse_QNAME = new QName("http://wspagos/", "vincularLibroResponse");
    private final static QName _Remove_QNAME = new QName("http://wspagos/", "remove");
    private final static QName _CrearFactura_QNAME = new QName("http://wspagos/", "crearFactura");
    private final static QName _FindAll_QNAME = new QName("http://wspagos/", "findAll");
    private final static QName _CountResponse_QNAME = new QName("http://wspagos/", "countResponse");
    private final static QName _FindResponse_QNAME = new QName("http://wspagos/", "findResponse");
    private final static QName _VincularLibro_QNAME = new QName("http://wspagos/", "vincularLibro");
    private final static QName _Count_QNAME = new QName("http://wspagos/", "count");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pojo_pagos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckMonto }
     * 
     */
    public CheckMonto createCheckMonto() {
        return new CheckMonto();
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link VincularLibroResponse }
     * 
     */
    public VincularLibroResponse createVincularLibroResponse() {
        return new VincularLibroResponse();
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
     * Create an instance of {@link VincularLibro }
     * 
     */
    public VincularLibro createVincularLibro() {
        return new VincularLibro();
    }

    /**
     * Create an instance of {@link CrearFactura }
     * 
     */
    public CrearFactura createCrearFactura() {
        return new CrearFactura();
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
     * Create an instance of {@link CrearFacturaResponse }
     * 
     */
    public CrearFacturaResponse createCrearFacturaResponse() {
        return new CrearFacturaResponse();
    }

    /**
     * Create an instance of {@link ValidarUsuario }
     * 
     */
    public ValidarUsuario createValidarUsuario() {
        return new ValidarUsuario();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link ValidarUsuarioResponse }
     * 
     */
    public ValidarUsuarioResponse createValidarUsuarioResponse() {
        return new ValidarUsuarioResponse();
    }

    /**
     * Create an instance of {@link RestarSaldoResponse }
     * 
     */
    public RestarSaldoResponse createRestarSaldoResponse() {
        return new RestarSaldoResponse();
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
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link CheckMontoResponse }
     * 
     */
    public CheckMontoResponse createCheckMontoResponse() {
        return new CheckMontoResponse();
    }

    /**
     * Create an instance of {@link RestarSaldo }
     * 
     */
    public RestarSaldo createRestarSaldo() {
        return new RestarSaldo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarSaldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "restarSaldoResponse")
    public JAXBElement<RestarSaldoResponse> createRestarSaldoResponse(RestarSaldoResponse value) {
        return new JAXBElement<RestarSaldoResponse>(_RestarSaldoResponse_QNAME, RestarSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "validarUsuarioResponse")
    public JAXBElement<ValidarUsuarioResponse> createValidarUsuarioResponse(ValidarUsuarioResponse value) {
        return new JAXBElement<ValidarUsuarioResponse>(_ValidarUsuarioResponse_QNAME, ValidarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearFacturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "crearFacturaResponse")
    public JAXBElement<CrearFacturaResponse> createCrearFacturaResponse(CrearFacturaResponse value) {
        return new JAXBElement<CrearFacturaResponse>(_CrearFacturaResponse_QNAME, CrearFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "validarUsuario")
    public JAXBElement<ValidarUsuario> createValidarUsuario(ValidarUsuario value) {
        return new JAXBElement<ValidarUsuario>(_ValidarUsuario_QNAME, ValidarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMontoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "checkMontoResponse")
    public JAXBElement<CheckMontoResponse> createCheckMontoResponse(CheckMontoResponse value) {
        return new JAXBElement<CheckMontoResponse>(_CheckMontoResponse_QNAME, CheckMontoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarSaldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "restarSaldo")
    public JAXBElement<RestarSaldo> createRestarSaldo(RestarSaldo value) {
        return new JAXBElement<RestarSaldo>(_RestarSaldo_QNAME, RestarSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMonto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "checkMonto")
    public JAXBElement<CheckMonto> createCheckMonto(CheckMonto value) {
        return new JAXBElement<CheckMonto>(_CheckMonto_QNAME, CheckMonto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VincularLibroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "vincularLibroResponse")
    public JAXBElement<VincularLibroResponse> createVincularLibroResponse(VincularLibroResponse value) {
        return new JAXBElement<VincularLibroResponse>(_VincularLibroResponse_QNAME, VincularLibroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearFactura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "crearFactura")
    public JAXBElement<CrearFactura> createCrearFactura(CrearFactura value) {
        return new JAXBElement<CrearFactura>(_CrearFactura_QNAME, CrearFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VincularLibro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "vincularLibro")
    public JAXBElement<VincularLibro> createVincularLibro(VincularLibro value) {
        return new JAXBElement<VincularLibro>(_VincularLibro_QNAME, VincularLibro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wspagos/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

}
