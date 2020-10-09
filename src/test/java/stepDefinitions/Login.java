package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

import java.io.IOException;


public class Login {

    public static WebDriver driver;

    @Given("I click on start session button")
    public void i_click_on_start_session_button() {
        driver.findElement(By.xpath(ConfigReader.readLocator("login_button"))).click();
    }

    @Given("I fill the email field in login page")
    public void i_fill_the_email_field_in_login_page() throws IOException {
        driver.findElement(By.id(ConfigReader.readLocator("login_email"))).sendKeys(ConfigReader.readConfiguration("UserLoginEmail"));
    }

    @Given("I fill the password field in login page")
    public void i_fill_the_password_field_in_login_page() throws IOException {
        driver.findElement(By.id(ConfigReader.readLocator("login_password"))).sendKeys(ConfigReader.readConfiguration("UserLoginPassword"));
    }

    @When("I press the login button")
    public void i_press_the_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
