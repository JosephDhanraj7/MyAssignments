package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
				
		//to launch the facebook website
		driver.get("https://en-gb.facebook.com/");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//delay
		 Thread.sleep(3000);
		
		//Click on create new account button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Entering first name
		driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Joseph");
		
		//Entering last name
		driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("Dhanraj");
		
		//Entering the number
	    driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("987654321");
	    
	    //Entering new password
	    driver.findElement(By.xpath("//input[@name ='reg_passwd__']")).sendKeys("Joseph@777");
      
	    //Selecting DOB dropdowns
	    WebElement dateWE = driver.findElement(By.name("birthday_day"));
		Select dateDD = new Select(dateWE);
		dateDD.selectByValue("7");
		
		WebElement monthWE = driver.findElement(By.name("birthday_month"));
		Select monthDD = new Select(monthWE);
		monthDD.selectByIndex(2);
		
		WebElement yearWE = driver.findElement(By.name("birthday_year"));
		Select yearDD = new Select(yearWE);
		yearDD.selectByVisibleText("1998");
		
		//Selecting gender
		driver.findElement(By.xpath("(//input[@name ='sex'])[2]")).click();
	}

}
