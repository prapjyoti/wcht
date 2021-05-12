package wchttest;
/*
https://www.wcht.org.uk/
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxBrowser {
    public static void main(String[] args) {
        String baseUrl= "https://www.wcht.org.uk/";//variable declare
        //set the property fro browser and copy the path
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();//obj created
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.close();
    }
}
