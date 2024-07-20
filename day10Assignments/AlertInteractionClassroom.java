package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteractionClassroom {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Joseph");
		alert.dismiss();
		String message = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(message);
		
		String sweetAlertTxt = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		System.out.println(sweetAlertTxt);
	}

}
