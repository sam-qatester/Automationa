package Com.programming.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class asgntForClass {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romeo\\ProTrainingTech\\Home\\src\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();//opening chromedrivrer class constructor 
		driver.get("https://www.Facebook.com");//how to open url in the browsers
		//driver.navigate().to("https://www.amazon.com");//this keeps history
		driver.manage().window().maximize();//maximize page
		
		WebElement creat=driver.findElement(By.id("u_0_2"));
		creat.click();
		Thread.sleep(4000);
		WebElement Fname=driver.findElement(By.xpath("(html/body/div/div/div//div/div/div//div/div/form/div/div//div/div/div/input)[1]"));
		Fname.sendKeys("Selenium");
		
		WebElement Lname=driver.findElement(By.xpath("//*[@id=\"u_2_d\"]"));
		Lname.sendKeys("Tester");
		
		WebElement Pnumber=driver.findElement(By.xpath("//*[@name=\"reg_email__\"]"));
		Pnumber.sendKeys("7037777374");
		
		WebElement Pass=driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
		Pass.sendKeys("QATester120k");
		
		WebElement Month=driver.findElement(By.id("month"));
		Select objected = new Select(Month);
		objected.selectByIndex(5);
		
		WebElement Day=driver.findElement(By.id("day"));
		Select day = new Select(Day);
		day.selectByValue("28");
		
		//WebElement Years=driver.findElement(By.name("birthday_year"));
		WebElement Years=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select Year=new Select (Years);
		Year.selectByVisibleText("1989");
		
		WebElement male = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span)[2]"));
		male.click();
		
		WebElement signup =driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div/div/button"));
		signup.click();
		Thread.sleep(3000);
		
		WebElement cancel=driver.findElement(By.xpath("//img[@class='_8idr img']"));
		cancel.click();
		
		Thread.sleep(3000);
		
		WebElement forgot=driver.findElement(By.xpath("//div[@class='_6ltj']"));
		forgot.click();
		Thread.sleep(3000);
		
		WebElement findaccount=driver.findElement(By.xpath("//*[@id=\"identify_email\"]"));
		findaccount.sendKeys("forgot@account.com");
		
		Thread.sleep(3000);
		
		WebElement findaccountcancel=driver.findElement(By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[3]/div/div[1]/a"));
		findaccountcancel.click();
		
		WebElement LogEmail=driver.findElement(By.name("email"));
		LogEmail.sendKeys("SeleniumTester@114k.com");
		Thread.sleep(3000);
		
		WebElement LogPass=driver.findElement(By.name("pass"));
		LogPass.sendKeys("114k");
		
		WebElement signin=driver.findElement(By.id("loginbutton"));
		signin.click();
		Thread.sleep(400000);
		driver.quit();
		
		// //tagname[ @       attribute =' values  '    ]
	}

}
