package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeletedFilesPage extends BasePage {

    String getValue = "data-original-title";
    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();


    @FindBy(css = ".nametext.extra-data>span")
    public WebElement firstLineText;

    @FindBy(xpath = "//span[.='Deleted']")
    public WebElement orderButton;

    @FindBy(xpath = "((//table[@id='filestable' and @class='list-container has-controls'])[2]/tbody//td)[@class='date']/span")
    public List<WebElement> date;

    @FindBy(xpath = "(//table[@class='list-container has-controls'])[2]//tr[@data-type='dir']//a//span/span")
    public List<WebElement> folderNames;

    @FindBy(xpath = "(//span[.='Name'])[12]")
    public WebElement nameButton;

    @FindBy(xpath = "//label[contains(@for,'select-trashbin')]")
    public WebElement pickButton;

    @FindBy(xpath = "(//a[@class='actions-selected'])[2]")
    public WebElement threeDot;

    @FindBy(xpath = "(//li[@class='item-delete'])[2]/a/span")
    public WebElement deletePermanent;

    public void deleteFile(){
        pickButton.click();
        BrowserUtils.waitFor(3);
        new DeletedFilesPage().threeDot.click();
        BrowserUtils.waitFor(3);
        new DeletedFilesPage().deletePermanent.click();
    }




}
