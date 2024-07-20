package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceLogin {
	
	ChromeDriver driver;
		
	@Given ("Launch the browser and open Salesforce url") 
	public void launchSalesforce() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	@Given ("Enter the username and Password")
	public void enterCredentials() {
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$123");
	}
	@When ("Click on Login")
	public void clickLogin() {
		driver.findElement(By.id("Login")).click();
	}
	@Given ("Click on toggle button from the left corner")
	public void toggleButton() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	@Given ("Click View All and click Sales from App Launcher")
	public void clickSales() {
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();", sales);
	}
	@Given ("Click Accounts tab")
	public void clickAccounts() {
		WebElement accounts = driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[5]"));
		driver.executeScript("arguments[0].click();",accounts);
	}
	@When ("Click New button")
	public void newAccount() throws InterruptedException {
		Thread.sleep(2000);
		WebElement newAccount = driver.findElement(By.xpath("//span[text()='New Account']"));
		driver.executeScript("arguments[0].click();",newAccount);
	}
	@Given ("Enter 'your name' as Account name")
	public void enterName() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Joseph");
	}
	@Given ("Selecting Ownership as Public")
	public void selectOwnership() {
		WebElement ownership = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[3]"));
		driver.executeScript("arguments[0].click();",ownership);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}
	@When ("Click Save")
	public void saveAccount() {
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")).click();
	}
	@Then ("Verify Account is created")
	public void verifyAccountCreation() {
		String text = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		if(text.equals("Joseph")) {
			System.out.println("Account name is correct and displayed as "+text);
		} else {
			System.out.println("Account name is incorrect");
		}

	}
	
	
	
	

	
	
}