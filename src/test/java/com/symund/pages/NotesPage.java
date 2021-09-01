package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage extends BasePage {

    public NotesPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//li[@class='app-navigation-entry router-link-exact-active active']//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']")
    public WebElement threeDots;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addFavorites;

    @FindBy(xpath = "//span[@class='action-buttons']//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']")
    public WebElement threeDots2;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsButton;

    @FindBy(css = "#category")
    public WebElement newCategories;

    @FindBy(xpath = "//input[@class='icon-confirm loading']")
    public WebElement setCategories;

    @FindBy(xpath = "(//a[@class='app-navigation-entry-link'])[1]")
    public WebElement categories;

    @FindBy(xpath = "//ul[@class='app-navigation-entry__children']//span[contains(.,'Personal')]")
    public WebElement personal;

    @FindBy(xpath = "//button[contains(.,'Delete note')]")
    public WebElement delete;

    @FindBy(css = "div.markdown-editor>textarea")
    public WebElement emptyPage;

    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesTab;

    @FindBy(xpath = "//tr[@data-file='New note.txt']")
    public WebElement newFile;

    @FindBy(xpath = "//p[@class='app-sidebar-header__subtitle']")
    public WebElement wordsAndLetter;

    @FindBy(xpath = "//header[@class='app-sidebar-header']/a[@href='#']")
    public WebElement close;

    @FindBy(xpath = "//button[@id='notes_new_note']")
    public WebElement newNote;

    @FindBy(xpath = "//a[@href='/index.php/apps/notes/note/8041']/span[@class='app-navigation-entry__title']")
    public WebElement helloWorld;

    @FindBy(xpath = "//span[.='Full screen']")
    public WebElement fullScreen;


}
