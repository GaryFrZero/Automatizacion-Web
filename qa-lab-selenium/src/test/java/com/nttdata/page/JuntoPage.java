package com.nttdata.page;

import org.openqa.selenium.By;

public class JuntoPage {

    public static By userInput = By.id("UserName");
    public static By passInput = By.id("Password");
    public static By loginButton = By.xpath("//input[@class='btn btn-primary form-control']");


    public static By clickButton = By.xpath("//a[@class='btn header__my-account__link']");

    public static By clicknav = By.xpath("//header/nav[@id='navbar']/div[1]/div[4]/div[2]/div[1]/a[1]/span[1]");


}
