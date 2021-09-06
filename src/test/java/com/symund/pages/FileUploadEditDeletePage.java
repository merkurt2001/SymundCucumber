package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FileUploadEditDeletePage extends BasePage {

    @FindBy(css = ".icon.icon-add")
    public WebElement plusIcon;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolderButton;

    @FindBy(css = "input[value='New folder']")
    public WebElement folderNameField;

    @FindBy(css = "input[type='submit'][class='icon-confirm']")
    public WebElement folderNameFieldSubmitButton;

    @FindBy(css = "a[class='filename']")
    public WebElement folderCreatedMessage;

    @FindBy(xpath = "((//tbody[@id='fileList']/tr)[1]/td)[2]/a/span/span")
    public WebElement firstLineItemName;

    @FindBy(xpath = "((//tbody[@id='fileList']/tr)[1]/td)[2]/a/span/span[1]")
    public WebElement firstLineItemNameInTheTargetFolderToMove;

    @FindBy(xpath = "((//tbody[@id='fileList']/tr)[2]/td)[2]/a/span/span[1]")
    public WebElement firstLineInDeletedFilesPage;

    @FindBy(xpath = "((//tbody[@id='fileList']/tr)[2]/td)[2]/a/span/span")
    public WebElement secondLineItemName;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement firstLineEllipsis;

    @FindBy(css = "h2[class=oc-dialog-title]")
    public WebElement chooseTargetFolderWindow;

    @FindBy(xpath = "//table[@id='picker-filestable']/tbody/tr[1]")
    public WebElement firstLineInTheChooseTargetFolderWindow;

    @FindBy(css = "button[class='primary']")
    public WebElement moveToButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[2]/div/a/span[1]")
    public WebElement sortByName;

    @FindBy(xpath = "((//tbody[@id='fileList']/tr)[2]/td)[2]/a/span/span[1]")
    public WebElement deletedFilesTableFirstLine;

    @FindBy(xpath = "(//tbody[@id='fileList'])[1]/tr")
    public List<WebElement> allCellsInNameColumn;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement DeletedFilesButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/ul/li[8]/a/span[1]")
    public WebElement deleteFileButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/ul/li[6]/a/span[2]")
    public WebElement moveOrCopyButton;

    @FindBy(css = ".dirinfo")
    public WebElement folderNumber;

    @FindBy(css = ".fileinfo")
    public WebElement fileNumber;





}
