package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPageEC extends BasePage{

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

    @FindBy(xpath = "(//tbody[@id='fileList'])[1]/tr")
    public List<WebElement> rows;

    public WebElement folderViewButton(String buttonName){
        return Driver.get().findElement(By.xpath("//div[@id='app-content-files']//a[contains(.,'"+buttonName+"')]"));
    }

    @FindBy(id="view-toggle")
    public WebElement toggleViewBtn;

    @FindBy(id="filestable")
    public WebElement filesTable;


}
