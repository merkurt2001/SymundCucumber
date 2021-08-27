package com.symund.step_defs;

import com.symund.pages.ContactsPage;
import com.symund.pages.DashboardPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

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

        }else if(click.equals("Choose From File")){
            contactsPage.ChooseFromFiles.click();
        }
    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String company, String title) {

        BrowserUtils.waitFor(3);

        ContactsPage contactsPage=new ContactsPage();
        contactsPage.NewContact.click();
        contactsPage.Company.sendKeys(company);
        contactsPage.Title.sendKeys(title+ Keys.ENTER);

    }

    @Then("{string} contacts appears in the All contacts list")
    public void contacts_appears_in_the_All_contacts_list(String name) {



    }

}
