package com.symund.step_defs;
import com.symund.pages.FilesPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;

public class FilesStepDefs {
    FilesPage filesPage = new FilesPage();


    @When("user clicks {string}")
    public void user_clicks(String button) {


        if (button.contains("files module")) {
            filesPage.filesIcon.click();
        } else if (button.contains("menu icon")) {
            filesPage.menuIcon.click();
        } else if (button.contains("favorites tab")) {
            filesPage.favoritesTab.click();
        } else if (button.contains("Comments")) {
            filesPage.commentsTab.click();
        } else if (button.contains("Comments TextBox")) {
            filesPage.commentTextBox.click();
        } else if (button.contains("Comment submit icon")){
            filesPage.submitCommitButton.click();
         } else if(button.contains("add to favorites")){
            filesPage.addToFavorites.click();
        }  else if (button.contains("rename")){
                filesPage.renameButton.click();
                }
            }





    @When("user clicks three dots menu which is right side of selected file")
    public void user_clicks_three_dots_menu_which_is_right_side_of_selected_file() {

        filesPage.threeDotsMenu.click();

    }


    @Then("user should see star symbol above the selected files icon")
    public void user_should_see_star_symbol_above_the_selected_files_icon() {

    }


    @Then("user should see selected file in favorites")
    public void user_should_see_selected_file_in_favorites() {

    }

    @When("user enters new file name into the line which just appear")
    public void user_enters_new_file_name_into_the_line_which_just_appear() {

        String oldName = filesPage.selectedFile.getText();
        String newName = "Renamed File";

        filesPage.fileNameText.sendKeys("Renamed File");

    }


    @Then("user should see written comment")
    public void user_should_see_written_comment() {




    }

    @Given("the user on comments section")
    public void the_user_on_comments_section() {

       Assert.assertTrue(filesPage.commentsTab.isDisplayed());

    }

    @When("user clicks three dots menu between the selected comment")
    public void user_clicks_three_dots_menu_between_the_selected_comment() {

    }

    @Then("user should be able to delete comment")
    public void user_should_be_able_to_delete_comment() {

    }


    @And("user enters new file name {string}")
    public void userEntersNewFileName(String fileName) {

        String oldFileName = filesPage.selectedFile.getText();
        filesPage.fileNameText.sendKeys(fileName + Keys.ENTER);


    }

    @And("user enters comment {string}")
    public void userEntersComment(String comment) {

        filesPage.commentTextBox.sendKeys(comment + Keys.ENTER);

    }

    @Then("user should see the file with updated name")
    public void user_should_see_the_file_with_updated_name() {

        String newFileName = filesPage.selectedFile.getText();
        Assert.assertNotEquals(oldFileName, newFileName);
        Assert.assertEquals(fileName, true, newFileName);

    }



}
