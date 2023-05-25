/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadas;

import entidades.Libros;
import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author sdist
 */
@Stateless
public class LibrosFacade extends AbstractFacade<Libros> {
    
    @PersistenceContext(unitName = "WAAlmacenPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public int findCantidadByISBN(String isbn) {
        try {
            Query query = em.createNamedQuery("Libros.findMontoByIsbn");
            query.setParameter("isbn", isbn);
    //        Integer cant = (Integer) query.getSingleResult();
    //        return (Double) (cant * 1.0); 
            return (int) (query.getSingleResult());
        } catch (Exception e) {
            System.out.println(e);
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
    
    public double restarCantidadLibros(String isbn, int cantidad) {
        try {
            
            Query query = em.createNamedQuery("Libros.findMontoByIsbn");
            query.setParameter("isbn", isbn);
            int restantes = (int) (query.getSingleResult());
            
            if(restantes >= cantidad) {
                String strQuery = "UPDATE Libros l set l.cantidad = l.cantidad - " + cantidad + " WHERE l.isbn = '" + isbn + "'";
                em = getEntityManager();
                Query query2 = em.createQuery(strQuery);
                int status = query2.executeUpdate();
                
                double precio = getPrecioDeISBN(isbn);
                if ((status != 1) || (precio == -1)) {
                    return -1;
                } else {
                    return precio * cantidad;
                }
            } else {
                return -1;
            }
            
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    public LibrosFacade() {
        super(Libros.class);
    }

}
