package com.qa.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverfactory
{
    public static WebDriver driver;

   public static ThreadLocal<WebDriver> tldriver= new ThreadLocal<>();

    public WebDriver init_browser(String browser)
    {
        System.out.println("my browser is "+browser);
        if(browser.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            tldriver.set(new ChromeDriver());

        }
        getdriver().manage().window().maximize();
        return getdriver();
    }


    public static  synchronized WebDriver getdriver()
    {
        return tldriver.get();
    }
}
