package common;

import com.codeborne.selenide.Configuration;
import org.junit.AfterClass;


public class Base_Test {
     {
        Configuration.browser ="chrome";
        Configuration.baseUrl="https://demostore.x-cart.com/";
        Configuration.holdBrowserOpen=true;
    }
    //protected WebDriver driver;
/**
    protected void initializeDriver(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/macOS/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://demostore.x-cart.com/");
        driver.manage().window().maximize();
        System.setProperty("selenide.browser","chrome");
        open("https://demostore.x-cart.com/");

    }*/
}
