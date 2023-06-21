package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPagePOM {
	WebDriver driver;
	public RegisterPagePOM(WebDriver driver) {
		this.driver=driver;
	}
	
	By gender=By.id("gender-male");
	By first_name=By.name("FirstName");
	By last_name=By.name("LastName");
	By email=By.name("Email");
	By password=By.id("Password");
	By confirm_pwd=By.id("ConfirmPassword");
	By register_btn=By.cssSelector("button[class*='next-step']");
	
	By successMsg=By.xpath("//div[@class='page-body']/child::div[1]");
	
	public void clickOnGender() {
		driver.findElement(gender).click();
	}
	
	public void setFirstName(String name) {
		driver.findElement(first_name).sendKeys(name);
	}
	public String getFirstName() {
		return driver.findElement(first_name).getText();
	}
	
	public void setLasttName(String name) {
		driver.findElement(last_name).sendKeys(name);
	}
	public String getLastName() {
		return driver.findElement(first_name).getText();
	}
	
	public void setEmail(String name) {
		driver.findElement(email).sendKeys(name);
	}
	
	public void setPassword(String name) {
		driver.findElement(password).sendKeys(name);
	}
	
	public void setConfirmPsd(String name) {
		driver.findElement(confirm_pwd).sendKeys(name);
	}
	
	public void clickOnRegisterBTn() {
		driver.findElement(register_btn).click();
	}
	
	public String getSucessMsg() {
		return driver.findElement(successMsg).getText();
	}

}
