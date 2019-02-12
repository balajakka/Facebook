$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebookpage.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login Page",
  "description": "",
  "id": "facebook-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6417205520,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Test facebook login page",
  "description": "",
  "id": "facebook-login-page;test-facebook-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am chrome user",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I access facebook url",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see facebook login page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookPageStepDef.step1()"
});
formatter.result({
  "duration": 107281514,
  "status": "passed"
});
formatter.match({
  "location": "FacebookPageStepDef.step2()"
});
formatter.result({
  "duration": 2910684060,
  "status": "passed"
});
formatter.match({
  "location": "FacebookPageStepDef.step3()"
});
formatter.result({
  "duration": 726404123,
  "status": "passed"
});
formatter.after({
  "duration": 743877882,
  "status": "passed"
});
formatter.uri("Santander.feature");
formatter.feature({
  "line": 1,
  "name": "santander retail",
  "description": "",
  "id": "santander-retail",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3117519288,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "access to santander retail platform",
  "description": "",
  "id": "santander-retail;access-to-santander-retail-platform",
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
  "name": "I access santander retail url",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I see santander retail page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookPageStepDef.step1()"
});
formatter.result({
  "duration": 103864,
  "status": "passed"
});
formatter.match({
  "location": "SantanderRetailStepDef.santander_step2()"
});
formatter.result({
  "duration": 18156971543,
  "status": "passed"
});
formatter.match({
  "location": "SantanderRetailStepDef.santander_step3()"
});
formatter.result({
  "duration": 49674,
  "status": "passed"
});
formatter.after({
  "duration": 759665188,
  "status": "passed"
});
});