package wchttest;
/*
https://www.wcht.org.uk/
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl="https://www.wcht.org.uk/";//variable declare for url
        //set property for browser and copy the path
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();//obj created
        driver.manage().window().maximize();//method for maximize window
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);//called the url
        driver.close();//close the driver for browser

    }
}
