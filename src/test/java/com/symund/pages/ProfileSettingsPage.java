package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfileSettingsPage extends BasePage {

    @FindBy(xpath = "//h3//label")
    public List<WebElement> titlesOfPersonalInfoPage;


}
