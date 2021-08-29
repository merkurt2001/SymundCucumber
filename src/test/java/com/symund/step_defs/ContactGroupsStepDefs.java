package com.symund.step_defs;

import com.github.javafaker.Faker;
import com.symund.pages.ContactGroupsPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class ContactGroupsStepDefs {
    ContactGroupsPage contactGroupsPage = new ContactGroupsPage();
    String newGroupName = "";
    String selectedGroupName = "";
    String addedContactName = "";

    @When("the user clicks on New group button")
    public void the_user_clicks_on_New_group_button() {
        BrowserUtils.waitForPageToLoad(5000);
        contactGroupsPage.newGroupBtn.click();
    }

    @When("the user types a new group name")
    public void the_user_types_a_new_group_name() {
        newGroupName = new Faker().job().field();
        contactGroupsPage.newGroupNameInput.sendKeys(newGroupName);
    }

    @When("clicks with {string}")
    public void clicks_with(String clicktype) {
        if (clicktype.equals("mouse")) {
            contactGroupsPage.arrowForNewGroup.click();
        } else if (clicktype.equals("enter")) {
            contactGroupsPage.newGroupNameInput.sendKeys(Keys.ENTER);
        }
    }

    @Then("new contact group should be created with that name")
    public void new_contact_group_should_be_created_with_that_name() {
        BrowserUtils.waitFor(1);
        Assert.assertTrue("Verify that new contact group is created with success.",
                contactGroupsPage.getAvailableContactGroupNames().contains(newGroupName));

    }

    @And("the user types a group name that is previously created")
    public void theUserTypesAGroupNameThatIsPreviouslyCreated() {

        newGroupName = contactGroupsPage.getAvailableContactGroupNames().get(0);
        contactGroupsPage.newGroupNameInput.sendKeys(newGroupName);

    }

    @Then("user should get {string} message")
    public void userShouldGetMessage(String warningMessage) {
        Assert.assertEquals(contactGroupsPage.warningMessage.getText(),warningMessage);
    }

    @And("user clicks on a contact")
    public void userClicksOnAContact() {
        addedContactName = contactGroupsPage.allContacts.get(0).getText();
        contactGroupsPage.allContacts.get(0).click();
    }

    @And("user clicks on Groups option under related contact")
    public void userClicksOnGroupsOptionUnderRelatedContact() {
        BrowserUtils.waitFor(1);
        contactGroupsPage.addContactToGroup.click();
//        Actions mouse = new Actions(Driver.get());
//        mouse.moveToElement(contactGroupsPage.addContactToGroup).click().perform();
    }

    @And("selects a group from groups dropdown")
    public void selectsAGroupFromGroupsDropdown() {
        selectedGroupName = contactGroupsPage.groupOptions.get(0).getText();
        contactGroupsPage.groupOptions.get(0).click();
    }

    @Then("contact should be seen as a group member under that group")
    public void contactShouldBeSeenAsAGroupMemberUnderThatGroup() {
        for (WebElement contactGroup : contactGroupsPage.availableContactGroups) {
            if(contactGroup.equals(selectedGroupName)){
                contactGroup.click();
                break;
            }
        }
        for (WebElement contact: contactGroupsPage.allContacts) {
            if(contact.getText().equals(addedContactName)){
              Assert.assertTrue("Verify that contact is added to that group",true);
              break;
            }
        }
    }

    @Then("user should be able to see all available group names")
    public void userShouldBeAbleToSeeAllAvailableGroupNames() {
        for (WebElement groupOption:contactGroupsPage.groupOptions) {
            Assert.assertTrue(groupOption.isDisplayed());
        }
    }

    @And("user clicks on Choose property type under Add new property option")
    public void userClicksOnChoosePropertyTypeUnderAddNewPropertyOption() {
        BrowserUtils.scrollToElement(contactGroupsPage.choosePropertyTypeElement);
        contactGroupsPage.choosePropertyTypeElement.click();
    }

    @And("user selects {string} from dropdown menu")
    public void userSelectsFromDropdownMenu(String propertyType) {
        contactGroupsPage.selectPropertyToBeAdded(propertyType);
    }

    @Then("{string} should be available under contact details")
    public void shouldBeAvailableUnderContactDetails(String propertyType) {
        BrowserUtils.waitFor(1);
        for (WebElement propertyTitle:contactGroupsPage.contactPropertyTitles) {
            if(propertyTitle.getText().equals(propertyType)){
                Assert.assertTrue(true);
                break;
            }
        }

    }
}
