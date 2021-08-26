package com.symund.step_defs;

import com.symund.pages.CalendarPage;
import com.symund.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

        new CalendarPage().dateFromTo(fromOrTo).sendKeys(date);
    }
}
