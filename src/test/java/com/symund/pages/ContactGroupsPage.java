package com.symund.pages;

import com.symund.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ContactGroupsPage extends ContactsPage{

    @FindBy(css = "span.app-navigation-entry__title")
    public List<WebElement> availableContactGroups;

    @FindBy(xpath = "//div[contains(@class,'property__value property__title--right')]")
    public List<WebElement> contactPropertyTitles;

    @FindBy(xpath = "//input[@placeholder='Choose property type']/..")
    public WebElement choosePropertyTypeElement;

    @FindBy(xpath = "//input[@placeholder='Add contact in group']/../div[@class='multiselect__tags-wrap']")
    public WebElement addContactToGroup;

    @FindBy(xpath = "//div[normalize-space(text())='Groups' and @class='property__label']/following-sibling::div//ul/li[@class='multiselect__element']")
    public List<WebElement> groupOptions;

    @FindBy(css = "span[title='+ New group']")
    public WebElement newGroupBtn;
    @FindBy(css = "li[placeholder='Group name'] input[type='text']")
    public WebElement newGroupNameInput;

    @FindBy(css = "label[for^='action-']")
    public WebElement arrowForNewGroup;
    @FindBy(xpath = "//p[text()='This group already exists']")
    public WebElement warningMessage;

    public List<String> getAvailableContactGroupNames(){
        List<String> groupNames = new ArrayList<>();
        if(availableContactGroups.size()>3){
            for (int i = 2; i < availableContactGroups.size()-1; i++) {
                groupNames.add(availableContactGroups.get(i).getText());
            }
        }
        else{
            groupNames.add("There is no contact group available");
        }
        return groupNames;
    }

    public void selectPropertyToBeAdded(String propertyName){
        Driver.get().findElement(By.cssSelector("div[title='"+propertyName+"']")).click();
    }
}
