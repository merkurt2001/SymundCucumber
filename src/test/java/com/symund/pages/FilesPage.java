package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage{

    @FindBy(xpath = "((//tbody[@id='fileList']/tr)[1]/td)[1]/label")
    public WebElement firstLineClickButton;

    @FindBy(xpath = "((//tbody[@id='fileList']/tr)[1]/td)[2]/a/span/span")
    public WebElement firstLineText;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement firstLineThreeDot;

    @FindBy(css = ".menuitem.action.action-delete.permanent>span")
    public WebElement firstLineDeleteButton;

    public void deleteFunction(){
        firstLineClickButton.click();
        firstLineThreeDot.click();
        firstLineDeleteButton.click();
    }

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement obligatoryDeletedFilesButton;

    @FindBy(css = ".nav-icon-trashbin.svg.active")
    public WebElement obligatoryDeletedFilesButton2;




}
