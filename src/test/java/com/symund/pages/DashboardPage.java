package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{

    public DashboardPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "div.avatardiv.avatardiv-shown")
    public WebElement userStatus;

    @FindBy(css = "span.user-status-menu-item__header")
    public WebElement userProfile;




}
