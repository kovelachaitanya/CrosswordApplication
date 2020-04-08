Feature: Crossword website

@tc_01_Login
Scenario Outline: Check that user can sign in into crossword page
Given The Crossword page is opened
Then Login page is opened
And The "<username>" and "<userpassword>"  details are given
And Close browser and quit

Examples:
			|username                 |userpassword       |
			|kovelachaitanya@gmail.com|ilakathamafiliya|
			|admin 123                 |admin143|
@tc_02_customercare
Scenario: Check the user can contact customer care
Given The crossword webpage is opened
Then Customercare icon is  and opened
And customer query details are given
And  browser is closed and quit

@tc_03_Register
Scenario: Check the user can register
Given The crosswrd page is launched
Then Clicked on Myaccount
And Given the required details
And Browser is closed

@tc_04_Books
Scenario: Check the user can select a desired book
Given The crosword page is launched and opened
Then Books option is selected
And Desired Book is selected and detail is given
And Browser is quit

@tc_05_Selecting_an_item
Scenario: Check the user can select an item from electronics section
Given The crossword website is launched and opened
Then item is searched and selected
And close the browser
