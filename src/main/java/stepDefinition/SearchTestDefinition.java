//package stepDefinition;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class SearchTestDefinition {
//	
//	WebDriver driver;
//	
//
//@Given("^user must be on homepage$")
//public void user_must_be_on_homepage() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
//   driver=new ChromeDriver();
//   driver.get("https://www.expedia.com");
//   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//   driver.manage().window().maximize();
//}
//
//@When("^user must be on Crusies tab$")
//public void user_must_be_on_Crusies_tab() throws Throwable {
//	WebElement cruise=driver.findElement(By.xpath("//ul[@class='tabs cf col']/li[5]/button[@type='button' and @id='tab-cruise-tab-hp']"));
//	cruise.click();
//}
//
//@Then("^User enters source and destination$")
//public void user_enters_source_and_destination(DataTable credential) throws Throwable {
//	List<List<String>> dataTable=credential.raw();
//	
//	String destination=dataTable.get(0).get(0);
//	String depatureMon=dataTable.get(0).get(1);
//	WebElement going_to = driver.findElement(By.id("cruise-destination-hp-cruise"));
//	Select dropdown= new Select(going_to);
//	//dropdown.selectByIndex(2);
//	//dropdown.selectByVisibleText("Mexico");
//	dropdown.selectByVisibleText(destination);
//	Thread.sleep(2000);
//	  
//	WebElement dep_month = driver.findElement(By.id("cruise-departure-month-hp-cruise"));
//	Select dep_month_dropdown= new Select(dep_month);
//	//dep_month_dropdown.selectByVisibleText("May 2019");
//	dep_month_dropdown.selectByVisibleText(depatureMon);
//	
// 
//}
//
//@Then("^User enter No\\. of Travelers$")
//public void user_enter_No_of_Travelers() throws Throwable {
//    
//}
//
//@Then("^User click search button$")
//public void user_click_search_button() throws Throwable {
//	driver.findElement(By.xpath("//section[@id='section-cruise-tab-hp']/form/div[3]/label/button")).click();;
//}
//
//@Then("^Close the browser$")
//public void close_browser() throws InterruptedException {
//	Thread.sleep(5000);
//	driver.quit();
//}
//}
