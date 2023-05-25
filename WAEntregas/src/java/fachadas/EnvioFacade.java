/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadas;

import entidades.Envio;
import entidades.Factura;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Random;
import javax.persistence.Query;

/**
 *
 * @author sdist
 */
@Stateless
public class EnvioFacade extends AbstractFacade<Envio> {

    @PersistenceContext(unitName = "WAEntregasPU")
    private EntityManager em;
    

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
//            try {
//            String strQuery = "UPDATE Libros l set l.cantidad = l.cantidad - " + cantidad + " WHERE l.isbn = '" + isbn + "'";
//            em = getEntityManager();
//            Query query = em.createQuery(strQuery);
//            int status = query.executeUpdate();
//            return status;
//        } catch (Exception e) {
//            System.out.println(e);
//            return -1;
    
    public String crearEnvio(int idFactura) {
        try {
            
            Random rand = new Random();
            int diasAEntrega = rand.nextInt(30);
            String nombrePaqueteria = "DHL";
            String strQuery;
            
            em = getEntityManager();
            
            // EXISTE idFactura?
            String checkIdFacturaQuery = "SELECT f.id FROM Factura f WHERE f.id = " + idFactura;
            Query checkQuery = em.createQuery(checkIdFacturaQuery);
            int id = (int) (checkQuery.getSingleResult());
            
            //Ya esta en la tabla de Entregas?
            strQuery = "SELECT COUNT(e.idfactura) FROM Envio e WHERE e.idfactura = " + idFactura;
            Query isQuery = em.createQuery(strQuery);
            Long count = (Long) isQuery.getSingleResult();
            String info;
            
            if (count > 0) {
                info = "YAESTA";
            } else {
                strQuery = "INSERT INTO Envio (idFactura, nombrePaqueteria, diasAEntrega) values (" + idFactura +  ", '" + nombrePaqueteria +  "', " + diasAEntrega +  ")";
                int insertedRows = em.createNativeQuery(strQuery).executeUpdate();
                System.out.println("INSERTED ROWS: " + insertedRows);
                info = "ID de Factura: " + idFactura + "\nNombre de Paquetería: " + nombrePaqueteria + "\nTus libros se entregarán en " + diasAEntrega + " días!";
            }
            return info;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "NOEXISTE";
        }
    }

    public EnvioFacade() {
        super(Envio.class);
    }
    
}
