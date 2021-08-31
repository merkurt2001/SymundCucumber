@SYMU-495
Feature: Files Options

	Background:
		Given the user login with valid credentials

	@SYMU-488 @wip
	Scenario: Verify that user can add any file to favorites from its own three dots menu-ANC
		When user clicks "files module"
		And user clicks three dots menu which is right side of selected file
		And user clicks add to favorite button
		Then user should see star symbol above the selected files icon
		And user clicks "menu icon"
		And user clicks "favorites tab"
		Then user should see selected file in favorites


	@SYMU-489
	Scenario: Verify that user can rename any file from its own three dots menu - ANC
		When user clicks "files module"
		And user clicks three dots menu which is right side of selected file
		And user clicks "rename"
		And user enters new file name into the line which just appear
		And user clicks "enter"
		Then user should see the file with updated name

	@SYMU-490
	Scenario: Verify that user can put some comments on any file from the file details menu opened right side - ANC
		When user clicks "Files module"
		And user clicks three dots menu which is right side of selected file
		And user clicks "Details"
		And user clicks "Comments"
		And user clicks "Comment TextBox"
		And user enters comment in inputbox
		And user clicks "Comment submit icon"
		Then user should see written comment

	@SYMU-491
	Scenario: Verify that user can delete the comments made on any file from the file details menu opened right side-ANC
		Given the user on comments section
		When user clicks three dots menu between the selected comment
		And user clicks "delete comment"
		Then user should be able to delete comment


