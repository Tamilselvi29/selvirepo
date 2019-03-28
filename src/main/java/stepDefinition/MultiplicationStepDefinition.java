//package stepDefinition;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//
//public class MultiplicationStepDefinition {
//	int a,b,c;
//	
//	
//	@Given("^I have variable \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void i_have_variable_and(String arg1, String arg2) {
//	    a=Integer.parseInt(arg1);
//	    b=Integer.parseInt(arg2);
//
//	}
//
//	@When("^I multiplication \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void i_multiplication_and(String arg1, String arg2)  {
//		 a=Integer.parseInt(arg1);
//		 b=Integer.parseInt(arg2);
//	     c=a*b;
//
//	}
//
//	@Then("^I display the Result$")
//	public void i_display_the_Result() {
//
//		System.out.println(a + "*" + b + " Result = "+ c);
//		Assert.assertEquals(50, c);
//	    
//	}
//
//
//}
