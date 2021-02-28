package Com.programming.Home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Corrections {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romeo\\ProTrainingTech\\Home\\src\\"
//				+ "Driver\\chromedriver.exe");
		//driver=new ChromeDriver();//opening chromedrivrer class constructor 
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\romeo\\Desktop\\selenium\\webdriver\\New folder\\geckodriver-v0.28.0-win64");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\romeo\\ProTrainingTech\\Home\\src\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver=new ChromeDriver();//opening chromedrivrer class constructor 
		//driver.get("https://www.facebook.com");//how to open url in the browsers
		//driver.navigate().to("https://www.amazon.com");
		driver.get("https://www.amazon.com");
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(26, TimeUnit.SECONDS);
//		
//		WebElement bt=driver.findElement(By.id("nav-search-submit-button"));
//		 boolean displayed=bt.isDisplayed();
//		 System.out.println(displayed);
		
		
	}

}
