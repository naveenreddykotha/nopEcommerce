package stepDefinations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingPagePOM;
import pageObjects.RegisterPagePOM;

public class Register_stepdefination {
	WebDriver driver;
	LandingPagePOM landing;
	RegisterPagePOM register;
	
	@Given("User is landed on nopecommerce page")
	public void user_is_landed_on_nopecommerce_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    String pageTitle=driver.getTitle();
	    Assert.assertEquals(pageTitle,"nopCommerce demo store");
	}
	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
		landing=new LandingPagePOM(driver);
		landing.clickOnRegisterBtn();
		//driver.findElement(By.linkText("Register")).click();
	   
	}
	@When("User want to fill the required details has below")
	public void user_want_to_fill_the_required_details_has_below(DataTable dataTable) {
	   List<List<String>> data=dataTable.asLists();
	   register=new RegisterPagePOM(driver);
	   register.clickOnGender();
	   register.setFirstName(data.get(0).get(0));
	   System.out.println(register.getFirstName());
	   
	   register.setLasttName(data.get(0).get(1));
	   System.out.println(register.getLastName());
	   
	   register.setEmail(data.get(0).get(2));
	   
	   register.setPassword(data.get(0).get(3));
	   register.setConfirmPsd(data.get(0).get(3));
	   
	   register.clickOnRegisterBTn();
	   
//	   driver.findElement(By.id("gender-male")).click();
//	   driver.findElement(By.name("FirstName")).sendKeys(data.get(0).get(0));
//	   driver.findElement(By.name("LastName")).sendKeys(data.get(0).get(1));
//	   driver.findElement(By.name("Email")).sendKeys(data.get(0).get(2));
//	   
//	   driver.findElement(By.id("Password")).sendKeys(data.get(0).get(3));
//	   driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get(0).get(3));
//	   
//	   driver.findElement(By.cssSelector("button[class*='next-step']")).click();
	   
	}
	@Then("After sucessfull registration verify with this msg {string}")
	public void after_sucessfull_registration_verify_with_this_msg(String msg) {
		
		String result=register.getSucessMsg();
		Assert.assertEquals(result,msg);
	   
	}

}
