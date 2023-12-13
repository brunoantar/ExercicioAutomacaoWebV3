package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void setDriver(WebDriver eDriver){
        driver = eDriver;
    }
}
