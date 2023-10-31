/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.legolas.test_jee.servicio;

import com.legolas.test_jee.modelo.facade.VehiculoFacade;
import com.legolas.test_jee.modelo.Vehiculo;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Legolas
 */
@Stateless
@LocalBean
public class VehiculoServicio {
    
    @EJB
    VehiculoFacade vehiculoFacade;
    
    public boolean crear(Vehiculo vehiculo) throws Exception {
        boolean asignacion = false;
        
        try {
            if (vehiculoFacade.find(vehiculo) == null) {
                vehiculoFacade.create(vehiculo);
                asignacion = true;
//                LOG.log(Level.SEVERE, "AsignacionPerfilServicio: asignacon creado exitosamente");
            }
        } catch (Exception e) {
//            LOG.log(Level.SEVERE, "AsignacionPerfilServicio: Error get all users: {0}", asignacion);
//            LOG.log(Level.SEVERE, "", e);
//            throw new ServiceException("Se ha producido un error en el servidor", Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
        }
        return asignacion;
    }
    
}
