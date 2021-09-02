package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import com.symund.pages.FilesPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
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

    @Then("see only the images files with the extension of jpeg jpg")
    public void seeOnlyTheImagesFilesWithTheExtensionOfJpegJpg() {

        List<WebElement> elements = Driver.get().findElements(By.cssSelector("a.file"));
        int count = 0;
        for (WebElement element : elements) {
            if (element.getAttribute("href").contains("jpeg")||element.getAttribute("href").contains("jpg")) {
               count++;
            }
        }
        Assert.assertEquals(elements.size(),count);



    }


    @Then("the user types file name as {string} and can see file full name")
    public void theUserTypesFileNameAsAndCanSeeFileFullName(String fileName) {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.contactsMenuSearch.sendKeys(fileName);
        //BrowserUtils.waitFor(3);

        String searchNameText = dashboardPage.contactsMenuSearchName.getText();
        System.out.println(searchNameText);
        Assert.assertEquals(fileName,searchNameText);
    }

    @And("the user types file name {string} and can see file name at first row")
    public void theUserTypesFileNameAndCanSeeFileNameAtFirstRow(String fileName) {

        DashboardPage dashboardPage = new DashboardPage();

        dashboardPage.magnifyIconSearch.sendKeys(fileName);
        BrowserUtils.waitFor(3);
        String searchNameText = dashboardPage.searchResultContent.getText();
        System.out.println(searchNameText);
        Assert.assertEquals(fileName,searchNameText);
    }

    @Then("the user click to {string} file")
    public void theUserClickToFile(String fileName) {

        new  DashboardPage().clickSearchName(fileName);

    }

    @And("the user should see the details side page of the {string} file")
    public void theUserShouldSeeTheDetailsSidePageOfTheFile(String fileName) {
        new DashboardPage().getSidebarMainTitle(fileName);
    }
}
