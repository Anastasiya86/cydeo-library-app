package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user logins as a librarian")
    public void user_logins_as_a_librarian() {
        loginPage.inputEmailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        loginPage.inputPasswordInput.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        loginPage.btnButton.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        String expectedURL= "dashboard";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expectedURL));
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue("dashboard does not appear",actualURL.contains(expectedURL));

    }

}
