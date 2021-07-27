
import org.openqa.selenium.By;   
 import org.openqa.selenium.WebDriver;    
import org.openqa.selenium.chrome.ChromeDriver;

public class First {           
 public static void main(String[] args) {                  
// declaration and instantiation of objects/variables
	 //C:\2019Clairex\0-2021\2021 Study\10 Selenium and Django for Beginners\chromedriver_win32
//System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");    
System.setProperty("webdriver.chrome.driver", "C:\\2019Clairex\\0-2021\\2021 Study\\10 Selenium and Django for Beginners\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();            
// Launch website        
driver.navigate().to("http://www.google.com.au/");                    
// Click on the search text box and send value        
//driver.findElement(By.id("input")).sendKeys("jjtam tutorials");                    
driver.findElement(By.name("q")).sendKeys("java tutorials"); 
//move cursor to other places
driver.findElement(By.cssSelector("form > div:nth-child(1)")).click();
driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
// Click on the search button        
driver.findElement(By.name("btnK")).click();               
 }
}
