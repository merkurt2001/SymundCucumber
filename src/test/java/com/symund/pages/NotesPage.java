package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.ref.WeakReference;
import java.security.PublicKey;

public class NotesPage extends BasePage {

    public NotesPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[@id='notes_new_note']")
    public WebElement newNote;

    @FindBy(xpath = "//li[@class='app-navigation-entry router-link-exact-active active']//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']")
    public WebElement threeDots;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addFavorites;

    @FindBy(xpath = "//span[@class='action-buttons']//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']")
    public WebElement threeDots2;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsButton;
}
