package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		 
		 //Locate the Leads tab and click on the Leads button 
		 driver.findElement(By.linkText("Leads")).click();
		 
		//Locate the create Lead button and click on the create Lead button
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 //Locating to Firstname and sending text through sendkeys
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Elon");
		 
		//Locating to Lastname and sending text through sendkeys
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Musk");
		 
		//Locating to Company and sending text through sendkeys
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tesla");
		 
		//Locating to Title and sending text through sendkeys
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Cars");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 
		//delay
		 Thread.sleep(1000);
		 
		 //getting titleName
		 String title = driver.getTitle();
		 
		 //verifying title name
		 String titleCheck = "View Lead | opentaps CRM";
		 
		 //Condition to very and display the title name 
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
