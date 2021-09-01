package com.symund.step_defs;
import com.symund.pages.FilesPage;
import com.symund.utilities.BrowserUtils;
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
        BrowserUtils.waitFor(3);

      //  if (button.equals("files module")) {
         //   filesPage.filesIcon.click();
     //   } else if (button.equals("rename")) {
          //  filesPage.renameButton.click();
      //  } else if (button.equals("Details")) {
          //  filesPage.detailsButton.click();
       // } else if (button.equals("favorites tab")) {
           // filesPage.favoritesTab.click();
        //} else if (button.equals("Comments")) {
          //  filesPage.commentsTab.click();
     //   } else if (button.equals("Comments TextBox")) {
           // filesPage.commentTextBox.click();
       // } else if (button.equals("Comment submit icon")) {
          //  filesPage.submitCommitButton.click();
       // } else if (button.equals("add to favorite")){
            //filesPage.removeFromFavorites.click();
           // filesPage.addToFavorites.click();


        switch (button) {
            case "files module":
                filesPage.filesIcon.click();
                break;
            case "rename":
                filesPage.renameButton.click();
                break;
            case "Details":
                filesPage.detailsButton.click();
                break;
            case "favorites tab":
                filesPage.favoritesTab.click();
                break;
            case "Comments":
                filesPage.commentsTab.click();
                break;
            case "Comments TextBox":
                filesPage.commentTextBox.click();
                break;
            case "Comment submit icon":
                filesPage.submitCommitButton.click();
                break;
            case "add to favorite":
                //filesPage.removeFromFavorites.click();
                filesPage.addToFavorites.click();

                break;
        }
    }
//} else if (button.contains("add to favorite")&& filesPage.addToFavorites.getText().contains("Add to favorites")){
//            //filesPage.removeFromFavorites.click();
//             filesPage.addToFavorites.click();
//             }else  {
//                 filesPage.removeFromFavorites.click();
//                 filesPage.addToFavorites.click();
//
//            }

    @When("user clicks three dots menu which is right side of selected file")
    public void user_clicks_three_dots_menu_which_is_right_side_of_selected_file() {

        filesPage.threeDotsMenu.click();

    }


    @Then("user should see star symbol above the selected files icon")
    public void user_should_see_star_symbol_above_the_selected_files_icon() {

    }


    @Then("user should see selected file in favorites")
    public void user_should_see_selected_file_in_favorites() {
        BrowserUtils.waitFor(3);

       Assert.assertTrue(filesPage.selectedFile.getText().contains("Favorite"));

    }

    @And("user enters comment {string}")
    public void userEntersComment(String comment) {

        String commentMessage = comment;
        filesPage.commentTextBox.sendKeys(comment);

    }


    @Then("user should see written comment")
    public void user_should_see_written_comment() {

        BrowserUtils.waitFor(3);
        Assert.assertTrue(filesPage.comments.getText().equals("comment"));



    }

    @Then("user should be able to delete comment")
    public void user_should_be_able_to_delete_comment() {

        filesPage.deleteComment.click();
        Assert.assertFalse(filesPage.comments.getText().contains("Hello") );

    }


    @Given("the user on comments section")
    public void the_user_on_comments_section() {


        filesPage.filesIcon.click();
        filesPage.threeDotsMenu.click();
        filesPage.detailsButton.click();
        filesPage.commentsTab.click();
       Assert.assertTrue(filesPage.commentsTab.isDisplayed());

    }

    @When("user clicks three dots menu between the selected comment")
    public void user_clicks_three_dots_menu_between_the_selected_comment() {



    }



    @And("user enters new file name {string}")
    public void userEntersNewFileName(String fileName) {

        String oldFileName = filesPage.selectedFile.getText();
        filesPage.fileNameText.sendKeys(fileName + Keys.ENTER);


    }

    @Then("user should see the file with updated name")
    public void user_should_see_the_file_with_updated_name() {

        String newFileName = filesPage.selectedFile.getAttribute("name");
       // Assert.assertNotEquals(oldFileName, newFileName);
        //Assert.assertEquals(fileName, newFileName);
    }


}
