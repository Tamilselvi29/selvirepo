//package stepDefinition;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//
//public class hookingTagsTestDefinition {
//
//	
////Global Hooks - Execute before each scenario
//@Before()
//public void setUp() {
//	System.out.println("Launch");
//}
//
//@After()
//public void tearDown() {
//	System.out.println("Close");
//}
//
//
////local - execute only for @Second scenario
//@Before("@Second")
//public void setUpForSpecificScenario()
//{
//	System.out.println("Before Second Scenario");
//}
//
//
//@After("@Second")
//public void tearDownForSpecificScenario()
//{
//	System.out.println("After Second Scenario");
//}
//
//@Given("^First example$")
//public void first_example() {
//	System.out.println("First");
//}
//
//@Given("^Second example$")
//public void second_example() {
//	System.out.println("Second");
//}
//
//@Given("^Third example$")
//public void third_example()  {
//	System.out.println("Third");
//}
//
//}
