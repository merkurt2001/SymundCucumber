package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ContactGroupsPage extends BasePage{

    @FindBy(css = "span.app-navigation-entry__title")
    public List<WebElement> availableContactGroups;

    @FindBy(xpath = "//div[contains(@class,'property__value property__title--right')]")
    public List<WebElement> contactPropertyTitles;

    @FindBy(css = "input[placeholder='Choose property type']")
    public WebElement propertySelection;

    public List<String> getAvailableContactGroupNames(){
        List<String> groupNames = new ArrayList<>();
        for (int i = 2; i < availableContactGroups.size()-1; i++) {
            groupNames.add(availableContactGroups.get(i).getText());
        }
        return groupNames;
    }


}
