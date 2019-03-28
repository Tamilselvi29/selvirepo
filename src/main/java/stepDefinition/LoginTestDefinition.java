//package stepDefinition;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginTestDefinition {
//
//	WebDriver driver;
//
//	@Given("^User must be on facebook login page$")
//	public void user_already_on_loginpagxe() {
//		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://www.facebook.com");
//	}
//
//	@When("^title of login page is facebook$")
//	public void title_of_login_page() {
//		String title = driver.getTitle();
//		System.out.println("Title of the page " + title);
//		Assert.assertEquals("Facebook - Log In or Sign Up", title);
//	}
//
////	@Then("^enter username and password$")
////	public void enter_username_pwd() {
////		driver.findElement(By.name("email")).sendKeys("rajandhandapani2@gmail.com");
////		driver.findElement(By.name("pass")).sendKeys("vettri180507");
////	}
//
//	@Then("^enter \"(.*?)\" and \"(.*?)\"$")
//	public void enter_and(String arg1, String arg2) {
//		driver.findElement(By.name("email")).sendKeys(arg1);
//		driver.findElement(By.name("pass")).sendKeys(arg2);
//
//	}
//
//	@Then("^user clicks on login button$")
//	public void click_login_button() {
//		driver.findElement(By.id("u_0_2")).click();
//	}
//
//	@Then("^User on home page$")
//	public void user_on_home_page() {
//		String title = driver.getTitle();
//		System.out.println("Home Page Title : " + title);
//		Assert.assertTrue(title.contains("Facebook"));
//	}
//
//	@Then("^user logout$")
//	public void user_logout() throws InterruptedException {
//
//		// Click on navigation label to bring up selection list
//		Thread.sleep(5000);
//		WebElement navigationclick = driver.findElement(By.id("logoutMenu"));
//		navigationclick.click();
//
//		// Click on logout button from drop down menu
//		Thread.sleep(5000);
//		WebElement logout = driver.findElement(By.xpath("//ul[@role='menu']/li[8]/a/span/span"));
//		System.out.println("Log out text " + logout.getText());
//
//		if (logout.isEnabled() && logout.isDisplayed()) {
//			logout.click();
//		} else {
//			System.out.println("Element not found");
//		}
//		Assert.assertTrue(true);
//
//	}
//	
//	@Then("^close the browser$")
//	public void close_browser() {
//		driver.quit();
//	}
//}
