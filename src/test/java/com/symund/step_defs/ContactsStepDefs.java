package com.symund.step_defs;

import com.symund.pages.ContactsPage;
import com.symund.pages.DashboardPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactsStepDefs {
    @When("the user navigate to contacts tab")
    public void the_user_navigate_to_contacts_tab() {
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.contacts.click();
    }

    @When("Click to {string}")
    public void click_to(String click) {
        ContactsPage contactsPage=new ContactsPage();

        if(click.equals("New Contact")){
            contactsPage.NewContact.click();
        }else if (click.equals("icon")){
            contactsPage.icon.click();
        }else if (click.equals("Picture")){
            contactsPage.Picture.click();

        }else if(click.equals("Choose from file")){
            contactsPage.ChooseFromFiles.click();
        }else if (click.equals("first contacts")){
            contactsPage.list.get(0).click();
        }
    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String company, String title) {



        ContactsPage contactsPage=new ContactsPage();
        contactsPage.Company.sendKeys(company);
        contactsPage.Title.sendKeys(title+ Keys.ENTER);
        BrowserUtils.waitFor(3);


    }


    @Then("{string} contacts appears in the All contacts list")
    public void contactsAppearsInTheAllContactsList(String name) {


        ContactsPage contactsPage=new ContactsPage();
        String expect=name;
        String actual=contactsPage.list.get(0).getText();
        Assert.assertTrue(actual.contains(expect));


    }



    @Then("choose {string} picture")
    public void choosePicture(String name) {
        WebElement png=Driver.get().findElement(By.xpath("//span//span[text()='"+name+"']"));
        png.click();
        new ContactsPage().ChooseButton.click();
        String expect="contact-header-avatar__photo";
        String actual=new ContactsPage().AfterUploadPicture.getAttribute("class");
        Assert.assertEquals(expect,actual);

    }

    @Then("user can delete with click to delete")
    public void userCanDeleteWithClickToDelete() {

        ContactsPage contactsPage=new ContactsPage();
        WebElement delete=Driver.get().findElement(By.cssSelector("span.action-button__icon.icon-delete"));
        System.out.println(contactsPage.list.size());
        String BeforeDelete=contactsPage.list.get(0).getText();
        delete.click();
        BrowserUtils.waitFor(3);
        String AfterDelete=contactsPage.list.get(0).getText();
        Assert.assertFalse(BeforeDelete.equals(AfterDelete));



    }
}
