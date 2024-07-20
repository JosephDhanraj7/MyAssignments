package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Contacts")).click();
        //To click on the merge contacts option
        driver.findElement(By.linkText("Merge Contacts")).click();
        //To click on the widget in "From Contacts"
        driver.findElement(By.xpath("(//img[@alt = 'Lookup'])[1]")).click();
        //To click on the first resulting contact
        Set<String> window = driver.getWindowHandles();
        List<String> window1 = new ArrayList<String>(window);
        driver.switchTo().window(window1.get(1));
        driver.findElement(By.xpath("(//a[@class = 'linktext'])[1]")).click();
        //To go to the Parent window
        driver.switchTo().window(window1.get(0));
        //To click on the widget of "To Contact"
        driver.findElement(By.xpath("(//img[@alt = 'Lookup'])[2]")).click();
        //To click on the second resulting contact
        Set<String> window2 = driver.getWindowHandles();
        List<String> window3 = new ArrayList<String>(window2);
        driver.switchTo().window(window3.get(1));
        driver.findElement(By.xpath("(//tbody)[4]/tr/td[@tabindex='0']")).click();
        //To go to the Parent window
        driver.switchTo().window(window3.get(0));
        //To click on the Merge button
        driver.findElement(By.xpath("//a[@class = 'buttonDangerous']")).click();
        //To accept the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //To verify the Title of the page
        String Title = driver.getTitle();
        System.out.println("The Title of the current page is : "+Title);
        if(Title.equals("View Contact|opentaps CRM"))
        {
        	System.out.println("The Title displayed is correct");
        }
        else
        {
        	System.out.println("The Title displayed is not correct");
        }
	}

}