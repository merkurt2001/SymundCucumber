package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ContactsPage extends BasePage{
    @FindBy(id = "new-contact-button")
    public WebElement NewContact;
    @FindBy(id = "contact-org")
    public WebElement Company;
    @FindBy(id = "contact-title")
    public WebElement Title;
    @FindBy(css = "div.vue-recycle-scroller__item-wrapper>div")
    public List<WebElement> AllContact;
    @FindBy(css = "button.action-item__menutoggle.icon-picture-force-white")
    public WebElement Picture;
    @FindBy(xpath = "(//button[@aria-label='Actions'])[7]")
    public WebElement icon;
    @FindBy(xpath = "//span[text()='Choose from Files']")
    public WebElement ChooseFromFiles;
    @FindBy(xpath = "//button[text()='Choose']")
    public WebElement ChooseButton;
    @FindBy(xpath = "//div[@class='contact-header-avatar__photo']")
    public WebElement AfterUploadPicture;
    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> list;
    @FindBy(xpath = "//div[@class='app-navigation-entry__counter']")
    public WebElement ContactsNumber;
    @FindBy(id = "contact-fullname")
    public WebElement fullName;






}
