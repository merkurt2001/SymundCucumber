package com.symund.step_defs;

import com.symund.pages.DashboardPage;
import com.symund.pages.DeletedFilesPage;
import com.symund.pages.FilesPageEC;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.*;

public class DeleteStepDefs {

    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();

    @And("the user get text that belongs to first line folder")
    public String theUserGetTextThatBelongsToFirstLineFolder() {
        return new FilesPageEC().firstLineText.getText();
    }

    String expectedOutput = theUserGetTextThatBelongsToFirstLineFolder();

    @When("the user delete first file in the page")
    public void the_user_delete_first_file_in_the_page() {
        BrowserUtils.waitForClickablility(new FilesPageEC().firstLineClickButton,10);
       new FilesPageEC().deleteFunction();
    }

    @When("the user navigate left side to {string}")
    public void the_user_navigate_left_side_to(String string) {
        new DashboardPage().navigateToFolderWhichAreLocatedLeftSide("Deleted files");
    }

    @When("the user click order button")
    public void the_user_click_order_button() {
        new DeletedFilesPage().orderButton.click();
    }

    @Then("verify that the most deleted file is placed the first line")
    public void verify_that_the_most_deleted_file_is_placed_the_first_line() {
        String actualOutput = new DeletedFilesPage().firstLineText.getText();
        System.out.println("expectedOutput = " + expectedOutput);
        System.out.println("actualOutput = " + actualOutput);
        Assert.assertEquals(expectedOutput,actualOutput);

    }


    Set<String> nameSet = new TreeSet<>();
    List<String> nameSet2 = new ArrayList<>();
    @When("the user get list as alphabetically")
    public void theUserGetListAsDefaultAndOrderlyBasedOn() {
        List<WebElement> folderNames = new DeletedFilesPage().folderNames;
        for (WebElement folderName : folderNames) {
            nameSet.add(folderName.getText());
        }
        System.out.println("nameSet.toString() = " + nameSet.toString());
        for(String s : nameSet){
            nameSet2.add(s.toLowerCase());
        }
        System.out.println("nameSet2.toString() = " + nameSet2.toString());
    }

    @And("the user click name button")
    public void theUserClickNameButton() {
        new DeletedFilesPage().nameButton.click();
    }

    List<String> nameList = new ArrayList<>();
    @And("the user get list as default")
    public void theUserGetListAsDefault() {
        List<WebElement> folderNames = new DeletedFilesPage().folderNames;
        for (WebElement folderName : folderNames) {
            nameList.add(folderName.getText().toLowerCase());
        }
        System.out.println("nameList.toString() = " + nameList.toString());
    }

    @Then("verify that all deleted files are ordered alphabetically")
    public void verifyThatAllDeletedFilesAreOrderedAlphabetically() {
        Assert.assertEquals(nameSet2,nameList);
    }

    List<String> nameList2 = new ArrayList<>();
    @And("the user create a new list manually as the opposite direction of the alphabet")
    public void theUserCreateANewListManuallyAsTheOppositeDirectionOfTheAlphabet() {
        for(int i=nameList.size()-1;i>=0;i--){
            nameList2.add(nameList.get(i));
        }
        System.out.println("nameList2.toString() = " + nameList2.toString());
    }

    List<String> last = new ArrayList<>();
    @And("the user get list again")
    public void theUserGetListAgain() {
        List<WebElement> folderNames = new DeletedFilesPage().folderNames;
        for (WebElement folderName : folderNames) {
            last.add(folderName.getText().toLowerCase());
        }
        System.out.println("last.toString() = " + last.toString());
    }

    @Then("verify that all deleted files are ordered the opposite direction of alphabet")
    public void verifyThatAllDeletedFilesAreOrderedTheOppositeDirectionOfAlphabet() {
        Assert.assertTrue(nameList2.equals(last));
    }


    List<String> list = new ArrayList<>();
    @When("define Box")
    public void defineBox() {
        List<WebElement> folderNames = new DeletedFilesPage().folderNames;
        for(WebElement element : folderNames){
            list.add(element.getText());
        }
        System.out.println("list.toString() = " + list.toString());
        System.out.println("list.size() = " + list.size());
    }

    @And("delete folder")
    public void deleteFolder() {
        new DeletedFilesPage().deleteFile();
    }

    List<String> list2 = new ArrayList<>();
    @Then("verify that delete file permanently")
    public void verfiyThatDeleteFilePermanently() {
        List<WebElement> folderNames = new DeletedFilesPage().folderNames;
        for(WebElement element : folderNames){
            list2.add(element.getText());
        }
        System.out.println("list2.toString() = " + list2.toString());
        System.out.println("list2.size() = " + list2.size());
        Assert.assertTrue(list.size() == list2.size()+1);
    }


}
