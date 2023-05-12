/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadas;

import entidades.Usuario;
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
        String strQuery = "SELECT u.id FROM Usuario u WHERE u.numtarjeta = '" + numTarjeta + "'";
        em = getEntityManager();
        Query query = em.createQuery(strQuery);
        return (int) (query.getSingleResult());
    }
    
    
    /*
    String strQuery = "SELECT u.saldo FROM Usuario u WHERE u.numtarjeta = '" + numTarjeta + "'";
        em = getEntityManager();
        Query query = em.createQuery(strQuery);
        return (double) (query.getSingleResult());
    */
    public double getSaldo(String numTarjeta){
        String strQuery = "SELECT u.saldo FROM Usuario u WHERE u.numtarjeta = '" + numTarjeta + "'";
        em = getEntityManager();
        Query query = em.createQuery(strQuery);
        BigDecimal bd =  (BigDecimal) (query.getSingleResult()); 
        return bd.doubleValue();
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
            String strQuery = "UPDATE Usuario u SET  u.saldo = (u.saldo - " + Double.toString(monto)  + ") WHERE u.numtarjeta = " + numTarjeta;
            em = getEntityManager();
            Query query = em.createQuery(strQuery);
            return true;
        }catch(Exception ex){
            System.out.println("Error restarSaldo:  " + ex.getMessage());
            return false;
        }
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
}
