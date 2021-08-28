package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import com.symund.pages.OnlineStatusPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OnlineStatusStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    OnlineStatusPage onlineStatusPage=new OnlineStatusPage();

    @When("the user clicks user profile icon")
    public void theUserClicksUserProfileIcon() {

        dashboardPage.userStatus.click();
    }

    @Then("the user can see status")
    public void theUserCanSeeStatus() {

        Assert.assertTrue(dashboardPage.onlineStatus.isDisplayed());
    }

    @And("the user click on status")
    public void theUserClickOnStatus() {

        dashboardPage.onlineStatus.click();
    }

    @Then("the user can see the status modal pege")
    public void theUserCanSeeTheStatusModalPege() {
        Assert.assertTrue(onlineStatusPage.OnlineStatusModalPage.isDisplayed());
    }

    @And("the user can click any  {string}")
    public void theUserCanClickAny(String statusM) {
        Driver.get().findElement(By.xpath("//label[@for='user-status-online-status-'" + statusM + "]"));
        BrowserUtils.waitFor(3);


    }

  /*  @And("the user should see following status message")
    public void theUserShouldSeeFollowingStatusMessage(List<String> options) {
        onlineStatusPage.seeEachOption(onlineStatusPage.statusMessages);

    }*/

    @Then("the user can see {string} on status")
    public void theUserCanSeeOnStatus(String string) {
        Assert.assertEquals(string,dashboardPage.onlineStatus.getText());
    }




    @Then("the user can see the status modal page")
    public void theUserCanSeeTheStatusModalPage() {
        onlineStatusPage.OnlineStatusModalPage.isDisplayed();
    }

    @And("the user can type a custom message")
    public void theUserCanType() {

        onlineStatusPage.statusMessageBar.sendKeys("Hello World");
        BrowserUtils.waitFor(2);

    }

    @Then("the user click on Set Status Message")
    public void theUserClickOnSetStatusMessage() {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,1000)");

        onlineStatusPage.setStatus.click();
    }



    @And("the user can see the statusM on status")
    public void theUserCanSeeTheOnStatus() {



    }


    @When("the user clicks to emoji icon and chooses emoji {string}")
    public void theUserClicksToEmojiIconAndChoosesEmoji(String string) {

       onlineStatusPage.emojiBox.click();
        onlineStatusPage.getEmoji(string);
    }

    @And("the user can change {string}")
    public void theUserCanChange(String arg0) {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,1000)");






    }

    @When("the user clicks to {string} status message")
    public void the_user_clicks_to_status_message(String string) {

    }
}
