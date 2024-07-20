package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketAction {
	
	public static void main(String[] args) throws InterruptedException {
		
		    //Navigate to https://www.bigbasket.com/
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.bigbasket.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//Click on "Shop by Category"
			driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']")).click();
			Thread.sleep(2000);
			
			//Mouse over "Foodgrains, Oil & Masala".
			Actions action = new Actions(driver);
	        WebElement food = driver.findElement(By.xpath("(//ul[@class = 'jsx-1259984711 w-56 px-2.5 bg-darkOnyx-800 text-silverSurfer-100 rounded-l-xs']//a[text() = 'Foodgrains, Oil & Masala'])[2]"));
	        action.moveToElement(food).perform();
	        Thread.sleep(2000);
	        
	        //Mouse over "Rice & Rice Products".
	        WebElement food1 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
	        action.moveToElement(food1).perform();
	        Thread.sleep(2000);
	        
	        //Click on "Boiled & Steam Rice"
	        driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
	        
	        //Filter the results by selecting the brand "bb Royal"
	        WebElement element = driver.findElement(By.xpath("//input[@id = 'i-BBRoyal']"));
	        driver.executeScript("arguments[0].click();", element);
	        Thread.sleep(2000);
	        
	        //Click on "Tamil Ponni Boiled Rice".
	        driver.findElement(By.xpath("//img[@title='bb Royal Tamil Ponni Boiled Rice 26 kg Bag']")).click();
	        
	        Set<String> windowHandles = driver.getWindowHandles();
	        List<String> windowHandles1 = new ArrayList<String>(windowHandles);
	        driver.switchTo().window(windowHandles1.get(1));
	        Thread.sleep(3000);
	        
	        //Select the 5 Kg bag.
	        WebElement element2 = driver.findElement(By.xpath("//span[text() = '5 kg']"));
	        driver.executeScript("arguments[0].click();", element2);
	        
	        Thread.sleep(2000);
	        //Check and note the price of the rice
	        String price = driver.findElement(By.xpath("//div[@class = 'StickyPdDetail___StyledDiv-sc-1375rlr-3 jgoqZz']")).getText();
	        System.out.println("The price of rice is : "+price);
	        
	        //Click "Add" to add the bag to your cart
	        WebElement element3 = driver.findElement(By.xpath("(//button[text() = 'Add to basket'])[2]"));
	        driver.executeScript("arguments[0].click();", element3);
	        
	        Thread.sleep(2000);
	        //Verify the success message that confirms the item was added to your cart
	        boolean displayed = driver.findElement(By.xpath("//p[text() = 'An item has been added to your basket successfully']")).isDisplayed();
	        System.out.println("The confirmation message is displayed : "+displayed);
			
	        Thread.sleep(2000);
	        //Close the current window.
	        driver.close();
	        
	        //Close the main window.
	        Thread.sleep(5000);
	        driver.quit();
	}

}
