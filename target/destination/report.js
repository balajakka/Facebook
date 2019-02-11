$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebookpage.feature");
formatter.feature({
  "line": 1,
  "name": "login page of facebook",
  "description": "",
  "id": "login-page-of-facebook",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3387824343,
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
  "duration": 172554406,
  "status": "passed"
});
formatter.match({
  "location": "FacebookPageStepDef.step2()"
});
formatter.result({
  "duration": 1998686759,
  "status": "passed"
});
formatter.match({
  "location": "FacebookPageStepDef.step3()"
});
formatter.result({
  "duration": 714578804,
  "status": "passed"
});
formatter.after({
  "duration": 140542691,
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
  "duration": 1650258754,
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
  "duration": 103017,
  "status": "passed"
});
formatter.match({
  "location": "SantanderRetailStepDef.santander_step2()"
});
formatter.result({
  "duration": 13415177889,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.41.578706 (5f725d1b4f0a4acbf5259df887244095596231db),platform\u003dMac OS X 10.11.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027Balas-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:c6b3:1ff:fed2:3f95%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.6\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578706 (5f725d1b4f0a4a..., userDataDir: /var/folders/x0/0mvpb47n4g3...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:59647}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 377aa6a4f1e42b3f693c0b00a9108521\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getWindowHandle(RemoteWebDriver.java:468)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.window(RemoteWebDriver.java:903)\n\tat stepDefinitions.SantanderRetailStepDef.santander_step2(SantanderRetailStepDef.java:51)\n\tat ✽.When I access santander retail url(Santander.feature:4)\n",
  "status": "failed"
});
formatter.match({
  "location": "SantanderRetailStepDef.santander_step3()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 100457269,
  "status": "passed"
});
});