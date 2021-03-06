import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;

public class SeleniumExample {
  public static void main(String[] args) {
   // System.setProperty("webdriver.chrome.driver", "c://apk_file//chromedriver.exe");
	WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    testURL();
    List<WebElement> listElement=driver.findElements(By.tagName("a"));
  }

  static void testURL(){
//    String links="https://www.google";
    String links="https://www.google";
    HttpURLConnection connection=null;
    try {
      URL url = new URL(links);
      connection=(HttpURLConnection) url.openConnection();
      connection.setRequestMethod("GET");

    }catch (MalformedURLException mle){
     // mle.printStackTrace();
      System.out.println("Mull URL");
    }
    catch (IOException ioe){
      //ioe.printStackTrace();
      System.out.println("Connection problem");
    }
    try{
      Integer resCode=connection.getResponseCode();
      System.out.println(resCode);
    }catch (UnknownHostException uhe){
      //uhe.printStackTrace();
      System.out.println("Unknow host " + links);
    }
    catch (IOException ioe){
      //ioe.printStackTrace();
      System.out.println("Response code generation problem");
    }

  }
}