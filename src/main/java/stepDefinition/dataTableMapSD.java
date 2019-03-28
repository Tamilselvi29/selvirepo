//package stepDefinition;
//
//import java.util.List;
//import java.util.Map;
//
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class dataTableMapSD {
//	
//	@Given("^I enter number1 and number2$")
//	public void i_enter_number_and_number(DataTable data) {
//		
////		Map<String,String> testdata= data.asMap(String.class, String.class);
////		System.out.println(testdata.get("First"));
////		System.out.println(testdata.get("Second"));
//		
//	
////		
////		for( Map<String,String> mapdata: data.asMaps(String.class, String.class)) {
////			String value1=mapdata.get("FirstNo");
////		    String value2=mapdata.get("SecondNo");
////		    System.out.println("Value 1 = " + value1);
////		    System.out.println("Value 2 = " + value2);
////		    System.out.println(Integer.parseInt(value1)+Integer.parseInt(value2));
////		}
////		
//		
//		List<Map<String, String>> list = data.asMaps(String.class, String.class);
//		for(int i=0;i<list.size();i++) {
//		    String value1 = list.get(i).get("FirstNo");
//		    String value2 = list.get(i).get("SecondNo");
//		    
//		    System.out.println("Value 1 = " + value1);
//		    System.out.println("Value 2 = " + value2);
//	
//		    int result = Integer.parseInt(value1)+Integer.parseInt(value2);
//		    System.out.println("Result = " + result);
//		}
// 	}
//	
//
//	@When("^I add two numbers$")
//	public void i_add_two_numbers()  {
//	 System.out.println("Addition of two numbers");
//	}
//
//	@Then("^I print the result$")
//	public void i_print_the_result() {
//	 System.out.println("Print the result");
//	}
//
//}
