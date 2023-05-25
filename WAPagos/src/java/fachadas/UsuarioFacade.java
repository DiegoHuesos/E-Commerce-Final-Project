/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadas;

import entidades.Usuario;
import entidades.Libros;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author sdist
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "WAPagosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    /**
     * Método para validar que un número de tarjeta sí esté registrada y relacionada con unu usuario y el id del usuario
     * @param numTarjeta
     * @return userId
     */
    public int checkUsuario(String numTarjeta) {
//        SELECT u.id FROM Usuario u WHERE u.numtarjeta = '12345'
        try {
            String strQuery = "SELECT u.id FROM Usuario u WHERE u.numtarjeta = '" + numTarjeta + "'";
            em = getEntityManager();
            Query query = em.createQuery(strQuery);
            return (int) (query.getSingleResult());
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }

    }
    
    public int checkCreditScore(String numTarjeta) {
        try {
            String strQuery = "SELECT u.puntajecrediticio FROM Usuario u WHERE u.numtarjeta = '" + numTarjeta + "'";
            em = getEntityManager();
            Query query = em.createQuery(strQuery);
            return (int) (query.getSingleResult());
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
    
    /*
    String strQuery = "SELECT u.saldo FROM Usuario u WHERE u.numtarjeta = '" + numTarjeta + "'";
        em = getEntityManager();
        Query query = em.createQuery(strQuery);
        return (double) (query.getSingleResult());
    */
    public double getSaldo(String numTarjeta){
        try {
            String strQuery = "SELECT u.saldo FROM Usuario u WHERE u.numtarjeta = '" + numTarjeta + "'";
            em = getEntityManager();
            Query query = em.createQuery(strQuery);
            BigDecimal bd =  (BigDecimal) (query.getSingleResult()); 
            return bd.doubleValue();
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
        
    /**
     * Resta el monto dado a un número de tarjeta específica
     * No valida que el monto sea mayor al saldo, esa tarea se la deja al WSPago
     * @param monto
     * @param numTarjeta
     * @return boolean exito
     */
    public boolean restarSaldo(double monto, String numTarjeta) {
        try{
            // "UPDATE  table_name\n SET     field_name = GREATEST(0, field_name - $subtract_value)\n WHERE   id = $row_id";
            
            // Me pasas id factura, num tarjeta y restas saldos de esta factura
            String strQuery = "UPDATE Usuario u SET  u.saldo = (u.saldo - " + Double.toString(monto)  + ") WHERE u.numtarjeta = " + numTarjeta;
            em = getEntityManager();
            Query query = em.createQuery(strQuery);
            int status = query.executeUpdate();

            return status == 1;
        } catch(Exception ex){
            System.out.println("Error restarSaldo:  " + ex.getMessage());
            return false;
        }
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public int next_id_factura() {
        em = getEntityManager();
        int intRes = (int) em.createNativeQuery("VALUES (NEXT VALUE FOR ID_FACTURA)").getSingleResult();
        Logger.getAnonymousLogger().log(Level.SEVERE,"El valor del folio de pedidos es:" + intRes);
        return intRes;
    }
    
    public int getIdFactura(String fecha) {
        try {
            String strQuery = "SELECT f.id FROM Factura f WHERE f.fecha = '" + fecha + "'";
            em = getEntityManager();
            Query query = em.createQuery(strQuery);
            return (int) (query.getSingleResult());
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
    
    public int crearFactura(String numTarjeta) {

        try{
            String strQuery;
            em = getEntityManager();
            Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
            String currentDateAsStr = currentTimestamp.toString();
            
            int creditScore = checkCreditScore(numTarjeta);
            double descuento = 0.0;
            if (creditScore < 600) {
                descuento = 0.0;
            } else if (creditScore < 700) {
                descuento = 25.0;
            } else if (creditScore <= 800) {
                descuento = 50.0;
            }
            
            strQuery = "INSERT INTO Factura (montoTotal, fecha, numTarjeta, descuento) values ( 0 ,'" + currentDateAsStr + "', '" + numTarjeta +  "', " + descuento +  ")";
            int insertedRows = em.createNativeQuery(strQuery).executeUpdate();
            System.out.println("INSERTED ROWS: " + insertedRows);
            
            int idFactura = getIdFactura(currentDateAsStr);
            return idFactura;

        }catch(Exception ex){
            return -1;
        }
    }
    
    public double getPrecioDeISBN(String isbn) {
        try {
            String strQuery = "SELECT l.precio FROM Libros l WHERE l.isbn = '" + isbn + "'";
            em = getEntityManager();
            Query query = em.createQuery(strQuery);
            BigDecimal bd =  (BigDecimal) (query.getSingleResult()); 
            return bd.doubleValue();
            
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
    
    public boolean insertarListaLibros(String isbn, int cantidad, int idFactura) {
        try{
            String insertQuery = "INSERT INTO ListaLibros (isbn, cantidad, factura_id) VALUES ('" + isbn + "', " + cantidad + ", " + idFactura + ")";
            int insertedRows = em.createNativeQuery(insertQuery).executeUpdate();
            System.out.println("INSERTED ROWS LISTA LIBROS: " + insertedRows);    
            return true;

        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean vincularLibro(int idFactura, int cantidad, String isbn) {

        try{
            double precio = getPrecioDeISBN(isbn);
            if (precio == -1)
                return false;
            
            double montoTotal = precio * cantidad;
            String updateQuery = "UPDATE Factura f SET f.montototal = f.montototal + " + montoTotal + " WHERE f.id = " + idFactura;
            em = getEntityManager();
            Query query = em.createQuery(updateQuery);
            int status = query.executeUpdate();

            if (status != 1)
                return false;
            
            return insertarListaLibros(isbn, cantidad, idFactura);
            
        } catch(Exception ex){
            System.out.println("Error restarSaldo:  " + ex.getMessage());
            return false;
        }
    }
    
}
