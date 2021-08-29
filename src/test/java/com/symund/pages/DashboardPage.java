package com.symund.pages;

import com.symund.utilities.Driver;
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






}
