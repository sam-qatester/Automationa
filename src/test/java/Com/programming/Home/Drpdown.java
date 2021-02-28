package Com.programming.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drpdown {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romeo\\ProTrainingTech\\Home\\src\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();//opening chromedrivrer class constructor 
		driver.get("https://www.Facebook.com");//how to open url in the browsers
		//driver.navigate().to("https://www.amazon.com");//this keeps history
		driver.manage().window().maximize();//maximize page
		WebElement RegisterFace=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/a)[2]" + 
				""));
		RegisterFace.click();
		WebElement Month=driver.findElement(By.id("month"));
		//Class                   constructor of select class
		Select object = new Select(Month);
		object.selectByIndex(8);
		WebElement Day= driver.findElement(By.name("birthday_day"));
		Select objected= new Select(Day);
		objected.selectByValue("26");
		WebElement Years=driver.findElement(By.xpath("//*[@title='Year']"));
		Select Year=new Select(Years);
		Year.selectByVisibleText("1986");
	}

}
