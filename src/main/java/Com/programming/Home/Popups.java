package Com.programming.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romeo\\ProTrainingTech\\Home\\src\\"
				+ "Driver\\chromedriver.exe");
		driver=new ChromeDriver();//opening chromedrivrer class constructor 
		//driver.get("https://www.facebook.com");//how to open url in the browsers
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver\r\n");
		
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.name("alert"));
		name.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		WebElement checkbox=driver.findElement(By.name("confirmation"));
		checkbox.click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
	    WebElement prompt=	driver.findElement(By.name("prompt"));
	    prompt.click();
	    Thread.sleep(4000);
	    driver.switchTo().alert().sendKeys("wait");
	    
	    Thread.sleep(6000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(56000);
		driver.close();
	}

}
