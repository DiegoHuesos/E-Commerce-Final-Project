/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadas;

import entidades.Factura;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sdist
 */
@Stateless
public class FacturaFacade extends AbstractFacade<Factura> {

    @PersistenceContext(unitName = "WAPagosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }    

    public FacturaFacade() {
        super(Factura.class);
    }
    
}
