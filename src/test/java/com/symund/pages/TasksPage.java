package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TasksPage extends BasePage {

    public TasksPage() { PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//span[starts-with(@title, 'Add List')]")
    public WebElement addList;

    @FindBy(css = "#newListInput")
    public WebElement newList;

    @FindBy(css = "#target")
    public WebElement addTask;

    @FindBy(xpath = "//span[contains(text(),'Meet with the parents')]")
    public WebElement createdTask;
    //not used
    @FindBy(xpath = "//*[contains(text(),'Deck: Personal')]")
    public WebElement deckPersonal;

    @FindBy(xpath = "(//*[contains(text(),'Personal')])[1]")
    public WebElement personal;

    @FindBy(xpath = "//*[contains(text(),'Load all completed tasks.')]")
    public WebElement completedTasks;

    @FindBy(xpath = "(//*[contains(text(),'Important')])[1]")
    public WebElement importantTasks;

    @FindBy(xpath = "//input[starts-with(@placeholder, 'Add an important task')]")
    public WebElement addImportantTask;

    @FindBy(xpath = "//*[contains(text(),'Current')]")
    public WebElement currentButton;

    @FindBy(xpath = "//input[starts-with(@placeholder, 'Add a current task to')]")
    public WebElement addCurrentButton;






}
