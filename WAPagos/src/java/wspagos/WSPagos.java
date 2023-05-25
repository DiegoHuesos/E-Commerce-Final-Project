/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wspagos;

import entidades.Usuario;
import entidades.Factura;
import fachadas.UsuarioFacade;
import fachadas.FacturaFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Random;

/**
 *
 * @author sdist
 */
@WebService(serviceName = "WSPagos")
public class WSPagos {

    @EJB
    private UsuarioFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Usuario entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Usuario entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Usuario entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Usuario find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Usuario> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Usuario> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validarUsuario")
    public Integer validarUsuario(@WebParam(name = "numTarjeta") String numTarjeta) {
        return ejbRef.checkUsuario(numTarjeta);
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "restarSaldo")
    public int restarSaldo(@WebParam(name = "monto") Double monto, @WebParam(name = "numTarjeta") String numTarjeta) {
        double saldo = ejbRef.getSaldo(numTarjeta);
        if (monto > saldo) {
            return -1;
        } else {
            if (ejbRef.restarSaldo(monto, numTarjeta)) {
                return 1;
            } else {
                return -1;   
            }
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "checkMonto")
    public Integer checkMonto(@WebParam(name = "monto") double monto, @WebParam(name = "numTarjeta") String numTarjeta) {
        double saldo = ejbRef.getSaldo(numTarjeta);
        if (saldo == -1) {
            return -2;
        } else if (monto > saldo) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearFactura")
    public Integer crearFactura(@WebParam(name = "numTarjeta") String numTarjeta) {
        int idFactura = ejbRef.crearFactura(numTarjeta);
        return idFactura;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "vincularLibro")
    public Boolean vincularLibro(@WebParam(name = "idFactura") int idFactura, @WebParam(name = "cantidad") int cantidad, @WebParam(name = "isbn") String isbn) {
        boolean libroVinculado = ejbRef.vincularLibro(idFactura, cantidad, isbn);
        return libroVinculado;
    }
}
