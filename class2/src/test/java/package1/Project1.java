package package1;

import static org.junit.Assert.assertEquals;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Project1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization
		
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		
		
		//Assignment-3
		
		//Login
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
     
        //Add to cart
        
        driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
        
        //Checkout
		
		driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("Muhtasim");
		driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("Sajat");
		driver.findElement(By.xpath("//input[@id='Postal Code']")).sendKeys("1216");
		
		
		//Continue & Finish
		
		driver.findElement(By.xpath("//input[@id='Continue']")).click();
		driver.findElement(By.xpath("//button[@id='Finish']")).click();
		
        
		
		//Assignment-2
		
		//First Name & Last Name
		
		driver.findElement(By.id("FirstName")).sendKeys("Muhtasim");
		driver.findElement(By.id("LastName")).sendKeys("Sajat");
		
		//Gender
		
    	WebElement radiobutton = driver.findElement(By.id("male"));
        radiobutton.click();

		//DropDown
		
		WebElement DropDown =  driver.findElement(By.id("option"));
		Select dropDown = new Select(DropDown);
		dropDown.selectByValue("option 3");
		
		//Checklist
		
		WebElement checklistbutton = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > form:nth-child(3) > fieldset:nth-child(1) > input:nth-child(40)"));
		checklistbutton.click();
		
		//Button
		
		driver.findElement(By.xpath("//Button[normalize-space()='Submit']")).click();
				
		
		
		//Assignment-1
		
		//Type : 1 (if else)
		
		
    		    String ExpectedUrl = "https://www.saucedemo.com/";
    		    String ActualUrl = driver.getCurrentUrl();
    	
       	
             	if(driver.getCurrentUrl().equals(ExpectedUrl))
             	{
        		System.out.println("Url Match");
            	}
    	
            	else {
       		    System.out.println("Url Doesn't Match");
            	}
	
    
		
    	//Type : 2 (Assert)
    	
    	
    	        String ExpectedUrl1 = "https://www.saucedemo.com/";
	            String ActualUrl1 = driver.getCurrentUrl();
       	        assertEquals(ActualUrl1,ExpectedUrl1);	
		
		
		//Radiobutton

//		 WebElement radiobutton = driver.findElement(By.id("male"));
//		 radiobutton.click();
//		 
//		 assert radiobutton.isSelected();
//		 System.out.println(radiobutton.isSelected());
		 
		 //Dropdown
		 
		 //WebElement testDropDown = driver.findElement(By.id("option"));
		 //Select dropdown = new Select(testDropDown);
		 
		 //Way-1--Index
		 //dropdown.selectByIndex(3);
		 
		 //Way-2--Value
		 //dropdown.selectByValue("option 3");
		 
		 //Way-3--VisibleText
		 //dropdown.selectByVisibleText("Option 2");
		 
		 
		 //CheckList
		 
//		 WebElement checklistbutton = driver.findElement(By.id("moption"));
//		 checklistbutton.click();
         
        
         //Relative Path
        
         //driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        
         //AbsoultePath
        
         //driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")).click();
        
         //CSS Path
        
         //driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
        
        
		 
	}
	
	

}
