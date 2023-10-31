/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.legolas.test_jee.servicio_rest;

import javax.enterprise.context.RequestScoped;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.jws.WebParam;
import com.legolas.test_jee.modelo.Vehiculo;

/**
 *
 * @author Legolas
 */
@Path("vehiculo")
@RequestScoped
public class VehiculoServicio {

  

    /**
     * This is a sample web service operation
     */
    @GET
    @Path("obtener")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public String hello() {
        return "Hello mundo !";
    }
    
    
}
