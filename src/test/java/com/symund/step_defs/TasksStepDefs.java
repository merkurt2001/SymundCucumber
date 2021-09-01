package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import com.symund.pages.TasksPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TasksStepDefs {

    // @SYMU-186 Verify that user can create a new list of tasks

    @When("the user clicks {string} button")
    public void the_user_clicks_button(String string) {

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToPage("tasks");
    }

    @When("the user clicks textbox and enter a list name")
    public void the_user_clicks_textbox_and_enter_a_list_name() {
        new TasksPage().addList.click();
        System.out.println("Add list clicked");

    }

    @Then("the user creates new task list")
    public void the_user_creates_new_task_list() {
        TasksPage tasksPage = new TasksPage();

        BrowserUtils.waitFor(3);
        tasksPage.newList.sendKeys("Personal-Java" + Keys.ENTER);

        System.out.println("Personal-Java-1 list created");
        BrowserUtils.waitFor(3);
        Assert.assertTrue(tasksPage.newList.isDisplayed());
    }

    // @SYMU-187 Verify that user can create a new task
    @When("the user clicks one of the tabs under current on left panel")
    public void the_user_clicks_one_of_the_tabs_under_current_on_left_panel() {
        new TasksPage().addList.click();
        System.out.println("Add a task to personal clicked");
    }

    @When("the user enters a new task name and press enter")
    public void the_user_enters_a_new_task_name_and_press_enter() {
        BrowserUtils.waitFor(3);
        new TasksPage().newList.sendKeys("Review Polymorphism" + Keys.ENTER);
        System.out.println("A Java task added to personal clicked");
    }

    @Then("the user created a new task")
    public void the_user_created_a_new_task() {
        new TasksPage().newList.isDisplayed();
        System.out.println("New task displayed");

    }

    // @SYMU-188 Verify that user add any task to the list of completed tasks
    @Then("the user clicks load all completed tasks button")
    public void the_user_clicks_load_all_completed_tasks_button() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.personal.click();
        BrowserUtils.waitFor(2);
        tasksPage.completedTasks.click();
        System.out.println("Load all completed tasks button clicked");
    }
    @Then("the user created a new task in completed tasks")
    public void the_user_created_a_new_task_in_completed_tasks() {
        BrowserUtils.waitFor(2);
        new TasksPage().addTask.sendKeys("Updating completed Gardening" + Keys.ENTER);
        System.out.println("A task added to completed tasks");
    }

    // @SYMU-189 Verify that a user can add any task to the list of important tasks
    @When("the user clicks important tab")
    public void the_user_clicks_important_tab() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.importantTasks.click();
        System.out.println("Important tasks clicked");

    }

    @Then("the user created a new task in important tasks")
    public void the_user_created_a_new_task_in_important_tasks() {
        BrowserUtils.waitFor(2);
        new TasksPage().addImportantTask.sendKeys("Important Task -2 Added" + Keys.ENTER);
        System.out.println("A task added to important tasks");

    }

    // @SYMU-190 User can see the number of all uncompleted tasks next to the Current tab
    @When("the user can see uncompleted tasks on right panel")
    public void the_user_can_see_uncompleted_tasks_on_right_panel() {
        TasksPage tasksPage = new TasksPage();
        BrowserUtils.waitFor(2);
        tasksPage.currentButton.click();
        Assert.assertTrue(tasksPage.addCurrentButton.isDisplayed());
        System.out.println("Current uncompleted tasks displayed");

    }

}
