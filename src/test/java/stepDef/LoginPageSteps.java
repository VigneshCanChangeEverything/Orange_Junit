package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps {
	
	 WebDriver driver;
	
@Given("Launch the browser")
public void launch_the_browser() {
	
	WebDriverManager.chromedriver().setup();
	
	 driver = new ChromeDriver();
	
}

@Given("Open the Orange Application")
public void open_the_orange_application() {
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current url is "+ currentUrl);
}
//
//@When("User enters (.*) and (.*)")
//public void user_enters_username_and_password(String username,String Password) throws InterruptedException {
//	
//	Thread.sleep(5000);
//	WebElement Field1user = driver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div/following::div/*[@name='username']"));
//	Field1user.sendKeys(username);
//	
//	WebElement Field2user = driver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div/following::div/*[@name='username']"));
//	Field1user.sendKeys(Keys.TAB);
//	
//	WebElement Field2Pass = driver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div/following::div/*[@name='password']"));
//	Field2Pass.sendKeys(Password);
//
//	WebElement LoginBut = driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/child::button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
//	LoginBut.sendKeys(Keys.ENTER);
//   
//}


@When("User enters {string} and {string}")
public void user_enters_and(String username, String Password) throws InterruptedException {
	Thread.sleep(5000);
	WebElement Field1user = driver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div/following::div/*[@name='username']"));
	Field1user.sendKeys(username);
	
//	WebElement Field2user = driver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div/following::div/*[@name='username']"));
//	Field1user.sendKeys(Keys.TAB);
	
	WebElement Field2Pass = driver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div/following::div/*[@name='password']"));
	Field2Pass.sendKeys(Password);

	WebElement LoginBut = driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/child::button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	LoginBut.sendKeys(Keys.ENTER);	
}






@Then("Validate the Dashboard text in the orange Homepage")
public void validate_the_dashboard_text_in_the_orange_homepage() throws InterruptedException {
	
	Thread.sleep(5000);
	
	WebElement DashText = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/child::h6[text()='Dashboard']"));
	System.out.println(DashText);
	
	
	
	
	
	
	
   
}
	
	
	
	
	
	
	
	
	
	
	
	

}
