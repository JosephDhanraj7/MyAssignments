package week2.day4;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioListInterface {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		
		WebElement genderCB = driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"));
		genderCB.click();
		
		Thread.sleep(5000);
		
		WebElement fashbagCB = driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']"));
		fashbagCB.click();
		
		String itemResult = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Item Result No:" + itemResult);
		
		List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
		Set<WebElement> brandSet = new HashSet<WebElement>(brandList);
		System.out.println("Available Brand List:");
		
		for (WebElement list : brandSet) {
			System.out.println(list.getText());
		}
		// list. - Get the list of names of the bags and print it
		 List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		 System.out.println("Available Bags");
		 for(WebElement bagNames:bagNameList) {
			 System.out.println(bagNames.getText());
		 }
	}
}
