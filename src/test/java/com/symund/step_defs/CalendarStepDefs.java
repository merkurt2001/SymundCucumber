package com.symund.step_defs;

import com.symund.pages.CalendarPage;
import com.symund.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
}
