package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

public class Shipments {

    WebDriver driver;

    @When("I click on the save button")
    public void i_click_on_the_save_button() {
        driver.findElement(By.xpath(ConfigReader.readLocator("search_saveButton"))).click();
    }

    @Then("The service has been save as a draft")
    public void the_service_has_been_save_as_a_draft() {

    }
}
