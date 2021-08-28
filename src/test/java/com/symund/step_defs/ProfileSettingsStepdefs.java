package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import com.symund.pages.ProfileSettingsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProfileSettingsStepdefs {


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

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.userStatus.click();
        dashboardPage.profileSettingsOption.click();


    }
}
