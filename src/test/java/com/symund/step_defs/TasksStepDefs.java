package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import com.symund.pages.TasksPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TasksStepDefs {

    @When("the user clicks {string} button")
    public void the_user_clicks_button(String string) {
        new DashboardPage().tasks.click();
    }

    @When("the user clicks textbox and enter a list name")
    public void the_user_clicks_textbox_and_enter_a_list_name() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.tasks.click();
        TasksPage tasksPage = new TasksPage();
        tasksPage.addList.click();
        System.out.println("Add list clicked");

    }

    @Then("the user creates new task list")
    public void the_user_creates_new_task_list() {
    TasksPage tasksPage = new TasksPage();
    Assert.assertTrue(tasksPage.addList.isDisplayed());

    }


}
