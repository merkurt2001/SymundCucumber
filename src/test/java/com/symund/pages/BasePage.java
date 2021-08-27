package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    @FindBy(css = "div.logo.logo-icon")
    public WebElement pageLogo;

    @FindBy(css = "#appmenu>li[data-id='dashboard']")
    public WebElement dashboard;

    @FindBy(css = "#appmenu>li[data-id='files']")
    public WebElement files;

    @FindBy(css = "#appmenu>li[data-id='photos']")
    public WebElement photos;

    @FindBy(css = "#appmenu>li[data-id='activity']")
    public WebElement activity;

    @FindBy(css = "#appmenu>li[data-id='spreed']")
    public WebElement talk;

    @FindBy(css = "#appmenu>li[data-id='mail']")
    public WebElement mail;

    @FindBy(css = "#appmenu>li[data-id='contacts']")
    public WebElement contacts;

    @FindBy(css = "#appmenu>li[data-id='circles']")
    public WebElement circles;

    @FindBy(css = "#appmenu>li[data-id='calendar']")
    public WebElement calendar;

    @FindBy(css = "#appmenu>li[data-id='notes']")
    public WebElement notes;

    @FindBy(css = "#appmenu>li[data-id='deck']")
    public WebElement deck;

    @FindBy(css = "#appmenu>li[data-id='tasks']")
    public WebElement tasks;

    @FindBy(id = "unified-search")
    public WebElement magnifyIcon;

    @FindBy(css = "div.notifications")
    public WebElement notifications;

    @FindBy(css = "#contactsmenu")
    public WebElement contactsMenu;

    @FindBy(css = "div.avatardiv.avatardiv-shown")
    public WebElement userStatus;

    @FindBy(css = "span.user-status-menu-item__header")
    public WebElement userProfile;

    @FindBy(xpath = "//li[contains(@data-id,'set')]")
    public WebElement profileSettingsOption;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logout;



    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    /**
      *@return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
//        ant time we are verifying page name, or page subtitle, loader mask appears
//        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return dashboard.getText();
    }

    public String getPageTitle(){
        return Driver.get().getTitle();
    }




    /**
     * This method will navigate user to the specific module in zerobank application.
     * */
    public void navigateToPage(String pageName) {
        String pageLocator = "#appmenu>li[data-id='"+pageName+"']";

        try {
            BrowserUtils.waitForClickablility(By.cssSelector(pageLocator), 5);
            WebElement pageElement = Driver.get().findElement(By.cssSelector(pageLocator));
            new Actions(Driver.get()).moveToElement(pageElement).click().perform();
            //new Actions(Driver.get()).moveToElement(pageElement).pause(200).doubleClick(pageElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.cssSelector(pageLocator), 5);
        }
    }




}
