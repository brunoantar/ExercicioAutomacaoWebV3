package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Hooks {
    public static WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        driver = DriverManager.getDriver();
    }
    @AfterStep
    public void logScreenshot() {
        String timestamp1 = new SimpleDateFormat("yyMMdd-HH_mm_ss").format(new Date());
        String folderName = "Date_" + timestamp1.substring(0, 6) + "-Time_" + timestamp1.substring(7, 15);
        String timestamp2 = new SimpleDateFormat("yyMMdd-HHmm").format(new Date());
        String reportName = "TelaDeLogin" + "-" + timestamp2.substring(0, 6) + "-" + timestamp2.substring(7, 11) + ".html";
        String screenshotPath = "TelaDeLogin" + "-" + timestamp2.substring(0, 6) + "-" + timestamp2.substring(7, 11) + ".png";

        String folderPath = System.getProperty("user.dir") + "/files-results/" + folderName;
        new File(folderPath).mkdir();


        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshotFile, new File(folderPath + "/" + screenshotPath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        attachScreenshotToReport(screenshotPath);

        attachReportToReport(reportName);
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshotToReport(String screenshotPath) {
        try {
            return Files.readAllBytes(Paths.get(screenshotPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    @Attachment(value = "Report", type = "text/html")
    public byte[] attachReportToReport(String reportName) {
        try {
            return Files.readAllBytes(Paths.get(reportName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    @After
    public void tearDown(){
        driver.quit();
        driver = null;
        DriverManager.setDriver(driver);
    }
}
