$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Test  the login functionality of mercury tour demo",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo",
  "keyword": "Feature"
});
formatter.before({
  "duration": 365200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "welcome you",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDLoginTest.testuser()"
});
formatter.result({
  "duration": 274719400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login the application with correct username and password",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;login-the-application-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters correct username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user gets confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDLoginTest.user_is_in_login_page()"
});
formatter.result({
  "duration": 6027768300,
  "status": "passed"
});
formatter.match({
  "location": "BDDLoginTest.test()"
});
formatter.result({
  "duration": 20753493400,
  "status": "passed"
});
formatter.match({
  "location": "BDDLoginTest.test1()"
});
formatter.result({
  "duration": 526530700,
  "status": "passed"
});
formatter.after({
  "duration": 143500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "the user should be able to log in one",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-to-log-in-one",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user enters correct loginusername \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters correct Password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user gets confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-to-log-in-one;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-to-log-in-one;;1"
    },
    {
      "cells": [
        "usrone",
        "pasone"
      ],
      "line": 19,
      "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-to-log-in-one;;2"
    },
    {
      "cells": [
        "usrscn",
        "passcn"
      ],
      "line": 20,
      "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-to-log-in-one;;3"
    },
    {
      "cells": [
        "usrthr",
        "pasthr"
      ],
      "line": 21,
      "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-to-log-in-one;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 167000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "welcome you",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDLoginTest.testuser()"
});
formatter.result({
  "duration": 124500,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "the user should be able to log in one",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-to-log-in-one;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user enters correct loginusername usrone",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters correct Password pasone",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user gets confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDLoginTest.user_is_in_login_page()"
});
formatter.result({
  "duration": 107597500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usrone",
      "offset": 34
    }
  ],
  "location": "BDDLoginTest.test_user(String)"
});
formatter.result({
  "duration": 6050800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pasone",
      "offset": 29
    }
  ],
  "location": "BDDLoginTest.test_Password(String)"
});
formatter.result({
  "duration": 196700,
  "status": "passed"
});
formatter.match({
  "location": "BDDLoginTest.test1()"
});
formatter.result({
  "duration": 90680300,
  "status": "passed"
});
formatter.after({
  "duration": 187300,
  "status": "passed"
});
formatter.before({
  "duration": 161600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "welcome you",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDLoginTest.testuser()"
});
formatter.result({
  "duration": 113600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "the user should be able to log in one",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-to-log-in-one;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user enters correct loginusername usrscn",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters correct Password passcn",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user gets confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDLoginTest.user_is_in_login_page()"
});
formatter.result({
  "duration": 42697900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usrscn",
      "offset": 34
    }
  ],
  "location": "BDDLoginTest.test_user(String)"
});
formatter.result({
  "duration": 175500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passcn",
      "offset": 29
    }
  ],
  "location": "BDDLoginTest.test_Password(String)"
});
formatter.result({
  "duration": 174000,
  "status": "passed"
});
formatter.match({
  "location": "BDDLoginTest.test1()"
});
formatter.result({
  "duration": 63905500,
  "status": "passed"
});
formatter.after({
  "duration": 104500,
  "status": "passed"
});
formatter.before({
  "duration": 102000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "welcome you",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDLoginTest.testuser()"
});
formatter.result({
  "duration": 183000,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "the user should be able to log in one",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-to-log-in-one;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user enters correct loginusername usrthr",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters correct Password pasthr",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user gets confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDLoginTest.user_is_in_login_page()"
});
formatter.result({
  "duration": 50463100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usrthr",
      "offset": 34
    }
  ],
  "location": "BDDLoginTest.test_user(String)"
});
formatter.result({
  "duration": 182800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pasthr",
      "offset": 29
    }
  ],
  "location": "BDDLoginTest.test_Password(String)"
});
formatter.result({
  "duration": 124000,
  "status": "passed"
});
formatter.match({
  "location": "BDDLoginTest.test1()"
});
formatter.result({
  "duration": 56729700,
  "status": "passed"
});
formatter.after({
  "duration": 287900,
  "status": "passed"
});
formatter.before({
  "duration": 385900,
  "status": "passed"
});
formatter.before({
  "duration": 124800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "welcome you",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDLoginTest.testuser()"
});
formatter.result({
  "duration": 173500,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "the user should be able to log in two",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-to-log-in-two",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@web"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user is in the login \"page\"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user gets confirmation page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "page",
      "offset": 22
    }
  ],
  "location": "BDDLoginTest.user_is_in_the_login(String)"
});
formatter.result({
  "duration": 875900,
  "status": "passed"
});
formatter.match({
  "location": "BDDLoginTest.test1()"
});
formatter.result({
  "duration": 123577500,
  "status": "passed"
});
formatter.after({
  "duration": 160400,
  "status": "passed"
});
formatter.after({
  "duration": 517000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 28,
  "name": "the user should be able log in three",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-log-in-three",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 29,
  "name": "user enters correct as loginusername \u003cusername\u003e",
  "keyword": "When "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-log-in-three;",
  "rows": [
    {
      "cells": [
        "username"
      ],
      "line": 32,
      "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-log-in-three;;1"
    },
    {
      "cells": [
        "usrone"
      ],
      "line": 33,
      "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-log-in-three;;2"
    },
    {
      "cells": [
        "usrscn"
      ],
      "line": 34,
      "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-log-in-three;;3"
    },
    {
      "cells": [
        "usrthr"
      ],
      "line": 35,
      "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-log-in-three;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1015500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "welcome you",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDLoginTest.testuser()"
});
formatter.result({
  "duration": 188000,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "the user should be able log in three",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-log-in-three;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 29,
  "name": "user enters correct as loginusername usrone",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "usrone",
      "offset": 37
    }
  ],
  "location": "BDDLoginTest.user_enters_correct_as_loginusername_sui(String)"
});
formatter.result({
  "duration": 261400,
  "status": "passed"
});
formatter.after({
  "duration": 110700,
  "status": "passed"
});
formatter.before({
  "duration": 256800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "welcome you",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDLoginTest.testuser()"
});
formatter.result({
  "duration": 468900,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "the user should be able log in three",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-log-in-three;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 29,
  "name": "user enters correct as loginusername usrscn",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "usrscn",
      "offset": 37
    }
  ],
  "location": "BDDLoginTest.user_enters_correct_as_loginusername_sui(String)"
});
formatter.result({
  "duration": 189500,
  "status": "passed"
});
formatter.after({
  "duration": 107900,
  "status": "passed"
});
formatter.before({
  "duration": 410600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "welcome you",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDLoginTest.testuser()"
});
formatter.result({
  "duration": 333200,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "the user should be able log in three",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-log-in-three;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 29,
  "name": "user enters correct as loginusername usrthr",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "usrthr",
      "offset": 37
    }
  ],
  "location": "BDDLoginTest.user_enters_correct_as_loginusername_sui(String)"
});
formatter.result({
  "duration": 404400,
  "status": "passed"
});
formatter.after({
  "duration": 138800,
  "status": "passed"
});
formatter.before({
  "duration": 537900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "welcome you",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDLoginTest.testuser()"
});
formatter.result({
  "duration": 242700,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "the user should be able to log in four",
  "description": "",
  "id": "test--the-login-functionality-of-mercury-tour-demo;the-user-should-be-able-to-log-in-four",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "I will use data table",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 39
    },
    {
      "cells": [
        "usrone",
        "pasone"
      ],
      "line": 40
    },
    {
      "cells": [
        "usrscn",
        "passcn"
      ],
      "line": 41
    },
    {
      "cells": [
        "usrthr",
        "pasthr"
      ],
      "line": 42
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "BDDLoginTest2.i_will_use_data_table(DataTable)"
});
formatter.result({
  "duration": 4349800,
  "status": "passed"
});
formatter.after({
  "duration": 141500,
  "status": "passed"
});
});