package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import io.cucumber.java.en.When;

public class DashboardStepDefs {

    @When("the user navigate to {string} page")
    public void the_user_navigate_to_page(String pageName) {
       new DashboardPage().navigateToPage(pageName);
    }
}
