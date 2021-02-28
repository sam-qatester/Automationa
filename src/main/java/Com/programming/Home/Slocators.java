package Com.programming.Home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slocators {
static WebDriver driver;
private static TimeUnit timeunit;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//i)id, name,tagname,linktext,xpath,partiallinktext,class,cssselector
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romeo\\ProTrainingTech\\Home\\src\\"
				+ "Driver\\chromedriver.exe");
		driver=new ChromeDriver();//opening chromedrivrer class constructor 
		driver.get("https://www.amazon.com");//how to open url in the browsers
	
		driver.manage().window().maximize();//maximize page
//		WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
//		Search.sendKeys("computer");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer laptop 32gb");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		driver.findElement(By.className("s-image")).click();
//		driver.findElement(By.id("add-to-cart-button")).click();
//		//driver.manage().timeouts().implicitlyWait(2, timeunit.SECONDS);
//		driver.findElement(By.id("siAddCoverage-announce")).click();
//		driver.quit();
//		WebElement Searchofname=driver.findElement(By.name("find-keywords"));
//		Searchofname.sendKeys("chair");
//		WebElement Books=driver.findElement(By.linkText("Books"));
//		Books.click();
//		WebElement NewBooks=driver.findElement(By.partialLinkText("boo"));
//		NewBooks.click();
		
//		WebElement KidsToys=driver.findElement(By.linkText("Toys & Games"));
//		KidsToys.click();
	
//		WebElement KidsToys=driver.findElement(By.partialLinkText("Toys & G"));
//		KidsToys.click();

		
		
		
		
		Thread.sleep(9000);
	driver.close();
	}

}
