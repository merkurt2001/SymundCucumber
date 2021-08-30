@SYMU-500
Feature: 

	Background:
		#@SYMU-470
		Given the user login with valid credentials
		

	#{color:#00875a}+*User Story :*+{color}
	#
	#{color:#172b4d}As a user, I should be able to create/delete any note and see the details of the note.{color}
	#
	#+_*{color:#de350b}Acceptance Criteria:{color}*_+_**_
	# # {color:#172b4d}User can create a new note{color}
	# # {color:#172b4d}User can add any note to the favorites{color}
	# # {color:#172b4d}User can see the number of letters and words that the note includes under the note title when clicked on the details of the note{color}
	# # *{color:#172b4d}User can create a new category by passing a new category name from inside the notes details{color}*
	# # {color:#172b4d}User can delete any note{color}
	@SYMU-498
	Scenario: Verify that user can create a new category by passing a new category name from inside the notes details -BT
		When the user navigates to "notes" page
		And the user click the three dots in the upper right corner
		And the user click the details tab
		Then the user should be able to write new categories name
		And the user click the set category button
		And the user click the categories button under new note button
		And the user can see new category appears	

	#{color:#00875a}+*User Story :*+{color}
	#
	#{color:#172b4d}As a user, I should be able to create/delete any note and see the details of the note.{color}
	#
	#+_*{color:#de350b}Acceptance Criteria:{color}*_+_**_
	# # {color:#172b4d}User can create a new note{color}
	# # {color:#172b4d}User can add any note to the favorites{color}
	# # {color:#172b4d}User can see the number of letters and words that the note includes under the note title when clicked on the details of the note{color}
	# # {color:#172b4d}User can create a new category by passing a new category name from inside the notes details{color}
	# # *{color:#172b4d}User can delete any note{color}*
	@SYMU-499 @wip
	Scenario: Verify that user can delete any note-BT
		When the user navigate to "notes" page
		And the user should be able to click on the three dots next to the new note created
		Then the user should be able to click delete note	

	#{color:#00875a}+*User Story :*+{color}
	#
	#{color:#172b4d}As a user, I should be able to create/delete any note and see the details of the note.{color}
	#
	#+_*{color:#de350b}Acceptance Criteria:{color}*_+_**_
	# # *{color:#172b4d}User can create a new note{color}*
	# # {color:#172b4d}User can add any note to the favorites{color}
	# # {color:#172b4d}User can see the number of letters and words that the note includes under the note title when clicked on the details of the note{color}
	# # {color:#172b4d}User can create a new category by passing a new category name from inside the notes details{color}
	# # {color:#172b4d}User can delete any note{color}
	@SYMU-485
	Scenario: Verify that user can create new note -BT
		When the user navigate to "notes" page
		Then the user can see empty page and write something	

	#{color:#00875a}+*User Story :*+{color}
	#
	#{color:#172b4d}As a user, I should be able to create/delete any note and see the details of the note.{color}
	#
	#+_*{color:#de350b}Acceptance Criteria:{color}*_+_**_
	# # {color:#172b4d}User can create a new note{color}
	# # *{color:#172b4d}User can add any note to the favorites{color}*
	# # {color:#172b4d}User can see the number of letters and words that the note includes under the note title when clicked on the details of the note{color}
	# # {color:#172b4d}User can create a new category by passing a new category name from inside the notes details{color}
	# # {color:#172b4d}User can delete any note{color}
	@SYMU-486
	Scenario: Verify that user can any note to the favorites-BT
		When the user navigate to "notes" page
		And the user should be able to click on the three dots next to the new note created
		Then the user navigate to "files" page
		And the user click the favorites tab
		And the user can see the file newly added 	

	#{color:#00875a}+*User Story :*+{color}
	#
	#{color:#172b4d}As a user, I should be able to create/delete any note and see the details of the note.{color}
	#
	#+_*{color:#de350b}Acceptance Criteria:{color}*_+_**_
	# # {color:#172b4d}User can create a new note{color}
	# # {color:#172b4d}User can add any note to the favorites{color}
	# # *{color:#172b4d}User can see the number of letters and words that the note includes under the note title when clicked on the details of the note{color}*
	# # {color:#172b4d}User can create a new category by passing a new category name from inside the notes details{color}
	# # {color:#172b4d}User can delete any note{color}
	#
	# 
	@SYMU-492
	Scenario: Verify that user can see the number of letters and words that the note includes under the note-BT
		When the user navigates to "notes" page
		And the user click the favorites notes under the categories
		And the user click the three dots in the upper right corner
		And the user click the details tab
		Then User can see notes number of letters and words