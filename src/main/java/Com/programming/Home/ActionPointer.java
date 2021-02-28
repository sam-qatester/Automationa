package Com.programming.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPointer {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romeo\\ProTrainingTech\\Home\\src\\"
				+ "Driver\\chromedriver.exe");
		driver=new ChromeDriver();//opening chromedrivrer class constructor 
		//driver.get("https://www.facebook.com");//how to open url in the browsers
		driver.navigate().to("https://www.amazon.com");
		
		driver.manage().window().maximize();
		WebElement Sign=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions ob=new Actions(driver);
		ob.moveToElement(Sign).build().perform();
		
//		WebElement link=driver.findElement(By.linkText("Content & Devices"));
//		ob.moveToElement(link).click().build().perform();
		
		WebElement link=driver.findElement(By.linkText("Music Library"));
		ob.moveToElement(link).click().build().perform();
		Thread.sleep(2000);
		WebElement Music =driver.findElement(By.id("navbarSearchInput"));
		Music.sendKeys("Aye Zindagi");
		Thread.sleep(2000);
		WebElement enter =driver.findElement(By.id("navbarSearchInputButton"));
		enter.click();
		
		WebElement dragrop=driver.findElement(By.id("draggables"));

		
	}

}
