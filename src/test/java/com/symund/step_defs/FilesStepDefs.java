package com.symund.step_defs;

import com.symund.pages.FilesPageEC;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilesStepDefs {

    FilesPageEC filesPageEC = new FilesPageEC();

    List<String> fileNames;
    List<WebElement> files;

    @When("the user click {string} folder view button")
    public void the_user_click_folder_view_button(String buttonName) {

        files = Driver.get().findElements(By.xpath("//table[@id='filestable']/tbody/tr"));
        fileNames = BrowserUtils.getElementsText(files);
        filesPageEC.folderViewButton(buttonName).click();

    }

    @Then("the user should be able to see changes order by {string}")
    public void the_user_should_be_able_to_see_changes_order_by(String string) {



    }

    @Then("the user should be able to see changes of folder view")
    public void theUserShouldBeAbleToSeeChangesOfFolderView() {
    }
}
