package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfileSettingsPage extends BasePage {

    @FindBy(xpath = "//h3//label")
    public List<WebElement> titlesOfPersonalInfoPage;

    @FindBy(id="displayname")
    public WebElement fullNameInputbox;

    @FindBy(id="oc-dialog-0-content-input")
    public WebElement confirmPasswordPopupInputbox;

    @FindBy(xpath="//button[.='Confirm']")
    public WebElement confirmPasswordPopupConfirmButton;






}
