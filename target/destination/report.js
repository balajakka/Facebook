$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebookpage.feature");
formatter.feature({
  "line": 1,
  "name": "login page of facebook",
  "description": "",
  "id": "login-page-of-facebook",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3238002673,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "test login page elements",
  "description": "",
  "id": "login-page-of-facebook;test-login-page-elements",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am chrome user",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I access facebook url",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I see facebook login page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookPageStepDef.step1()"
});
formatter.result({
  "duration": 166463416,
  "status": "passed"
});
formatter.match({
  "location": "FacebookPageStepDef.step2()"
});
formatter.result({
  "duration": 8199950156,
  "status": "passed"
});
formatter.match({
  "location": "FacebookPageStepDef.step3()"
});
formatter.result({
  "duration": 662533337,
  "status": "passed"
});
formatter.after({
  "duration": 117453499,
  "status": "passed"
});
});