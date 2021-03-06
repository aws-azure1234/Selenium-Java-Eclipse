package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BasicDemo {

	public static void main(String[] args) {

    //Step 1: Launch the Chrome Browser;
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver= new ChromeDriver();
		
	//Step 2: Load the URL;
     driver.get("https://login.salesforce.com/");
		
	//Step 3: Enter the UserName as xyz;
     driver.findElement(By.id("username")).sendKeys("xyz");

	//Step 4: Enter the password as 12345;	
     driver.findElement(By.id("password")).sendKeys("12345");
		
	//Step 5: Click the Login Button;	
    driver.findElement(By.id("Login")).click();
		
	//Step 6: Close the Browser;	
    driver.close();
	}

}
