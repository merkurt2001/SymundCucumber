package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Locale;

public class DashboardStepDefs {

    @When("the user navigate to {string} page")
    public void the_user_navigate_to_page(String pageName) {
       new DashboardPage().navigateToPage(pageName);
    }

    @Then("the user on {string} page")
    public void theUserOnPage(String pageName) {
        String title = Driver.get().getCurrentUrl().toLowerCase(Locale.ROOT);

        Assert.assertTrue(title.contains(pageName));

    }

    @Then("the user click to {string}")
    public void theUserClickTo(String icon) {
        DashboardPage dashboardPage = new DashboardPage();
        if(icon.equalsIgnoreCase("pagelogo")){
            dashboardPage.pageLogo.click();
        }else  if(icon.equalsIgnoreCase("contactsmenu")){
            dashboardPage.contactsMenu.click();
        }else  if(icon.equalsIgnoreCase("magnifyIcon")){
            dashboardPage.magnifyIcon.click();
        }
    }
}
