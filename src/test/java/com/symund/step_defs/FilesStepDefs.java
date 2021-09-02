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
            case "favorites":
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

            case "delete comment":
                filesPage.deleteComment.click();
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



    @And("user enters comment {string}")
    public void userEntersComment(String comment) {

        filesPage.commentTextBox.sendKeys(comment);

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

    filesPage.selectedCommentText...

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

    }


    @Then("user should see written comment {string}")
    public void userShouldSeeWrittenComment(String comment) {

        System.out.println("Gorme adiminda");

        Assert.assertEquals(comment, filesPage.selectedComment(comment));


        System.out.println("Kontrol etti");

    }

    @And("user clicks three dots menu which is right side of {string} file")
    public void userClicksThreeDotsMenuWhichIsRightSideOfFile(String fileName) {

        filesPage.threeDots(fileName).click();


    }

    @Then("user should see {string} in favorites")
    public void userShouldSeeInFavorites(String fileName) {

        BrowserUtils.waitFor(3);

        Assert.assertTrue(filesPage.selectedFavouriteFile(fileName).size()>0);


    }
}







