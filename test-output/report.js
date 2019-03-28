$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/selvi/NewJava/CucumbetTestNew/src/main/java/Features/sampletest.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration in MecuryFlight site",
  "description": "",
  "id": "user-registration-in-mecuryflight-site",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3539379003,
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
  "name": "I\u0027ve a valid set of data and access to Registration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SampleTestStepDefinition.userValidityCheck()"
});
formatter.write("Navigating to mercury flight demo page");
formatter.result({
  "duration": 2714540678,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 23,
      "value": "#Using Map in DataTable"
    }
  ],
  "line": 25,
  "name": "Multiple User Registration using HASHMAP",
  "description": "",
  "id": "user-registration-in-mecuryflight-site;multiple-user-registration-using-hashmap",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@Registration2"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "Registration page Displayed",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I enter valid data on registration page and verify post-registration",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "phone",
        "email",
        "username",
        "password",
        "confirmpassword"
      ],
      "line": 28
    },
    {
      "cells": [
        "Aditya",
        "Roy",
        "7501451187",
        "a@text.com",
        "aditya91",
        "test123",
        "test123"
      ],
      "line": 29
    },
    {
      "cells": [
        "Rakesh",
        "Sinha",
        "7589866698",
        "b@rars.com",
        "rakesh90",
        "test123",
        "test123"
      ],
      "line": 30
    },
    {
      "cells": [
        "Preety",
        "Sharma",
        "8598745805",
        "preety@t.com",
        "preety18",
        "test123",
        "test123"
      ],
      "line": 31
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "SampleTestStepDefinition.userOnRegistration()"
});
formatter.write("Navigating to Registration page");
formatter.result({
  "duration": 675630795,
  "status": "passed"
});
formatter.match({
  "location": "SampleTestStepDefinition.userData(DataTable)"
});
formatter.write("Enter user registration details for multiple set of data");
formatter.result({
  "duration": 7419300019,
  "status": "passed"
});
formatter.match({
  "location": "SampleTestStepDefinition.close_the_Browser()"
});
formatter.result({
  "duration": 50346,
  "status": "passed"
});
formatter.after({
  "duration": 1455639661,
  "status": "passed"
});
});