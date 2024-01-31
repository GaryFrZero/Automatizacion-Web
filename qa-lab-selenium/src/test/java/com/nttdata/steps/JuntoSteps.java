package com.nttdata.steps;

import com.nttdata.page.JuntoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JuntoSteps {

    private  WebDriver driver;

    public JuntoSteps(WebDriver driver){
        this.driver = driver;
    }

    public void clickBuscar() {
        //WebElement botonBuscar = driver.findElement(JuntoPage.clicknav);
        //botonBuscar.click();


        //Select drpCountry = new Select(driver.findElement(By.xpath("//header/nav[@id='navbar']/div[1]/div[4]/div[2]/div[1]/a[1]']")));
        //drpCountry.selectByVisibleText("Cuenta");

        // Encontrar el elemento div con la clase "header-icons-btn"
        WebElement divElement = driver.findElement(By.className("header-icons-btn"));

        // Encontrar el primer enlace dentro del div
        WebElement primerEnlace = divElement.findElement(By.tagName("a"));

        // Imprimir la URL del primer enlace
        System.out.println("URL del primer enlace: " + primerEnlace.getAttribute("href"));



    }


    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(JuntoPage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(JuntoPage.loginButton));


    }


    public void typePassword(String password){
        this.driver.findElement(JuntoPage.passInput).sendKeys(password);
    }


    public void login(){
        this.driver.findElement(JuntoPage.loginButton).click();
    }

    public void clickIniciar() {



    }
}
