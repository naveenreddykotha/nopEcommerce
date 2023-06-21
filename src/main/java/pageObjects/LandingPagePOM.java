package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPagePOM {
	WebDriver driver;
	public LandingPagePOM(WebDriver driver) {
		this.driver=driver;
	}
	
	By register_btn=By.linkText("Register");
	
	public void clickOnRegisterBtn() {
		driver.findElement(register_btn).click();
	}

}
