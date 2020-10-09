package driver;

import io.cucumber.core.gherkin.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utilities.ConfigReader;

import java.io.IOException;

public class Navigation {

    static WebDriver driver = null;

    public static void startDriver() throws IOException {
        if(ConfigReader.readConfiguration("BrowserName").equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/aliciavalladares/Documents/Workspace/Drivers/chromedriver");
            driver = new ChromeDriver();
        }
        else if(ConfigReader.readConfiguration("BrowserName").equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", "/Users/aliciavalladares/Documents/Workspace/Drivers/geckodriver");
            driver = new FirefoxDriver();
        }
        else if(ConfigReader.readConfiguration("BrowserName").equalsIgnoreCase("IE")){
            System.setProperty("webdriver.chrome.driver", "/Users/aliciavalladares/Documents/Workspace/Drivers/chromedriver");
            driver = new InternetExplorerDriver();
        }
        else {
            System.setProperty("webdriver.chrome.driver", "/Users/aliciavalladares/Documents/Workspace/Drivers/chromedriver");
            driver = new ChromeDriver();
        }
        driver.get(ConfigReader.readConfiguration("ApplicationUrl"));
        }

    public void tearDown(Scenario scenario) {
        driver.close();
    }

}

