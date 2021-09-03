package com.symund.step_defs;

import com.symund.pages.FilesPageEC;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import javax.naming.Name;
import java.io.File;

public class FolderViewStepDefs {
    FilesPageEC filesPageEC = new FilesPageEC();

    @When("the user click {string} folder view button")
    public void the_user_click_folder_view_button(String btnName) {

        new FilesPageEC().folderViewButton(btnName).click();
    }

    @Then("the user should be able to see changes order by {string}")
    public void the_user_should_be_able_to_see_changes_order_by(String string) {

    }

    @Then("the user should be able to see changes of folder view")
    public void the_user_should_be_able_to_see_changes_of_folder_view() {

    }

}
