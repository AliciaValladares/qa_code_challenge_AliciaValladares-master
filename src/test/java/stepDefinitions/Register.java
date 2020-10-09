package stepDefinitions;

import driver.Navigation;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;

import java.io.IOException;

public class Register {

    WebDriver driver;

    @Given("I am in the register page")
    public void i_am_in_the_register_page() throws IOException {
        Navigation.startDriver();
    }

    @Given("I fill the email")
    public void i_fill_the_email() throws IOException {
        driver.findElement(By.id(ConfigReader.readLocator("register_email"))).sendKeys(ConfigReader.readConfiguration("UserEmail"));
    }

    @Given("I fill the password")
    public void i_fill_the_password() throws IOException {
        driver.findElement(By.id(ConfigReader.readLocator("register_password"))).sendKeys(ConfigReader.readConfiguration("UserPassword"));
    }

    @Given("I fill amount of order sent field")
    public void i_fill_amount_of_order_sent_field() {
        Select orders = new Select(driver.findElement(By.xpath(ConfigReader.readLocator("register_amountOrders"))));
        orders.selectByVisibleText("1 - 10");
    }

    @Given("I fill products sold through field")
    public void i_fill_products_sold_through_field() {
        Select products = new Select(driver.findElement(By.xpath(ConfigReader.readLocator("register_ordersSold"))));
        products.selectByVisibleText("WooCommerce");
    }

    @Given("I fill main shop field")
    public void i_fill_main_shop_field() {
        Select shops = new Select(driver.findElement(By.xpath(ConfigReader.readLocator("register_mainShop"))));
        shops.selectByVisibleText("eBay");
    }

    @Given("I fill telephone number field")
    public void i_fill_telephone_number_field() throws IOException {
        driver.findElement(By.id(ConfigReader.readLocator("register_telephone"))).sendKeys(ConfigReader.readConfiguration("UserPhone"));
    }

    @Given("I accept the terms")
    public void i_accept_the_terms() {
        driver.findElement(By.xpath(ConfigReader.readLocator("register_termsAgreement"))).click();
    }

    @Given("I authorize packlink to sent me info")
    public void i_authorize_packlink_to_sent_me_info() {
        driver.findElement(By.xpath(ConfigReader.readLocator("register_termsAgreement"))).click();
    }

    @When("I click on the register button")
    public void i_click_on_the_register_button() {
        driver.findElement(By.xpath(ConfigReader.readLocator("register_marketingAut"))).click();
    }

    @Then("I land into the platform dashboard")
    public void i_land_into_the_platform_dashboard() {

    }
}
