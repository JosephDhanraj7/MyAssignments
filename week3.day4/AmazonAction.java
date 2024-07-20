package week3.day4;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAction {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Load the URL (https://www.amazon.in/)
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Search for "oneplus 9 pro"
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro"+Keys.ENTER);
		
		//Get the price of the first product
		String price = driver.findElement(By.xpath("(//span[@class = 'a-price'])[1]")).getText();
		System.out.println(price);
		
		Thread.sleep(2000);
		//Print the number of customer ratings for the first displayed product.
		String rating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println(rating);
		
		//Click the first text link of the first image.
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandles2 = new ArrayList<String>(windowHandles);
        driver.switchTo().window(windowHandles2.get(1));
        
        //Click the 'Add to Cart' button.
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        
        //Get the cart subtotal and verify if it is correct
        String finalprice = driver.findElement(By.xpath("(//span[text() = '₹28,889.00'])[7]")).getText();
        System.out.println("The cart total is : "+finalprice);
        if(finalprice.equals(price+".00"))
        {
        	System.out.println("Amount is verified correctly");
        }
        else
        {
        	System.out.println("The Amount is incorrect");
        }
	}

}
