package wchttest;
/*
https://www.wcht.org.uk/
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseUrl="https://www.wcht.org.uk/";//variable declare with string datatype
        //property set for browser and coy the path
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver =new EdgeDriver();//obj created
        //mehtod use for maximize window and timeouts
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);
        //fetch the title
        String title= driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
