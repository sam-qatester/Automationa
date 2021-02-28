package Com.programming.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romeo\\"
				+ "ProTrainingTech\\Home\\src\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();//opening chromedrivrer class constructor 
		//driver.get("https://www.facebook.com");//how to open url in the browsers
		driver.navigate().to("https://priceline.com");
		
		driver.manage().window().maximize();
		WebElement dt=driver.findElement(By.name("date-range"));
		dt.click();
		Thread.sleep(1000);
		WebElement bookingdate=driver.findElement(By.xpath("(//div[text()='1'])[1]"));
		bookingdate.click();
		Thread.sleep(2000);
		WebElement st=driver.findElement(By.xpath("(//div[text()='26'])[1]"));
		st.click();
		Thread.sleep(6000);
		WebElement ft=driver.findElement(By.xpath("//*[@id=\"search-tab-flights\"]/div"));
		ft.click();
		Thread.sleep(2000);
		WebElement Dpfm= driver.findElement(By.xpath("//*[@id='flight-departure-airport0']"));
		Dpfm.sendKeys("Dca");
		driver.switchTo().alert().accept();
		
	}

}
