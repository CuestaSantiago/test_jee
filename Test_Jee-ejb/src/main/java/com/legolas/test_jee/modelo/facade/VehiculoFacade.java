/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.legolas.test_jee.modelo.facade;

import com.legolas.test_jee.modelo.Vehiculo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Legolas
 */
@Stateless
public class VehiculoFacade extends AbstractFacade<Vehiculo> {

    @PersistenceContext(unitName = "com.legolas.test_jee_Test_Jee-ejb_ejb_1.0.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehiculoFacade() {
        super(Vehiculo.class);
    }
    
    public Vehiculo obetener(String placa) throws Exception {
        Vehiculo vehiculo = new Vehiculo();
        try {
            vehiculo = em.createQuery("select v FROM Vehiculo v WHERE v.placa :placa ", Vehiculo.class)
                    .setParameter("admin", placa)
                    .getSingleResult();
        } catch (Exception e) {
//            LOG.log(Level.SEVERE, "AsignacionperfilFacade: Error al consultar asignaciones: {0}", new Object[]{e.toString()});
//            throw new ServiceException("Se ha producido un error en el servidor", Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
        }
        return vehiculo;
    }
    
}
