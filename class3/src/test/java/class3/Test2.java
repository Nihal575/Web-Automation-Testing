package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
    
	WebDriver driver;
	
	@BeforeTest
	
	public void init() 
	{	
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}
	
	@Test(priority=1)
	
	public void login () // Login
	{
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@Test(priority=2)
	
	public void addtocart () // Add to cart
	{
		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
	}
	
	@Test(priority=3)
	
	public void checkout () // Checkout
	{
		driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("Muhtasim");
		driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("Sajat");
		driver.findElement(By.xpath("//input[@id='Postal Code']")).sendKeys("1216");
	}
	
	@Test(priority=4)
	
	public void Continue () // Continue
	{
		driver.findElement(By.xpath("//input[@id='Continue']")).click();
	}
	
	@Test(priority=5)
	
	public void Finish () // Finish
	{
		driver.findElement(By.xpath("//button[@id='Finish']")).click();
	}
	
	
	@AfterTest
	
	public void end() {
		
		driver.quit();
	}
}
