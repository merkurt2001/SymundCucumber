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

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveBtn;

    @FindBy(xpath = "//div[@class='action-item app-sidebar-header__menu']//button")
    public WebElement dotClick;


    // It is used for Save, More, Update,Delete and Downloads buttons which are all about EVENT
    public WebElement eventBtns(String btn){

        String tag="";

        if(btn.equals("More") ||btn.equals("Save")||btn.equals("Update") )
            tag="button";
        else if(btn.equals("Download")|| btn.equals("Delete"))
            tag ="span";

        return Driver.get().findElement(By.xpath("//"+tag+"[contains(text(),'"+btn+"')]"));

    }


    public WebElement createdEventInfo(String title, String date){

        String[] dateChange=date.split(" ");   // from 08/30/2021 at 12.00 AM    ---> 08/30/2021

        String[] newDate=dateChange[1].split("/");  //  --> 08, 30, 2021

        String dateFormat= newDate[2]+"-"+ newDate[0]+"-"+newDate[1];  // -->2021-08-30 ,  html uses this format

        return Driver.get().findElement(By.xpath("//td[@data-date='"+dateFormat+"']//div[text()='"+title+"']"));
    }


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
