package com.project_0707.reto.busqueda.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ChromeDriver {

    public WebDriver driver;
    public static List<ChromeDriver> listChromeDriver = new ArrayList<>();


    public static ChromeDriver chrome (){
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
        listChromeDriver.add(new ChromeDriver()); //toda la lista se agregue en la clase principal
        listChromeDriver.get(listChromeDriver.size()-1).driver = new org.openqa.selenium.chrome.ChromeDriver(options);
        listChromeDriver.get(listChromeDriver.size()-1).driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return listChromeDriver.get(listChromeDriver.size()-1);
    }

    public WebDriver conURL (String url){
        driver.get(url);
        return listChromeDriver.get(listChromeDriver.size()-1).driver;
    }

}
