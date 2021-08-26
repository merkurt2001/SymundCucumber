package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends BasePage {


    public CalendarPage() { PageFactory.initElements(Driver.get(), this);}


    @FindBy(xpath = "(//div[@class='datepicker-button-section']//button)[1]")
    public WebElement displayType;

    @FindBy(css = "input[placeholder='Event title']")
    public WebElement eventTitle;


    public WebElement dateFromTo(String fromOrTo){

        int i=0;

        switch (fromOrTo){

            case "from":
                i=2;
                break;
            case "to":
                i=3;
                break;

        }

        return Driver.get().findElement(By.xpath("(//input[@name='date'])["+i+"]"));
    }

//    public WebElement dateShownBtn(String dateType){
//
//        int i = 0;
//        switch (dateType) {
//            case "previous":
//                i=1;
//                break;
//            case "now":
//                i=2;
//                break;
//            case "next":
//                i=4;
//                break;
//        }
//
//        return Driver.get().findElement(By.xpath("(//div[@class='datepicker-button-section']//button)["+i+"]"));
//
//    }

    // it retrieves Webelement dynamically
    public WebElement newTodayView(String btn){

        int i = 0;
        switch (btn) {
            case "New Event":
                i=1;
                break;
            case "Today":
                i=2;
                break;
            case "View Section":
                i=3;
                break;
        }

       return Driver.get().findElement(By.xpath("(//div[@class='new-event-today-view-section']//button)["+i+"]"));

    }

    // it retrieves Webelement dynamically
    public WebElement viewBy(String btn){

        int i = 0;
        switch (btn) {
            case "Day":
                i=1;
                break;
            case "Week":
                i=2;
                break;

            case "Month":
                i=3;
                break;

            case "List":
                i=4;
                break;
        }

        return Driver.get().findElement(By.xpath("(//ul[contains(@id,'menu')]//button)["+i+"]"));

    }


}
