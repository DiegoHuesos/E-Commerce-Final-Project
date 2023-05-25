/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsalmacen;

import entidades.Libros;
import fachadas.LibrosFacade;
import fachadas.FacturaFacade;
import fachadas.ListalibrosFacade;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author sdist
 */
@WebService(serviceName = "WSAlmacen")
public class WSAlmacen {
    
    

    @EJB
    private LibrosFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Libros entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Libros entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Libros entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Libros find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Libros> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Libros> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    /**
     * Web service operation
     */
    
    
    @WebMethod(operationName = "getCantidad")
    public int getCantidad(@WebParam(name = "isbn") String isbn) {
        return ejbRef.findCantidadByISBN(isbn);
    }
    
    public double getPrecio(@WebParam(name = "isbn") String isbn) {
        return ejbRef.getPrecioDeISBN(isbn);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "restarLibros")
    public double restarLibros(@WebParam(name = "isbn") String isbn, @WebParam(name = "cantidad") int cantidad) {
        return ejbRef.restarCantidadLibros(isbn, cantidad);
    }

    @WebMethod(operationName = "restarListaLibros")
    public Collection<Pedido> restarListaLibros(@WebParam(name = "parameter") Collection<Pedido> listaPedidos) {
        double res;
        Collection<Pedido> resp = new ArrayList<>();
        for(Pedido p : listaPedidos){
            res = restarLibros(p.isbn, p.cantidad);
            if(res > 0){
                resp.add(new Pedido(p.isbn, p.cantidad));
            }
        }
        return resp;
    }
    
    @WebMethod(operationName = "regresaLibros")
    public void regresaLibros(@WebParam(name = "parameter") Collection<Pedido> listaPedidos) {
        for(Pedido p : listaPedidos){
            restarLibros(p.isbn, -p.cantidad);
        }
    }
    
    @WebMethod(operationName = "calculaMontoTotal")
    public Double calculaMontoTotal(@WebParam(name = "parameter") Collection<Pedido> listaPedidos) {
        //TODO write your implementation code here:
        double monto = 0;
        for(Pedido p : listaPedidos){
            monto += getPrecio(p.isbn)*p.cantidad;
        }
        return monto;
    }
}
