package com.bdd.view;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class BuscarHotelView {

    static AndroidDriver androidDriver;
    public static void setAndroidDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("appActivity", "com.booking.startup.HomeActivity");
        capabilities.setCapability("appPackage", "com.booking");
        androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void scrollDown(){
        Dimension dimension = androidDriver.manage().window().getSize();

        Double scrollHeightStart = dimension.getHeight() * 0.5;
        int scrollStart = scrollHeightStart.intValue();
        Double scrollHeightEnd = dimension.getHeight() * 0.2;
        int scrollEnd = scrollHeightEnd.intValue();

        new TouchAction((PerformsTouchActions) androidDriver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }

    public void clicBuscador(){
        androidDriver.findElement(By.className("android.widget.ImageButton")).click();
        androidDriver.findElement(By.id("com.booking:id/facet_search_box_basic_field_label")).click();
    }

    public void escribirDestino(String destino){
        try{
            Actions actions = new Actions(androidDriver);
            actions.sendKeys(destino).perform();
            androidDriver.findElement(By.id("com.booking:id/view_disambiguation_destination_image")).click();
        } catch (NoSuchElementException e){
        }
    }

    public void seleccionarFecha(){
        androidDriver.findElement(By.xpath("//android.view.View[@content-desc=\"14 October 2023\"]")).click();
        androidDriver.findElement(By.xpath("//android.view.View[@content-desc=\"28 October 2023\"]")).click();
        androidDriver.findElement(By.id("com.booking:id/facet_date_picker_confirm")).click();

    }


    public  void seleccionarPasajeros(){
        androidDriver.findElement(By.id("com.booking:id/facet_search_box_accommodation_occupancy")).click();
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.Button[2]")).click();
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.Button[2]")).click();
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.Button[2]")).click();
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.Button[2]")).click();
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.Button[2]")).click();
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.Button[2]")).click();
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.Button[2]")).click();

        androidDriver.findElement(By.id("android:id/button1")).click();
        androidDriver.findElement(By.id("com.booking:id/group_config_apply_button")).click();


    }

    public void busquedaHospedaje(){
        androidDriver.findElement(By.id("com.booking:id/facet_search_box_cta")).click();
    }

    public void validarHospedaje(){
        try{
            String resultadoEsperado = "Sort";
            String resultadoActual = androidDriver.findElement(By.id("com.booking:id/toolbar_item_label")).getText();
            Assert.assertEquals(resultadoEsperado, resultadoActual);
        } catch (NoSuchElementException e){
        }
    }

    public void clicHotel(){
        try{
            androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
        } catch (NoSuchElementException e){
        }
    }

    public void seleccionaHabitacion(){
        try{
            androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup")).click();
        } catch (NoSuchElementException e){
        }
    }

    public void seleccionaTipoHabitacion(){
        try{
            androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
        } catch (NoSuchElementException e){
        }
    }

    public void seleccionaReserva(){
        try{
            androidDriver.findElement(By.id("com.booking:id/main_action")).click();
        } catch (NoSuchElementException e){
        }
    }

    public void escribirNombre(String nombre){
        try{
            androidDriver.findElement(By.id("com.booking:id/bstage1_contact_firstname_value")).click();
            Actions actions = new Actions(androidDriver);
            actions.sendKeys(nombre).perform();
        } catch (NoSuchElementException e){
        }
    }

    public void escribirApellido(String apellido){
        try{
            androidDriver.findElement(By.id("com.booking:id/bstage1_contact_lastname_value")).click();
            Actions actions = new Actions(androidDriver);
            actions.sendKeys(apellido).perform();
        } catch (NoSuchElementException e){
        }
    }

    public void escribirEmail(String email){
        try{
            androidDriver.findElement(By.id("com.booking:id/bstage1_contact_email_value")).click();
            Actions actions = new Actions(androidDriver);
            actions.sendKeys(email).perform();
        } catch (NoSuchElementException e){
        }
    }

    public void escribirDireccion(String direccion){
        try{
            androidDriver.findElement(By.id("com.booking:id/bstage1_contact_address_value")).click();
            Actions actions = new Actions(androidDriver);
            actions.sendKeys(direccion).perform();
        } catch (NoSuchElementException e){
        }
    }

    public void escribirCodigoPostal(String codPostal){
        try{
            androidDriver.findElement(By.id("com.booking:id/bstage1_contact_zipcode_value")).click();
            Actions actions = new Actions(androidDriver);
            actions.sendKeys(codPostal).perform();
        } catch (NoSuchElementException e){
        }
    }

    public void escribirCiudad(String ciudad){
        try{
            androidDriver.findElement(By.id("com.booking:id/bstage1_contact_city_value")).click();
            Actions actions = new Actions(androidDriver);
            actions.sendKeys(ciudad).perform();
            scrollDown();
        } catch (NoSuchElementException e){
        }
    }

    public void escribirPais(String pais){
        try{
            androidDriver.findElement(By.id("com.booking:id/bstage1_contact_country_value")).click();
            Actions actions = new Actions(androidDriver);
        } catch (NoSuchElementException e){
        }
    }

    public void escribirCelular(String celular){
        try{
            androidDriver.findElement(By.id("com.booking:id/bstage1_contact_telephone_value")).click();
            Actions actions = new Actions(androidDriver);
            actions.sendKeys(celular).perform();
            scrollDown();
        } catch (NoSuchElementException e){
        }
    }

    public void seleccionoObjetivoViaje(){
        androidDriver.findElement(By.id("com.booking:id/business_purpose_leisure")).click();
    }

    public void seleccionoProximoPaso(){
        androidDriver.findElement(By.id("com.booking:id/action_button")).click();
    }

    public void seleccionoUltimoPaso(){
        androidDriver.findElement(By.id("com.booking:id/action_button")).click();
    }

    public void ingresoNumeroTarjeta(String tarjeta){
        try{
            androidDriver.findElement(By.id("com.booking:id/new_credit_card_number_edit")).click();
            Actions actions = new Actions(androidDriver);
            actions.sendKeys(tarjeta).perform();
        } catch (NoSuchElementException e){
        }
    }

    public void ingresoFechaTarjeta(String expTarjeta){
        try{
            androidDriver.findElement(By.id("com.booking:id/new_credit_card_expiry_date_edit")).click();
            Actions actions = new Actions(androidDriver);
            actions.sendKeys(expTarjeta).perform();
            scrollDown();
            scrollDown();
            scrollDown();
        } catch (NoSuchElementException e){
        }
    }

    public void validoCostoReserva(){
        try{
            String costoReserva = androidDriver.findElement(By.id("com.booking:id/bp_price_summary_total_price_value")).getText();
            String montoPagar = androidDriver.findElement(By.id("com.booking:id/title")).getText();
            Assert.assertNotEquals(costoReserva, montoPagar);
        } catch (NoSuchElementException e){
        }

    }

    public void realizoReserva(){
        androidDriver.findElement(By.id("com.booking:id/action_button")).click();
    }


}
