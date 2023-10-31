/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.legolas.test_jee.bean;

import com.legolas.test_jee.modelo.Vehiculo;
import com.legolas.test_jee.servicio.VehiculoServicio;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Legolas
 */
@Named(value = "vehiculoBean")
@ViewScoped
public class VehiculoBean {

    @Inject
    private VehiculoServicio vehiculoServicio;

    private Vehiculo vehiculo;
    private List<String> modelos;

    /**
     * Creates a new instance of VehiculoBean
     */
    public VehiculoBean() {
        vehiculo = new Vehiculo();
    }

    @PostConstruct
    public void init() {

        modelos = getModelos();
    }

    public void guardar() throws Exception {
        if (vehiculoServicio.crear(vehiculo)) {
            // Éxito al crear el vehículo
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Vehículo creado con éxito"));
            limpiarCampos(); // Limpia los campos después de guardar
        } else {
            // Fallo al crear el vehículo
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No se pudo crear el vehículo"));
        }

    }

    private void limpiarCampos() {
        // Puedes reiniciar el objeto vehiculo o limpiar los campos uno por uno según tu requerimiento
        vehiculo = new Vehiculo();
    }

    public List<String> getModelos() {
        return Arrays.asList("Chevrolet", "Ford", "Toyota", "Mazda");
    }

    public VehiculoServicio getVehiculoServicio() {
        return vehiculoServicio;
    }

    public void setVehiculoServicio(VehiculoServicio vehiculoServicio) {
        this.vehiculoServicio = vehiculoServicio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
