package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObject {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected ChromeOptions options;



    public PageObject(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        if (driver == null){
            this.driver = new ChromeDriver(initChromeOptions());
        }else{
            this.driver = driver;
        }

    }

    private ChromeOptions initChromeOptions(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        return options;
    }

    public void awaitPage(){
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void closeBrowser() {
        this.driver.quit();
    }
}
