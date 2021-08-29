package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import com.symund.pages.ProfileSettingsPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProfileSettingsStepdefs {

    ProfileSettingsPage page = new ProfileSettingsPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Then("the user should be able to see following titles")
    public void theUserShouldBeAbleToSeeFollowingTitles(List<String> expectedTitles) {

        List<String> actualTitles = new ArrayList<>();

        for (WebElement webElement : new ProfileSettingsPage().titlesOfPersonalInfoPage) {

            actualTitles.add(webElement.getText());
        }

        Assert.assertEquals(expectedTitles, actualTitles);


    }

    @And("the user clicks user profile icon and after clicks on settings option")
    public void theUserClicksUserProfileIconAndAfterClicksOnSettingsOption() {


        dashboardPage.userStatus.click();
        dashboardPage.profileSettingsOption.click();


    }

    @When("the user deletes the current full name and types new full name as {string}")
    public void theUserDeletesTheCurrentFullNameAndTypesNewFullNameAs(String newFullName) {

        page.fullNameInputbox.clear();
        BrowserUtils.waitFor(2);
        page.fullNameInputbox.sendKeys(newFullName);
        BrowserUtils.waitFor(2);

    }
/*
    @And("the user confirms the password typing {string}")
    public void theUserConfirmsThePasswordTyping(String password) {

        page.confirmationPopupPasswordInputbox.sendKeys(password);
        page.confirmationPopupConfirmButton.click();
    }

 */

    @And("new full name {string} should be displayed under profile icon after refreshing the page")
    public void newFullNameShouldBeDisplayedUnderProfileIconAfterRefreshingThePage(String newFullname) {

        Driver.get().navigate().refresh();

        page.userStatus.click();

        Assert.assertEquals(newFullname, page.userProfile.getAttribute("title"));

    }
}
