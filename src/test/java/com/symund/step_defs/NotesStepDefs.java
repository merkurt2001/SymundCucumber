package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NotesStepDefs {

    @When("the user navigates to {string} page")
    public void the_user_navigates_to_page(String string) {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToPage("notes");

    }

    @When("the user click the favorites notes under the categories")
    public void the_user_click_the_favorites_notes_under_the_categories() {

    }

    @When("the user click the three dots in the upper right corner")
    public void the_user_click_the_three_dots_in_the_upper_right_corner() {

        
    }

    @When("the user click the details tab")
    public void the_user_click_the_details_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to write new categories name")
    public void the_user_should_be_able_to_write_new_categories_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user click the set category button")
    public void the_user_click_the_set_category_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user click the categories button under new note button")
    public void the_user_click_the_categories_button_under_new_note_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user can see new category appears")
    public void the_user_can_see_new_category_appears() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user should be able to click on the three dots next to the new note created")
    public void the_user_should_be_able_to_click_on_the_three_dots_next_to_the_new_note_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to click delete note")
    public void the_user_should_be_able_to_click_delete_note() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user can see empty page and write something")
    public void the_user_can_see_empty_page_and_write_something() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user click the favorites tab")
    public void the_user_click_the_favorites_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user can see the file newly added")
    public void the_user_can_see_the_file_newly_added() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can see notes number of letters and words")
    public void user_can_see_notes_number_of_letters_and_words() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





}
