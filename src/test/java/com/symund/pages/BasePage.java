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
    public WebElement pageSubTitle;

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
        return pageSubTitle.getText();
    }

    public String getPageTitle(){
        return Driver.get().getTitle();
    }

    /**
     *compare two List Of String, for example: columns names
     */
    public void compareLists(List<String> expectedList, List<WebElement> actualList) {

        for (int i = 0; i < expectedList.size(); ) {
            for (WebElement each : actualList) {
                Assert.assertEquals(expectedList.get(i),each.getText());
                i++;
            }
        }
    }


    /**
     * This method will navigate user to the specific module in zerobank application.
     * */
    public void navigateToPage(String page) {
        String pageLocator = "//*[text()='"+page+"']";

        try {
            BrowserUtils.waitForClickablility(By.xpath(pageLocator), 5);
            WebElement pageElement = Driver.get().findElement(By.xpath(pageLocator));
            new Actions(Driver.get()).moveToElement(pageElement).click().perform();
            //new Actions(Driver.get()).moveToElement(pageElement).pause(200).doubleClick(pageElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(pageLocator), 5);
        }
    }

    /**
     * This method will navigate user to the specific module in zerobank application.
     */
    public void navigateToTab(String page, String tab) {
        String pageLocator = "//*[text()='"+page+"']";
        String tabLocator = "//li/a[text()='"+tab+"']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(pageLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(pageLocator));
            new Actions(Driver.get()).moveToElement(tabElement).click().perform();
            BrowserUtils.waitForVisibility(By.xpath(tabLocator), 5);
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(pageLocator), 5);
        }
        try {
//            BrowserUtils.waitForPresenceOfElement(By.xpath(tabLocator), 5);
//            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(tabLocator)));
            Driver.get().findElement(By.xpath(tabLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(tabLocator)),  5);
        }
    }


}
