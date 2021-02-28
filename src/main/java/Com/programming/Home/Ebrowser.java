package Com.programming.Home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebrowser {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romeo\\ProTrainingTech\\Home\\src\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();//opening chromedrivrer class constructor 
	driver.get("https://www.amazon.com");//how to open url in the browsers
	//driver.navigate().to("https://www.amazon.com");//this keeps history
	driver.manage().window().maximize();//maximize page
	  
//	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//	//Thread.sleep(3090);//Pause the script
//	
//	driver.navigate().back();//how to navigate back
//	Thread.sleep(2000);
//	driver.navigate().forward();//how to navigate forward
//	
//	//Thread.sleep(3000);
	
	String Windowhandle=driver.getWindowHandle();//Declaring windowhandle
	System.out.println(Windowhandle);//printing windowHandle
	System.out.println(Windowhandle);//printing windowHandle
	driver.close();//only for the current page
	//driver.quit();//for all the pages
	}
	
}
