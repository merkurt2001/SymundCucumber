package com.symund.pages;

import com.sun.deploy.config.WinPlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage {


    @FindBy (xpath = "//*[@data-id='files']")
    public WebElement filesIcon;

@FindBy(css = "//a[text()='Favorites']")
    public WebElement favoritesTab;

@FindBy(xpath = "//*[@aria-controls='tab-comments']")
    public WebElement commentsTab;

@FindBy (xpath = "//*[@placeholder='Write message, @ to mention someone …']")
    public WebElement commentTextBox;

@FindBy (xpath = "//*[@class='comment__submit icon-confirm has-tooltip']")
        public WebElement submitCommitButton;

@FindBy (xpath = "//*[@class='icon-menu']")
    public WebElement menuIcon;










}
