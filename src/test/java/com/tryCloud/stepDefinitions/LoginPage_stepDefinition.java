package com.tryCloud.stepDefinitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

/**
 * Created by: Marwan on 12/25/2021 around 12:22 PM
 */
public class LoginPage_stepDefinition {

    LoginPage loginPage = new LoginPage();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("tryCloudUrl"));

    }
    @Then("The title should be {string}")
    public void the_title_should_be(String pageTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().equals(pageTitle));
    }

    @When("I enter correct username in username input box")
    public void i_enter_correct_username_in_username_input_box() {

        Driver.getDriver().findElement(loginPage.userInputBox).sendKeys("User1");



    }
    @When("I enter correct password in input box")
    public void i_enter_correct_password_in_input_box() {
        Driver.getDriver().findElement(loginPage.passwordBox).sendKeys("Userpass123");
    }
    @When("I click the login button")
    public void i_click_the_login_button() {
        Driver.getDriver().findElement(loginPage.loginButton).click();
    }
    @Then("I should be able to login successfully and land on the dashboard page and title should contain {string}")
    public void i_should_be_able_to_login_successfully_and_land_on_the_dashboard_page_and_title_should_contain(String tryCloudTitle) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(tryCloudTitle));
    }


}
