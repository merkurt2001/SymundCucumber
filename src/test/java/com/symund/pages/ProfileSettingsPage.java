package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ProfileSettingsPage extends BasePage {

    @FindBy(xpath = "//h3//label")
    public List<WebElement> titlesOfPersonalInfoPage;

    @FindBy(id="displayname")
    public WebElement fullNameInputbox;

    @FindBy(id="oc-dialog-0-content-input")
    public WebElement confirmationPopupPasswordInputbox;

    @FindBy(xpath="//button[.='Confirm']")
    public WebElement confirmationPopupConfirmButton;

    @FindBy(xpath = "(//span[@class='icon-triangle-s'])[4]")
    public WebElement phoneNumberOptions;

    @FindBy(xpath = "(//span[@class='icon-triangle-s']/..)[4]")
    public WebElement phoneNumberIcon;

    @FindBy(id = "localeexample-date")
    public WebElement localDate;

    @FindBy(id = "localeexample-time")
    public WebElement localTime;

    @FindBy(id = "localeexample-fdow")
    public WebElement weekStartsStatement;




    public WebElement navigateToPhoneNumberOption(String option){

        String locator = "//strong[.='"+ option + "' and @class='menuitem-text']";

        return Driver.get().findElement(By.xpath(locator));

    }

    public String getCurrentTime(String timeForm) {


        // Create object of SimpleDateFormat class and decide the format
        DateFormat timeFormat = new SimpleDateFormat(timeForm);

        //get current date time with Date()
        Date time = new Date();

        // Now format the date
        String time1 = timeFormat.format(time);

        return time1;
    }

    public String getCurrentDate(String dateForm) {

        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat(dateForm);

        //get current date time with Date()
        Date date = new Date();

        // Now format the date
        String date1= dateFormat.format(date);

        return date1;
    }

}
