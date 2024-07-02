package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps");
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
				
		//Click on the leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on create lead from menu
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Google");
		
		//Enter the first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Joseph");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Dhanraj");
		
		//Enter the firstname (local) name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Joe");
		
		//Enter the dept name
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
         
		//Enter the firstname (local) name
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Making everyone to success no man failure");
		
		//Enter the  email address
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("joedhanraj007@gmail.com");
		
		WebElement stateWE = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD = new Select(stateWE);
		stateDD.selectByVisibleText("New York");
		
		//Click on the Create lead btn
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		Thread.sleep(3000);
		
		WebElement clearButton = driver.findElement(By.xpath("//textarea[@id = 'updateLeadForm_description']"));
		clearButton.clear();
		
		driver.findElement(By.xpath("//textarea[@id = 'updateLeadForm_importantNote']")).sendKeys("Winning is a habit");
		
		driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
		
		String title = driver.getTitle();
		
		System.out.println("The Title is " +title);
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
