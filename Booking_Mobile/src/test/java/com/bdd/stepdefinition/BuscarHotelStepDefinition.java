package com.bdd.stepdefinition;

import com.bdd.view.BuscarHotelView;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class BuscarHotelStepDefinition {

    private BuscarHotelView buscarHotelView(){
        return new BuscarHotelView();
    }

    @Given("ingreso a la aplicación Booking")
    public void ingreso_a_la_aplicación_booking() throws MalformedURLException {
        BuscarHotelView.setAndroidDriver();
    }

    @When("dpy clic a buscador")
    public void dpy_clic_a_buscador() {
        buscarHotelView().clicBuscador();
    }

    @When("escribo el {string}")
    public void escribo_el(String destino) {
        buscarHotelView().escribirDestino(destino);
    }

    @When("selecciono la fecha de estadia")
    public void selecciono_la_fecha_de_estadia() {
        buscarHotelView().seleccionarFecha();
    }

    @When("selecciono la cantidad de personas")
    public void selecciono_la_cantidad_de_personas() {
        buscarHotelView().seleccionarPasajeros();

    }

    @When("realizo la busqueda")
    public void realizo_la_busqueda() {
        buscarHotelView().busquedaHospedaje();
    }

    @Then("valido que se muestre las opciones de hospedaje")
    public void valido_que_se_muestre_las_opciones_de_hospedaje() {

    }

    @Given("selecciono el segundo hospedaje")
    public void selecciono_el_segundo_hospedaje() {
        buscarHotelView().clicHotel();
    }

    @When("selecciono la habitación")
    public void selecciono_la_habitación() {
        buscarHotelView().seleccionaHabitacion();
    }

    @When("selecciono el tipo de habitación")
    public void selecciono_el_tipo_de_habitación() {
        buscarHotelView().seleccionaTipoHabitacion();
    }

    @When("selecciono reservar")
    public void selecciono_reservar() {
        buscarHotelView().seleccionaReserva();
    }

    @When("completo el formulario de datos con {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void completo_el_formulario_de_datos_con(String nombre, String apellido, String email, String direccion, String codPostal, String ciudad, String celular) {
        buscarHotelView().escribirNombre(nombre);
        buscarHotelView().escribirApellido(apellido);
        buscarHotelView().escribirEmail(email);
        buscarHotelView().escribirDireccion(direccion);
        buscarHotelView().escribirCodigoPostal(codPostal);
        buscarHotelView().escribirCiudad(ciudad);
        buscarHotelView().escribirCelular(celular);
    }

    @When("selecciono el objetivo del viaje")
    public void selecciono_el_objetivo_del_viaje(){
        buscarHotelView().seleccionoObjetivoViaje();
    }

    @When("selecciono proximo paso")
    public void selecciono_proximo_paso(){
        buscarHotelView().seleccionoProximoPaso();
    }

    @When("selecciono el último paso")
    public void selecciono_el_último_paso(){
        buscarHotelView().seleccionoUltimoPaso();
    }

    @When("ingreso el numero de {string}")
    public void ingreso_el_numero_de(String tarjeta){
        buscarHotelView().ingresoNumeroTarjeta(tarjeta);
    }

    @When("ingreso la fecha de {string}")
    public void ingreso_la_fecha_de(String expTarjeta){
        buscarHotelView().ingresoFechaTarjeta(expTarjeta);
    }

    @When("valido el costo de la reserva")
    public void valido_el_costo_de_la_reserva(){
        buscarHotelView().validoCostoReserva();
    }

    @When("realizo la reserva")
    public void realizo_la_reserva(){
        buscarHotelView().realizoReserva();
    }




}
