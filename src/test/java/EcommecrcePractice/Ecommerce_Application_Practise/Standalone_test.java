package EcommecrcePractice.Ecommerce_Application_Practise;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Standalone_test {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.findElement(By.id("userEmail")).sendKeys("aniket@yopmail.com");
		
		driver.findElement(By.id("userPassword")).sendKeys("Aniket@123");
		
		driver.findElement(By.id("userPassword")).click();
		
	}

}
