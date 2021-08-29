package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import com.symund.pages.LoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Locale;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("the user logged in with {string} and {string}")
    public void the_user_logged_in_with_and(String username, String password) {
        new LoginPage().login(username,password);
    }

    @Then("the user on Dashboard page and user profile as expected {string}")
    public void the_user_on_Dashboard_page_and_user_profile_as_expected(String username) {
        String title = Driver.get().getCurrentUrl().toLowerCase(Locale.ROOT);
        // System.out.println(title);
        Assert.assertTrue(title.contains("dashboard"));

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.userStatus.click();
        Assert.assertEquals(username,dashboardPage.userProfile.getText());
    }

    @And("the user should be able to login with {string} and {string} and ENTER")
    public void theUserShouldBeAbleToLoginWithAndAndENTER(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password+ Keys.ENTER);
        //BrowserUtils.waitForVisibility(loginPage.errorMessage,5);

    }

    @Then("verify the user cannot login and get error message {string}")
    public void verifyTheUserCannotLoginAndGetErrorMessage(String expectedErrorMessage) throws InterruptedException {

        String actualErrorMessage = new LoginPage().errorMessage.getText();
        System.out.println(actualErrorMessage);
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }


    @Then("verify the user get error message from empty username {string}")
    public void verifyTheUserGetErrorMessageFromEmptyUsername(String expectedErrorMessage) {
        String validationMessage = new LoginPage().userName.getAttribute("validationMessage");
        System.out.println(validationMessage);
        Assert.assertEquals(expectedErrorMessage,validationMessage);

    }

    @Then("verify the user get error message from empty password {string}")
    public void verifyTheUserGetErrorMessageFromEmptyPassword(String expectedErrorMessage) {
        String validationMessage = new LoginPage().password.getAttribute("validationMessage");
        System.out.println(validationMessage);
        Assert.assertEquals(expectedErrorMessage,validationMessage);
    }

    @Then("verify the user can see the password in a form of dots by default")
    public void verifyTheUserCanSeeThePasswordInAFormOfDotsByDefault() {
        LoginPage loginPage = new LoginPage();
        loginPage.password.sendKeys("Employee123");
        System.out.println(loginPage.password.getAttribute("type"));
        Assert.assertEquals("password",loginPage.password.getAttribute("type"));
    }

    @Then("verify the user can see the password explicitly")
    public void verifyTheUserCanSeeThePasswordExplicitly() {

      LoginPage loginPage = new LoginPage();
      loginPage.password.sendKeys("Employee123");
      loginPage.eye.click();
      System.out.println(loginPage.password.getAttribute("type"));
      Assert.assertEquals("text",loginPage.password.getAttribute("type"));

    }

    @When("verify the user can see forgot password on the login page")
    public void verifyTheUserCanSeeForgotPasswordOnTheLoginPage() {

        Assert.assertTrue(new LoginPage().forgotPassword.isDisplayed());
    }

    @Then("verify the user can see reset password")
    public void verifyTheUserCanSeeResetPassword() {
        LoginPage loginPage = new LoginPage();
        loginPage.forgotPassword.click();
        Assert.assertTrue(loginPage.resetPassword.isDisplayed());
    }

    @Then("verify placeholders should be {string} and {string}")
    public void verifyPlaceholdersShouldBeAnd(String user, String password) {
        LoginPage loginPage = new LoginPage();
        System.out.println(loginPage.userName.getAttribute("placeholder"));
        Assert.assertEquals(user,loginPage.userName.getAttribute("placeholder"));

        System.out.println(loginPage.password.getAttribute("placeholder"));
        Assert.assertEquals(password,loginPage.password.getAttribute("placeholder"));

    }

    @Then("the user should be able to log out and ends up in login page")
    public void theUserShouldBeAbleToLogOutAndEndsUpInLoginPage() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.userStatus.click();
        dashboardPage.logout.click();
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertTrue(new LoginPage().login.isDisplayed());



    }

    @Then("the user can not go to home page again by clicking step back button")
    public void theUserCanNotGoToHomePageAgainByClickingStepBackButton() {
        Driver.get().navigate().back();
        Assert.assertTrue(new LoginPage().login.isDisplayed());
    }

    @Given("the user login with valid credentials")
    public void theUserLoginWithValidCredentials() {
        Driver.get().get(ConfigurationReader.get("url"));

        new LoginPage().login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));

    }

    @Then("the user on dashboard page")
    public void theUserOnDashboardPage() {
        String title = Driver.get().getCurrentUrl().toLowerCase(Locale.ROOT);

        Assert.assertTrue(title.contains("dashboard"));
    }
}
