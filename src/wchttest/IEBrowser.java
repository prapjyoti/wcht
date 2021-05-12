package wchttest;
/*
 https://www.wcht.org.uk/
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEBrowser {
    public static void main(String[] args) {
        String baseUrl="https://www.wcht.org.uk/";
        //set the property for browser and copy the path
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver driver =new InternetExplorerDriver();//obj declare
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.close();
    }
}
