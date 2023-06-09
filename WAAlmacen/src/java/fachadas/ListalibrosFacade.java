/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadas;

import entidades.Listalibros;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sdist
 */
@Stateless
public class ListalibrosFacade extends AbstractFacade<Listalibros> {

    @PersistenceContext(unitName = "WAAlmacenPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ListalibrosFacade() {
        super(Listalibros.class);
    }
    
}
