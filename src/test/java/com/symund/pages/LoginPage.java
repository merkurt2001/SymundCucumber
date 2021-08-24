package com.symund.pages;


import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "reset-password-submit")
    public WebElement resetPassword;

    @FindBy(id = "submit-form")
    public WebElement login;

    @FindBy(className = "toggle-password")
    public WebElement eye;

    @FindBy(id = "lost-password")
    public WebElement forgotPassword;

    @FindBy(partialLinkText = "Log in with a device")
    public WebElement loginWithDevice;

    @FindBy(css = "p.warning.wrongPasswordMsg")
    public WebElement errorMessage;

    public void login(String userNameStr, String passwordStr){
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        login.click();

    }

    //TEST
}
