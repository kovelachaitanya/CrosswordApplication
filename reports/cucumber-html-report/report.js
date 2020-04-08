$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestCase.feature");
formatter.feature({
  "line": 1,
  "name": "Crossword website",
  "description": "",
  "id": "crossword-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Check that user can sign in into crossword page",
  "description": "",
  "id": "crossword-website;check-that-user-can-sign-in-into-crossword-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The Crossword page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Login page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "The \"\u003cuserid\u003e\" and \"\u003cuserpassword\u003e\" details are given",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Close browser and quit",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "crossword-website;check-that-user-can-sign-in-into-crossword-page;",
  "rows": [
    {
      "cells": [
        "userid",
        "userpassword"
      ],
      "line": 11,
      "id": "crossword-website;check-that-user-can-sign-in-into-crossword-page;;1"
    },
    {
      "cells": [
        "kovelachaitanya@gmail.com",
        "ilakathamafiliya"
      ],
      "line": 12,
      "id": "crossword-website;check-that-user-can-sign-in-into-crossword-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Check that user can sign in into crossword page",
  "description": "",
  "id": "crossword-website;check-that-user-can-sign-in-into-crossword-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The Crossword page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Login page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "The \"kovelachaitanya@gmail.com\" and \"ilakathamafiliya\" details are given",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Close browser and quit",
  "keyword": "And "
});
formatter.match({
  "location": "CrosswordDefinition_Login.the_Crossword_page_is_opened()"
});
formatter.result({
  "duration": 32232781104,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordDefinition_Login.login_page_is_opened()"
});
formatter.result({
  "duration": 3070816562,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kovelachaitanya@gmail.com",
      "offset": 5
    },
    {
      "val": "ilakathamafiliya",
      "offset": 37
    }
  ],
  "location": "CrosswordDefinition_Login.the_and_details_are_given(String,String)"
});
formatter.result({
  "duration": 1012191462,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordDefinition_Login.close_browser_and_quit()"
});
formatter.result({
  "duration": 2788981007,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Check the user can contact customer care",
  "description": "",
  "id": "crossword-website;check-the-user-can-contact-customer-care",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@tc_02_customercare"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "The crossword webpage is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Customercare icon is  and opened",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "customer query details are given",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "browser is closed and quit",
  "keyword": "And "
});
formatter.match({
  "location": "CrosswordDefinition_customercare.the_crossword_webpage_is_opened()"
});
formatter.result({
  "duration": 24978432479,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordDefinition_customercare.customercare_icon_is_and_opened()"
});
formatter.result({
  "duration": 2342116315,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordDefinition_customercare.customer_query_details_are_given()"
});
formatter.result({
  "duration": 1606503180,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordDefinition_customercare.browser_is_closed_and_quit()"
});
formatter.result({
  "duration": 1371850067,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Check the user can register",
  "description": "",
  "id": "crossword-website;check-the-user-can-register",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@tc_03_Register"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "The crosswrd page is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Clicked on Myaccount",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Given the required details",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Browser is closed",
  "keyword": "And "
});
formatter.match({
  "location": "CrosswordDefinition_Myaccount.the_crosswrd_page_is_launched()"
});
formatter.result({
  "duration": 27193419640,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordDefinition_Myaccount.clicked_on_Myaccount()"
});
formatter.result({
  "duration": 4989271661,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordDefinition_Myaccount.given_the_required_details()"
});
formatter.result({
  "duration": 1730571435,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordDefinition_Myaccount.browser_is_closed()"
});
formatter.result({
  "duration": 1441942867,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Check the user can select a desired book",
  "description": "",
  "id": "crossword-website;check-the-user-can-select-a-desired-book",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@tc_04_Books"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "The crosword page is launched and opened",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Books option is selected",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Desired Book is selected and detail is given",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Browser is quit",
  "keyword": "And "
});
formatter.match({
  "location": "CrosswordDefinition_Books.the_crosword_page_is_launched_and_opened()"
});
formatter.result({
  "duration": 22057815127,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordDefinition_Books.books_option_is_selected()"
});
formatter.result({
  "duration": 2728747047,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordDefinition_Books.desired_Book_is_selected_and_detail_is_given()"
});
formatter.result({
  "duration": 7383016850,
  "status": "passed"
});
formatter.match({
  "location": "CrosswordDefinition_Books.browser_is_quit()"
});
formatter.result({
  "duration": 1765860046,
  "status": "passed"
});
});