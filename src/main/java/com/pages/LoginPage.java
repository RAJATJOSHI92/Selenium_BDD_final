package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
   private WebDriver driver;
   private By usernamee=By.xpath("//input[@id='username']");
   private By passwardd = By.xpath("//input[@id='password']");
   private By myaccountbtn= By.xpath("//a[normalize-space()='My Account']");
    private By loginbtn= By.xpath("///input[@name='login']");

   public LoginPage(WebDriver driver)
   {
       this.driver=driver;
   }


   public String get_Title()
   {
       return driver.getTitle();
   }

   public Accountspage linkclick()
   {
       driver.findElement(myaccountbtn).click();
       return new Accountspage(driver);
   }

  /* public void setusename(String username)
   {
       driver.findElement(usernamee).sendKeys();
   }
    public void setPassward(String passward)
    {
        driver.findElement(passwardd).sendKeys();
    }

    public  void loginbtnclick()
    {
        driver.findElement(loginbtn).click();
    }*/



}
