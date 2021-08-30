package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class OnlineStatusPage extends BasePage{

    public OnlineStatusPage() { PageFactory.initElements(Driver.get(), this);}

    @FindBy(css = "button.custom-input__emoji-button")
    public WebElement emojiButton;

    @FindBy(css = "form.custom-input__form")
    public WebElement statusMessage;

    @FindBy(xpath = "//button[@class='status-buttons__primary primary']")
    public WebElement setStatus;

    @FindBy(css = "button.status-buttons__select")
    public WebElement clear;

    @FindBy(css = "div.set-status-modal")
    public WebElement OnlineStatusModalPage;

    @FindBy(css = "button.status-buttons__select")
    public WebElement clearStatus;

  //  @FindBy(xpath = "//label[@for='user-status-online-status-'" + string + "]")
    //public List<WebElement> statusMessages;



    @FindBy(css = "span.predefined-status__message")
    public List<WebElement> defaultStatusMessage;


    @FindBy(css = "button.custom-input__emoji-button")
    public WebElement emojiBox;

    public void getEmoji(String string) {
        WebElement emoji = Driver.get().findElement(By.xpath("//span[@data-title='" + string + "']/span"));
        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        executor.executeScript("arguments[0].click();", emoji);
    }


    public void ValidateStatusMessageDisplayed(String expectedStatus){
        BrowserUtils.waitFor(2);
            if (onlineStatus.getText().equals(expectedStatus))
                Assert.assertTrue(onlineStatus.isDisplayed());
        }

 //   @FindBy(xpath = "//label[@for='user-status-online-status-'" + statusM + "]")
 //   public List<WebElement> statusM;

 /*   public void seeEachOption(List<WebElement> options) {
        for (WebElement option : options) {
            Assert.assertTrue(option.isDisplayed());*/







}
