package com.symund.step_defs;

import com.symund.pages.CalendarPage;
import com.symund.pages.DashboardPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalendarStepDefs {


    @Then("the user click {string} button")
    public void the_user_click_button(String btn) {

        if(btn.equals("New Event") || btn.equals("Today") || btn.equals("View Section")){
          new CalendarPage().newTodayView(btn).click();
        }
        else if(btn.equals("Day") || btn.equals("Week") || btn.equals("Month")||btn.equals("List")) {

           new CalendarPage().viewBy(btn).click();
        }

    }

    @When("the user go to {string} tab")
    public void theUserGoToTab(String arg0) {

        new DashboardPage().calendar.click();
    }

    @Then("the user can display {string} calendar view")
    public void theUserCanDisplayCalendarView(String dateType) {

        String type="";

        switch (dateType)
        {
            case "daily":
                type="day";
                break;
            case "weekly":
                 type="week";
                 break;
            case "monthly":
                 type="month";
                 break;

        }

        Assert.assertTrue(new CalendarPage().displayType.getAttribute("aria-label").contains(type));

    }

    @And("the user enter {string} to the Event Title")
    public void theUserEnterOfEventToTheEventTitle(String title) {

        new CalendarPage().eventTitle.sendKeys(title);
    }

    @And("the user enter {string} date to {string} part")
    public void theUserEnterDateToPart(String date, String fromOrTo) {

        WebElement dateInput=new CalendarPage().dateFromTo(fromOrTo);

        // we need to clear date field first
        dateInput.click();
        dateInput.clear();
        dateInput.sendKeys(date);

    }

    @And("the user click {string} button from Event page")
    public void theUserClickButtonFromNewEventPage(String btn) {

        BrowserUtils.waitFor(2);
        new CalendarPage().eventBtns(btn).click();
    }

    @Then("the user can see {string} event on {string} Monthly Calendar view")
    public void theUserCanSeeNewEventOnMonthlyCalendarView(String expectedTitle,String date) {

        //assert title of event to understand if correct event is shown
        Assert.assertEquals(expectedTitle,new CalendarPage().createdEventInfo(expectedTitle,date).getText());  //get title


    }

    @And("the user click {string} on {string} date")
    public void theUserClick(String title,String date) {

        new CalendarPage().createdEventInfo(title,date).click();

    }

    @And("the user click {string} from created event")
    public void theUserClickFromCreatedEvent(String arg0) {

        BrowserUtils.waitFor(1);
        new CalendarPage().dotClick.click();
    }

    @Then("the user can delete event {string} on {string}")
    public void theUserCanDeleteEvent(String title, String date) {


        boolean b;

        if(new CalendarPage().createdEventInfo(title,date).isDisplayed())
            b= true;
        else
            b=false;

        Assert.assertEquals("false",b);



    }
}
