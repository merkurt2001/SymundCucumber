package com.symund.step_defs;

import com.symund.pages.FileUploadEditDeletePage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class fileUploadEditDeleteStepDefs {

    FileUploadEditDeletePage fileUploadEditDeletePage = new FileUploadEditDeletePage();

    @Given("the user clicks on the + icon under the top menu")
    public void the_user_clicks_on_the_icon_under_the_top_menu() {
        fileUploadEditDeletePage.plusIcon.click();
    }

    @Then("the user should be able to display Upload file option")
    public void the_user_should_be_able_to_display_Upload_file_option() {
        BrowserUtils.waitFor(5);
        String actualUploadFileOption = fileUploadEditDeletePage.uploadFileButton.getText();
        System.out.println("actualUploadFileOption = " + actualUploadFileOption);
        Assert.assertEquals("Upload file",actualUploadFileOption);
    }

    @When("the user clicks on the Upload file button")
    public void the_user_clicks_on_the_Upload_file_button() {
        BrowserUtils.waitFor(5);
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/test TXT file.txt";
        String fullPath = projectPath + "/" + filePath;
        fileUploadEditDeletePage.uploadFileButton.click();
        fileUploadEditDeletePage.uploadFileButton.sendKeys(fullPath);

    }

    @Then("the user should be able to display uploaded file name in the Files page")
    public void the_user_should_be_able_to_display_uploaded_file_name_in_the_Files_page() {
        BrowserUtils.waitFor(5);
        String actualItemName = fileUploadEditDeletePage.secondLineItemName.getText();
        System.out.println("actualItemName = " + actualItemName);
        Assert.assertEquals("test TXT file",actualItemName);
    }

    @Then("the user should be able to display New folder option")
    public void the_user_should_be_able_to_display_New_folder_option() {
        BrowserUtils.waitFor(5);
        String actualNewFolderOption = fileUploadEditDeletePage.newFolderButton.getText();
        System.out.println("actualNewFolderOption = " + actualNewFolderOption);
        Assert.assertEquals("New folder",actualNewFolderOption);
    }

    @When("the user clicks on the New folder button")
    public void the_user_clicks_on_the_New_folder_button() {
        fileUploadEditDeletePage.newFolderButton.click();
    }

    @Then("the user should be able to enter {string}")
    public void the_user_should_be_able_to_enter(String string) {
        fileUploadEditDeletePage.folderNameField.sendKeys("automationTestFolder");
    }

    @When("the user clicks on right arrow icon")
    public void the_user_clicks_on_right_arrow_icon() {
        fileUploadEditDeletePage.folderNameFieldSubmitButton.click();
    }

    @Then("the user should be able to see You created {string} on the right frame of the page")
    public void the_user_should_be_able_to_see_You_created_on_the_right_frame_of_the_page(String string) {
        BrowserUtils.waitFor(5);
        String actualFolderCreatedMessage = fileUploadEditDeletePage.folderCreatedMessage.getText();
        System.out.println("actualFolderCreatedMessage = " + actualFolderCreatedMessage);
        Assert.assertEquals("automationTestFolder",actualFolderCreatedMessage);
    }

    @When("the user clicks on ellipsis icon in the line that {string} exists")
    public void the_user_clicks_on_ellipsis_icon_in_the_line_that_exists(String string) {
        fileUploadEditDeletePage.sortByName.click();
        BrowserUtils.waitFor(5);
        fileUploadEditDeletePage.firstLineEllipsis.click();
    }

    @Then("the user should be able to display the {string} option in the right-click menu")
    public void the_user_should_be_able_to_display_the_option_in_the_right_click_menu(String string) {
        BrowserUtils.waitFor(5);
        String actualMoveOrCopyOption = fileUploadEditDeletePage.moveOrCopyButton.getText();
        System.out.println("actualMoveOrCopyOption = " + actualMoveOrCopyOption);
        Assert.assertEquals("Move or copy",actualMoveOrCopyOption);
    }

    @When("the user clicks on Move or copy button")
    public void the_user_clicks_on_Move_or_copy_button() {
        fileUploadEditDeletePage.moveOrCopyButton.click();
    }

    @Then("the user should be able to display Choose target folder window")
    public void the_user_should_be_able_to_display_Choose_target_folder_window() {
        BrowserUtils.waitFor(5);
        String actualChooseTargetFolderWindow = fileUploadEditDeletePage.chooseTargetFolderWindow.getText();
        System.out.println("actualChooseTargetFolderWindow = " + actualChooseTargetFolderWindow);
        Assert.assertEquals("Choose target folder",actualChooseTargetFolderWindow);

    }

    @Then("the user clicks on the {string}")
    public void the_user_clicks_on_the(String string) {
        fileUploadEditDeletePage.firstLineInTheChooseTargetFolderWindow.click();
    }

    @Then("the user should be able to display Move to automationTestFolder button")
    public void the_user_should_be_able_to_display_Move_to_automationTestFolder_button() {
        String actualMoveToAutomationTestFolderButtonText = fileUploadEditDeletePage.moveToButton.getText();
        System.out.println("actualMoveToAutomationTestFolderButton = " + actualMoveToAutomationTestFolderButtonText);
        Assert.assertEquals("Move to automationTestFolder",actualMoveToAutomationTestFolderButtonText);
    }

    @When("the user clicks on Move to automationTestFolder button")
    public void the_user_clicks_on_Move_to_automationTestFolder_button() {
        fileUploadEditDeletePage.moveToButton.click();
    }

    @When("the user clicks on the automationTestFolder in the Files page table")
    public void the_user_clicks_on_the_automationTestFolder_in_the_Files_page_table() {
        fileUploadEditDeletePage.secondLineItemName.click();

    }

    @Then("the user should be able to display the moved folder name as {string}")
    public void the_user_should_be_able_to_display_the_moved_folder_name_as(String string) {
        BrowserUtils.waitFor(7);
        String actualMovedFileName = fileUploadEditDeletePage.firstLineItemNameInTheTargetFolderToMove.getText();
        System.out.println("actualMovedFileName = " + actualMovedFileName);
        Assert.assertEquals("test PDF file",actualMovedFileName);
    }

    @When("the user clicks on {string} button")
    public void the_user_clicks_on_button(String string) {
        fileUploadEditDeletePage.deleteFileButton.click();
    }

    @When("the user clicks on the Deleted files button at the bottom of the left frame")
    public void the_user_clicks_on_the_Deleted_files_button_at_the_bottom_of_the_left_frame() {
        fileUploadEditDeletePage.DeletedFilesButton.click();
    }

    @Then("the user should be able to display the file whose name is {string} in deleted files page")
    public void the_user_should_be_able_to_display_the_file_whose_name_is_in_deleted_files_page(String string) {
        BrowserUtils.waitFor(7);
        String actualDeletedFileName = fileUploadEditDeletePage.firstLineInDeletedFilesPage.getText();
        System.out.println("actualDeletedFileName = " + actualDeletedFileName);
        Assert.assertEquals("",actualDeletedFileName);
    }

    @Then("the user should be able to display the total number of files and folders under the files list table")
    public void the_user_should_be_able_to_display_the_total_number_of_files_and_folders_under_the_files_list_table() {
        BrowserUtils.waitFor(5);
        String actualTotalNumberOfFolders = fileUploadEditDeletePage.folderNumber.getText();
        System.out.println("actualTotalNumberOfFolders = " + actualTotalNumberOfFolders);
        //Assert.assertEquals("folders",actualTotalNumberOfFolders);
        Assert.assertTrue("Verify that message contains folders",actualTotalNumberOfFolders.contains("folders"));

        String actualTotalNumberOfFiles = fileUploadEditDeletePage.fileNumber.getText();
        System.out.println("actualTotalNumberOfFiles = " + actualTotalNumberOfFiles);
        //Assert.assertEquals("file",actualTotalNumberOfFiles);
        Assert.assertTrue("Verify that message contains file",actualTotalNumberOfFiles.contains("file"));





    }
}
