package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{
    @FindBy(id = "new-contact-button")
    public WebElement NewContact;
    @FindBy(id = "contact-org")
    public WebElement Company;
    @FindBy(id = "contact-title")
    public WebElement Title;
    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement AllContact;
    @FindBy(css = "button.action-item__menutoggle.icon-picture-force-white")
    public WebElement Picture;
    @FindBy(xpath = "(//button[@aria-label='Actions'])[7]")
    public WebElement icon;
    @FindBy(xpath = "//span[text()='Choose from Files']")
    public WebElement ChooseFromFiles;



}
