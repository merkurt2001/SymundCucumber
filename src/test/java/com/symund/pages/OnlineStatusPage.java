package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineStatusPage {

    public OnlineStatusPage() { PageFactory.initElements(Driver.get(), this);}

    @FindBy(css = "button.custom-input__emoji-button")
    public WebElement emojiButton;

    @FindBy(css = "form.custom-input__form")
    public WebElement statusMessage;

    @FindBy(xpath = "//button[@class='status-buttons__primary primary']")
    public WebElement setStatus;





}
