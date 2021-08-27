package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TasksPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Add List')]")
    public List<WebElement> addList;
}
