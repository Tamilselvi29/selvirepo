package stepDefinition;
//package stepDefinition;
//
//import org.junit.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class SampleTestStepDefinition {
//	
//   int number1;
//   int number2;
//
//	@Given("^User enters (\\d+)$")
//	public void user_enters(int arg1) throws Throwable {
//		number1=arg1;
//	 
//	}
//
//	@When("^Checks that the (\\d+) is greater than (\\d+) print too long$")
//	public void checks_that_the_is_greater_than_print_too_long(int arg1, int arg2) throws Throwable {
//		number1=arg1;
//		number2=arg2;
//		
//		//System.out.println("Too Long >>>>>> Number1 =  "+ number1 + "Number2 =  " + number2);
//		
//		if(number1 > number2) {
//			System.out.println("Too long");
//			Assert.assertTrue("Too long",number1>number2);
//		
//		}
//	}
//
//	@When("^Checks that the (\\d+) is lessthan (\\d+) print too short$")
//	public void checks_that_the_is_lessthan_print_too_short(int arg1, int arg2) throws Throwable {
//		number1=arg1;
//		number2=arg2;
//		
//		//System.out.println("Too short >>>>>>Number1 = "+ number1 + "Number2 =  " + number2);
//			
//		if(number1 < number2) {
//			System.out.println("Too short");
//			Assert.assertTrue("Too short",number1<number2);
//		
//		}
//	}
//	
//	
//	
//	
//
//	@Then("^print the message is success$")
//	public void print_the_message_is_success() throws Throwable {
//		System.out.println("Success >>>>>>>Number1 =  "+ number1 + "Number2 = " + number2);
//		
//		Assert.assertTrue("Success",true);
//	   
//	}
//}
//
//
//
