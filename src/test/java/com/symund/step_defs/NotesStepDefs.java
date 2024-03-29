package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import com.symund.pages.NotesPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotesStepDefs {
    @When("the user navigates to {string} page")
    public void the_user_navigates_to_page(String string) {

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToPage("notes");
    }



    @And("the user click the three dots in the upper right corner")
    public void theUserClickTheThreeDotsInTheUpperRightCorner() {
        new NotesPage().threeDots2.click();
    }

    @And("the user click the details tab")
    public void theUserClickTheDetailsTab() {

        new NotesPage().detailsButton.click();

        BrowserUtils.waitFor(3);
    }

    @Then("the user should be able to write new categories name")
    public void theUserShouldBeAbleToWriteNewCategoriesName() {

        new NotesPage().newCategories.sendKeys("Personal");
    }

    @And("the user click the set category button")
    public void theUserClickTheSetCategoryButton() {

        new NotesPage().setCategories.click();

        BrowserUtils.waitFor(2);

        new NotesPage().close.click();
    }

    @And("the user click the categories button under new note button")
    public void theUserClickTheCategoriesButtonUnderNewNoteButton() {
        NotesPage notesPage = new NotesPage();

        JavascriptExecutor executor = (JavascriptExecutor)Driver.get();
        executor.executeScript("arguments[0].click();", notesPage.categories);
    }

    @And("the user can see new category appears")
    public void theUserCanSeeNewCategoryAppears() {
        NotesPage notesPage = new NotesPage();

        String actualText = "Personal";
        String expectedText = notesPage.personal.getAttribute("title");

        System.out.println(expectedText);

        Assert.assertEquals(expectedText,actualText);
    }

    @And("the user should be able to click on the three dots next to the new note created")
    public void theUserShouldBeAbleToClickOnTheThreeDotsNextToTheNewNoteCreated() {

        NotesPage notesPage = new NotesPage();

        JavascriptExecutor executor = (JavascriptExecutor)Driver.get();
        executor.executeScript("arguments[0].click();", notesPage.threeDots);

        BrowserUtils.waitFor(2);
        notesPage.addFavorites.click();

    }

    @Then("the user should be able to click delete note")
    public void theUserShouldBeAbleToClickDeleteNote() {

        new NotesPage().delete.click();
    }

    @Then("the user can see empty page and write something")
    public void theUserCanSeeEmptyPageAndWriteSomething() {
        NotesPage notesPage = new NotesPage();
        Assert.assertTrue(notesPage.emptyPage.isEnabled());

    }

    @And("the user click the favorites tab")
    public void theUserClickTheFavoritesTab() {
        NotesPage notesPage = new NotesPage();

        JavascriptExecutor executor = (JavascriptExecutor)Driver.get();
        executor.executeScript("arguments[0].click();", notesPage.favoritesTab);
    }

    @And("the user can see the file newly added")
    public void theUserCanSeeTheFileNewlyAdded() {
        NotesPage notesPage = new NotesPage();

        System.out.println(notesPage.newFile.getText());

        Assert.assertTrue(notesPage.newFile.isDisplayed());
    }

    @And("the user click the favorites notes under the categories")
    public void theUserClickTheFavoritesNotesUnderTheCategories() {
    }

    @Then("User can see notes number of letters and words")
    public void userCanSeeNotesNumberOfLettersAndWords() {

        NotesPage notesPage = new NotesPage();

        String expectedText = "2 words, 14 characters";
        String actualText = notesPage.wordsAndLetter.getText();

        Assert.assertEquals(expectedText,actualText);

    }
}
