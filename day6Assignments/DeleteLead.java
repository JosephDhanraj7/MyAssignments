package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
				
				//Click on the Find leads option
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Click on the Phone Tab
				driver.findElement(By.linkText("Phone")).click();
				
				//To enter the phone number
				driver.findElement(By.id("ext-gen270")).sendKeys("9840980350");
				
				//Click on Find Leads Button
				driver.findElement(By.id("ext-gen334")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				WebElement id = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
				String st=id.getText();
				id.click();
				System.out.println(st);
				
				Thread.sleep(3000);
				
				driver.findElement(By.linkText("Delete")).click();
				
				//Click on the Find leads option
				driver.findElement(By.linkText("Find Leads")).click();
				
				driver.findElement(By.id("ext-gen246")).sendKeys("16202");
				
				//Click on Find Leads Button
				driver.findElement(By.id("ext-gen334")).click();
				
				Thread.sleep(5000);
				
				String norecords = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
				System.out.println(norecords);
				
				Thread.sleep(5000);
				
				//To close the browser window
				driver.close();

	}

}
