package com.symund.pages;

import com.sun.deploy.config.WinPlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage {


    @FindBy (xpath = "//*[@data-id='files']")
    public WebElement filesIcon;

@FindBy(css = "//*[@data-id='favorites']")
    public WebElement favoritesTab;

@FindBy(xpath = "//*[@aria-controls='tab-comments']")
    public WebElement commentsTab;

@FindBy (xpath = "//*[@placeholder='Write message, @ to mention someone …']")
    public WebElement commentTextBox;

@FindBy (xpath = "//*[@class='comment__submit icon-confirm has-tooltip']")
        public WebElement submitCommitButton;

@FindBy (xpath = "//*[@class='icon-menu'] [@id='app-navigation-toggle']")
    public WebElement menuIcon;

@FindBy(xpath = "//*[@data-tags='_$!<Favorite>!$_']")
    public WebElement favoriteStarIcon;

@FindBy (xpath = "//*[@data-tags='']")
    public WebElement dataTags;

@FindBy (xpath = "//*[@class='action action-menu permanent']")
    public WebElement threeDotsMenu;

@FindBy (xpath = "//*[@class='innernametext']")
    public WebElement fileNameText;

@FindBy (xpath = "//*[@class=' action-rename-container']")
    public WebElement renameButton;

@FindBy (className = "action-favorite-container")
public WebElement addToFavorites;

@FindBy (xpath = "//*[@class='action-favorite-container']")
public WebElement removeFromFavorites;


@FindBy (xpath = "//*[@data-id='1240']")
    public WebElement selectedFile;

@FindBy (xpath = "//*[@class=' action-details-container']")
    public WebElement detailsButton;


@FindBy (xpath = "//*[@class='comment comments__list']")
    public WebElement newComment;

@FindBy (xpath = "//*[@class='comment__message']")
    public WebElement comments;

@FindBy (xpath = "//*[@class='action active']")
    public WebElement deleteComment;


}
