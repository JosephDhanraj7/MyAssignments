package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
				
		//to launch the website
		driver.get("http://leaftaps.com/opentaps/");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To locate the WebElement --> find Element()
		 WebElement usernameField = driver.findElement(By.id("username"));
		 
		 //To enter the value  to the WebElement --> sendkeys()
		 usernameField.sendKeys("demosalesmanager");
		
		 //Locate the password field and enter the password as crmsfa
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 
		 //Locate the login button and click on the login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		//Locate the CRM/SFA button and click
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		//Locate the Accounts tab and click on the Accounts button
		 driver.findElement(By.linkText("Accounts")).click();
		 
		//Locate the create account button and click on the create account button
		 driver.findElement(By.linkText("Create Account")).click();
		 
		//locating account name and sending a text using sendkeys
		 driver.findElement(By.id("accountName")).sendKeys("SampleforTestings2");
		 
		 //locating description and sending a text using sendkeys
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 
		 //Industry dropdown
		 WebElement industryWE = driver.findElement(By.name("industryEnumId"));
		 Select industryDD = new Select(industryWE);
		 industryDD.selectByIndex(3);
		 
		 //Ownership dropdown
		 WebElement ownershipWE = driver.findElement(By.name("ownershipEnumId"));
		 Select ownershipDD = new Select(ownershipWE);
		 ownershipDD.selectByVisibleText("S-Corporation");
		 
		//source dropdown
		 WebElement sourceWE = driver.findElement(By.id("dataSourceId"));
		 Select sourceDD = new Select(sourceWE);
		 sourceDD.selectByValue("LEAD_EMPLOYEE");
		 
		//MarketingCampaign dropdown
		 WebElement markcampWE = driver.findElement(By.id("marketingCampaignId"));
		 Select markcampDD = new Select(markcampWE);
		 markcampDD.selectByIndex(6);
		 
		//State/Province dropdown
		 WebElement stateWE = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select stateDD = new Select(stateWE);
		 stateDD.selectByValue("TX");
		 
		//locating CreateAccount button and clicking the button to Create an account
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 //delay
		 Thread.sleep(1000);
		 
		 //getting titleName
		 String title = driver.getTitle();
		 
		 //verifying title name
		 String titleCheck = "Create Account | opentaps CRM";
		 
		 //Condition to verify and display the title name 
		 if (title.equals(titleCheck)) {
			System.out.println("Correct Title is "+title);
		}
		 else {
			 System.out.println("Title is incorrect");
		 }
		 
		//delay
		 Thread.sleep(2000);
		 
		//To close the browser window
		driver.close();
	}
}
