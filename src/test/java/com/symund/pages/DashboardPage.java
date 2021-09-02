package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends BasePage{

    public DashboardPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (css = "a.file")
    public List<WebElement> photos;

    @FindBy (css = "#contactsmenu-search")
    public WebElement contactsMenuSearch;

    @FindBy (css = "div.full-name")
    public WebElement contactsMenuSearchName;

    @FindBy (css = "input.unified-search__form-input")
    public WebElement magnifyIconSearch;

    @FindBy (xpath = "(//span[@class='unified-search__result-content'])[1]")
    public WebElement searchResultContent;

    @FindBy(css = "h2.app-sidebar-header__maintitle")
    public WebElement sidebarMainTitle;

    public void clickSearchName(String fileName){
        String name = "//a[@class='unified-search__result']//h3[@title='"+fileName+"']";
        Driver.get().findElement(By.xpath(name)).click();
        BrowserUtils.waitFor(2);
    }

    public void getSidebarMainTitle(String fileName){
        String text = Driver.get().findElement(By.cssSelector("h2.app-sidebar-header__maintitle")).getText();
        System.out.println("text = " + text);
        Assert.assertTrue(text.contains(fileName));
    }








}
