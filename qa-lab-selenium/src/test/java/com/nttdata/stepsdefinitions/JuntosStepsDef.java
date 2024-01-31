package com.nttdata.stepsdefinitions;

import com.nttdata.steps.JuntoSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JuntosStepsDef {

    private WebDriver driver;
    private Scenario scenario;

    private JuntoSteps juntoSteps;


    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();

        juntoSteps = new JuntoSteps(driver);
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }











    @Given ("dado que estoy en la pagina Juntoz")
    public void estoyEnLaPaginaDeJuntoz() {
        driver.get("https://juntoz.com/");
        screenShot();
    }

    @When("hago clic en el enlace Cuenta")
    public void hagoClicEnElEnlaceCuenta() {
       juntoSteps.clickBuscar();
        screenShot();
    }

    @And("luego doy clic en el boton Iniciar Sesion")
    public void luegoDoyClicEnElBotonIniciarSesion() {
        juntoSteps.clickIniciar();
        screenShot();
    }



    @When("inicio sesion con las credenciales usuario {string} y contraseña {string}")
    public void iLoginWithCredentials(String user, String password) {
        JuntoSteps juntoSteps = new JuntoSteps(driver);
        juntoSteps.typeUser(user);
        juntoSteps.typePassword(password);
        juntoSteps.login();
        screenShot();
    }

    @Then("valido que la autenticacion sea exitosa")
    public void iValidateSuccessfulAuthentication() {
        // Implementa el código para validar que la autenticación fue exitosa.
    }

    @When("ingreso a la categoria {string}")
    public void iGoToCategory(String category) {
        // Implementa el código para navegar a la categoría especificada.
    }

    @When("selecciono el primer producto disponible")
    public void iSelectFirstAvailableProduct() {
        // Implementa el código para seleccionar el primer producto disponible en la categoría.
    }

    @When("agrego el producto al carrito")
    public void iAddProductToCart() {
        // Implementa el código para agregar el producto al carrito.
    }

    @Then("valido que el producto se haya agregado exitosamente al carrito")
    public void iValidateProductAddedToCart() {
        // Implementa el código para validar que el producto se agregó exitosamente al carrito.
    }


    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }



}
