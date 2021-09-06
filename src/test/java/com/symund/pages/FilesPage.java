package com.symund.pages;


import com.symund.utilities.Driver;
import org.openqa.selenium.By;
//import com.sun.deploy.config.WinPlatform;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage {


    @FindBy(xpath = "//*[@data-id='files']")
    public WebElement filesIcon;

    @FindBy(xpath = "//*[@data-id='favorites']")
    public WebElement favoritesTab;

    @FindBy(xpath = "//*[@aria-controls='tab-comments']")
    public WebElement commentsTab;

    @FindBy(xpath = "//*[@placeholder='Write message, @ to mention someone …']")
    public WebElement commentTextBox;

    @FindBy(xpath = "//*[@class='comment__submit icon-confirm has-tooltip']")
    public WebElement submitCommitButton;

    @FindBy(xpath = "//*[@class='icon-menu'] [@id='app-navigation-toggle']")
    public WebElement menuIcon;

    @FindBy(xpath = "//*[@data-tags='_$!<Favorite>!$_']")
    public WebElement favoriteStarIcon;

    @FindBy(xpath = "//*[@data-tags='']")
    public WebElement dataTags;


    @FindBy(xpath = "(//span[@class='fileactions'])[1]//span[@class='icon icon-more']")
    public WebElement threeDotsMenu;

//@FindBy (xpath = "//*[@class='action action-menu permanent']")
    // public WebElement threeDotsMenu;

    @FindBy(xpath = "//*[@class='nametext']")
    public WebElement fileNameText;

    @FindBy(xpath = "//*[@data-action='\"Rename\"']")
    public WebElement renameButton;

    @FindBy(xpath = "//a[@data-action='Favorite']")
    public WebElement addToFavorites;

//@FindBy (className = "action-favorite-container")
//public WebElement addToFavorites;


    @FindBy(xpath = "//*[@class='action-favorite-container']")
    public WebElement removeFromFavorites;


    @FindBy(xpath = "//*[@id='app-content-favorites']//span[@class='nametext']")
    public WebElement selectedFile;

    @FindBy(xpath = "//*[@class=' action-details-container']")
    public WebElement detailsButton;


    @FindBy(xpath = "//*[@class='comment comments__list']")
    public WebElement newComment;

    @FindBy(xpath = "//*[@class='comment__message']")
    public WebElement comments;

    @FindBy(xpath = "//*[@class='action active']//*[@class='action-button focusable']")
    public WebElement deleteComment;

    @FindBy(xpath = "//*[@class='action-item comment__actions'][1]")
    public WebElement commentThreeDots;


    // @FindBy (xpath ="//*[@class='comment comments__list']//*[@class='comment__message' and text()='"+comment+"']")
    //public WebElement selectedComment;


    public WebElement threeDots(String fileName) {
        WebElement threeDot = null;
        String extension = "";
        String fileNameWithoutExt = "";
        if (fileName.contains(".")) {
            fileNameWithoutExt = fileName.substring(0, fileName.lastIndexOf("."));
            extension = fileName.substring(fileName.lastIndexOf("."));
            threeDot = Driver.get().findElement(By.
                    xpath("//div[@id='app-content-files']//span[@class='nametext']//span[text()='" + fileNameWithoutExt + "']/..//span[text()='" + extension + "']/../..//span[@class='fileactions']//span[@class='icon icon-more']"));
        } else {
            threeDot = Driver.get().findElement(By.
                    xpath("//div[@id='app-content-files']//span[@class='nametext']//span[text()='" + fileName + "']/../..//span[@class='fileactions']//span[@class='icon icon-more'] "));

        }

        return threeDot;
    }


    public List<WebElement> selectedFavouriteFile(String fileName) {


        List<WebElement> files;

        String extension = "";
        String fileNameWithoutExt = "";
        if (fileName.contains(".")) {
            fileNameWithoutExt = fileName.substring(0, fileName.lastIndexOf("."));
            extension = fileName.substring(fileName.lastIndexOf("."));
            System.out.println(fileNameWithoutExt);
            System.out.println(extension);
            files = Driver.get().findElements(By.xpath("//*[@id='app-content-favorites']//span[@class='innernametext' and text()='" + fileNameWithoutExt + "']/..//span[@class='extension' and text()='" + extension + "']"));
        } else {
            files = Driver.get().findElements(By.xpath("//*[@id='app-content-favorites']//span[@class='innernametext' and text()='" + fileName + "']"));
        }

        return files;


    }

    public WebElement selectedCommentText(String comment) {

        WebElement comments;

        comments = (WebElement) Driver.get().findElements(By.xpath("//*[@class='comment comments__list']//*[@class='comment__message' and text()='" + comment + "']"));

        return comments;

    }


    public List<WebElement> selectedCommentThreeDots(String comment) {

        List<WebElement> commentThreeDots;

        commentThreeDots = Driver.get().findElements(By.xpath("//*[@class='app-sidebar-tabs__content app-sidebar-tabs__content--multiple']//*[@class='comment comments__list']//*[@class='comment__message' and text()='" + comment + "']/../..//*[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']"));


        return commentThreeDots;
    }
}