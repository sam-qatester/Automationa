package Com.programming.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteFacebook {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romeo\\ProTrainingTech\\Home\\src\\"
				+ "Driver\\chromedriver.exe");
		driver=new ChromeDriver();//opening chromedrivrer class constructor 
		driver.get("https://www.facebook.com");//how to open url in the browsers
		driver.manage().window().maximize();
	
		 String x="Salary";
		 String y="115k";
		WebElement RegisterFace=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/a)[2]" + 
				""));
		RegisterFace.click();
		Thread.sleep(5000);
		
		WebElement FName = driver.findElement(By.id("u_2_b"));
		FName.sendKeys("QA");
		
		WebElement LName = driver.findElement(By.name("lastname"));
		LName.sendKeys("Engineerjr");
		
		WebElement PNumber=driver.findElement(By.id("u_2_g"));
		PNumber.sendKeys("703-777-7777");
		WebElement MobileNumberContains=driver.findElement(By.xpath("//*[contains(@name,'reg_email__')]"));
		MobileNumberContains.sendKeys("88787");
		// I didn't know how to hide password 
		WebElement Pass= driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
		Pass.sendKeys(x+y);//practice only 
		
		WebElement Month= driver.findElement(By.id("month"));
		Month.click();
		Month.sendKeys("Feb");
		//Month.click();
		
		WebElement Day=driver.findElement(By.id("day"));
		Day.click();
		Day.sendKeys("24");
		Day.click();
		
		WebElement Year=driver.findElement(By.id("year"));
		Year.click();
		Year.sendKeys("1921");
		Year.click();
		
		WebElement Gender = driver.findElement(By.xpath("//*[@id=\"u_2_o\"]/span[2]/label"));
		Gender.click();
		
		WebElement Signup =driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div/div/button"));
		Signup.click();
		Thread.sleep(19000);
// for practice purpose I wrote extra code 
		WebElement fName = driver.findElement(By.id("u_2_b"));
		fName.clear();
		Thread.sleep(3000);
		fName.sendKeys("Seleniumqa");
		Thread.sleep(2000);
		Signup.click();
		Thread.sleep(5000);
		
	}

}
