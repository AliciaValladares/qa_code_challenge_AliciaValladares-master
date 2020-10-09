package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;

import java.io.IOException;

public class Search {
    WebDriver driver;
    Actions act = new Actions(driver);

    @When("I click in new deliver button")
    public void i_click_in_new_deliver_button() {
        driver.findElement(By.xpath(ConfigReader.readLocator("dashboard_newOrderButton"))).click();
    }

    @When("I set the origin city")
    public void i_set_the_origin_city() throws IOException {

        driver.findElement(By.id(ConfigReader.readLocator("search_originCity"))).sendKeys(ConfigReader.readConfiguration("OriginCity"));
        act.sendKeys(Keys.ENTER).perform();
    }

    @When("I set the destination city")
    public void i_set_the_destination_city() throws IOException {
        driver.findElement(By.id(ConfigReader.readLocator("search_destinationCIty"))).sendKeys(ConfigReader.readConfiguration("DestinationCity"));
        act.sendKeys(Keys.ENTER).perform();
    }

    @When("I set the weight")
    public void i_set_the_weight() throws IOException {
        driver.findElement(By.id(ConfigReader.readLocator("search_weight"))).sendKeys(ConfigReader.readConfiguration("Weight"));
    }

    @When("I set the length of the parcel")
    public void i_set_the_length_of_the_parcel() throws IOException {
        driver.findElement(By.id(ConfigReader.readLocator("search_length"))).sendKeys(ConfigReader.readConfiguration("Length"));
    }

    @When("I set the width of the parcel")
    public void i_set_the_width_of_the_parcel() throws IOException {
        driver.findElement(By.id(ConfigReader.readLocator("search_width"))).sendKeys(ConfigReader.readConfiguration("Width"));
    }

    @When("I set the height of the parcel")
    public void i_set_the_height_of_the_parcel() throws IOException {
        driver.findElement(By.id(ConfigReader.readLocator("search_height"))).sendKeys(ConfigReader.readConfiguration("Height"));
    }

    @When("I click on get results button")
    public void i_click_on_get_results_button() {
        driver.findElement(By.xpath(ConfigReader.readLocator("search_getPricesButton"))).click();
    }

    @Then("I select the first option")
    public void i_select_the_first_option() {

    }

}
