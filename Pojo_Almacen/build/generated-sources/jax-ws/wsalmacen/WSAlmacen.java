
package wsalmacen;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSAlmacen", targetNamespace = "http://wsalmacen/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSAlmacen {


    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "remove", targetNamespace = "http://wsalmacen/", className = "wsalmacen.Remove")
    @Action(input = "http://wsalmacen/WSAlmacen/remove")
    public void remove(
        @WebParam(name = "entity", targetNamespace = "")
        Libros entity);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "count", targetNamespace = "http://wsalmacen/", className = "wsalmacen.Count")
    @ResponseWrapper(localName = "countResponse", targetNamespace = "http://wsalmacen/", className = "wsalmacen.CountResponse")
    @Action(input = "http://wsalmacen/WSAlmacen/countRequest", output = "http://wsalmacen/WSAlmacen/countResponse")
    public int count();

    /**
     * 
     * @param id
     * @return
     *     returns wsalmacen.Libros
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find", targetNamespace = "http://wsalmacen/", className = "wsalmacen.Find")
    @ResponseWrapper(localName = "findResponse", targetNamespace = "http://wsalmacen/", className = "wsalmacen.FindResponse")
    @Action(input = "http://wsalmacen/WSAlmacen/findRequest", output = "http://wsalmacen/WSAlmacen/findResponse")
    public Libros find(
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "create", targetNamespace = "http://wsalmacen/", className = "wsalmacen.Create")
    @Action(input = "http://wsalmacen/WSAlmacen/create")
    public void create(
        @WebParam(name = "entity", targetNamespace = "")
        Libros entity);

    /**
     * 
     * @return
     *     returns java.util.List<wsalmacen.Libros>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://wsalmacen/", className = "wsalmacen.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://wsalmacen/", className = "wsalmacen.FindAllResponse")
    @Action(input = "http://wsalmacen/WSAlmacen/findAllRequest", output = "http://wsalmacen/WSAlmacen/findAllResponse")
    public List<Libros> findAll();

    /**
     * 
     * @param range
     * @return
     *     returns java.util.List<wsalmacen.Libros>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findRange", targetNamespace = "http://wsalmacen/", className = "wsalmacen.FindRange")
    @ResponseWrapper(localName = "findRangeResponse", targetNamespace = "http://wsalmacen/", className = "wsalmacen.FindRangeResponse")
    @Action(input = "http://wsalmacen/WSAlmacen/findRangeRequest", output = "http://wsalmacen/WSAlmacen/findRangeResponse")
    public List<Libros> findRange(
        @WebParam(name = "range", targetNamespace = "")
        List<Integer> range);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "edit", targetNamespace = "http://wsalmacen/", className = "wsalmacen.Edit")
    @Action(input = "http://wsalmacen/WSAlmacen/edit")
    public void edit(
        @WebParam(name = "entity", targetNamespace = "")
        Libros entity);

    /**
     * 
     * @param isbn
     * @param cantidad
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "restarLibros", targetNamespace = "http://wsalmacen/", className = "wsalmacen.RestarLibros")
    @ResponseWrapper(localName = "restarLibrosResponse", targetNamespace = "http://wsalmacen/", className = "wsalmacen.RestarLibrosResponse")
    @Action(input = "http://wsalmacen/WSAlmacen/restarLibrosRequest", output = "http://wsalmacen/WSAlmacen/restarLibrosResponse")
    public int restarLibros(
        @WebParam(name = "isbn", targetNamespace = "")
        String isbn,
        @WebParam(name = "cantidad", targetNamespace = "")
        int cantidad);

    /**
     * 
     * @param isbn
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCantidad", targetNamespace = "http://wsalmacen/", className = "wsalmacen.GetCantidad")
    @ResponseWrapper(localName = "getCantidadResponse", targetNamespace = "http://wsalmacen/", className = "wsalmacen.GetCantidadResponse")
    @Action(input = "http://wsalmacen/WSAlmacen/getCantidadRequest", output = "http://wsalmacen/WSAlmacen/getCantidadResponse")
    public int getCantidad(
        @WebParam(name = "isbn", targetNamespace = "")
        String isbn);

}