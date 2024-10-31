package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accountspage
{

    private WebDriver driver;

    private By usernamee=By.xpath("//input[@id='username']");
    private By passwardd = By.xpath("//input[@id='password']");
    private By loginbtn= By.xpath("//input[@name='login']");

    public Accountspage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void dologin(String username, String passward)
    {
        driver.findElement(usernamee).sendKeys(username);
        driver.findElement(passwardd).sendKeys(passward);

    }

    public Landingpage clicklogin()
    {
        driver.findElement(loginbtn).click();
        return new Landingpage(driver);
    }
}
