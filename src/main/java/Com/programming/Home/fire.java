package Com.programming.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fire {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\romeo\\Desktop\\selenium\\webdriver\\New folder\\geckodriver.exe\\-v0.28.0-win64.exe");
//		driver=new FirefoxDriver();
//		WebElement car=driver.findElement(By.id("car"));
		System.setProperty("webdriver.gecko.driver","C:\\Users\\romeo\\ProTrainingTech\\Home\\src\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com");
		
		
		
	}

}
