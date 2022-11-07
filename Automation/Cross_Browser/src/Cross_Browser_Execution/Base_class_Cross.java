package Cross_Browser_Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_class_Cross {
	WebDriver driver;  //making global
	Datautility du = new Datautility();
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(String browser) throws Exception {
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		driver.get(du.getDataFromProperties("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod(alwaysRun = true)
	public void login() throws Exception {
		driver.findElement(By.id("username")).sendKeys(du.getDataFromProperties("username"));
		driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("password"));
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		driver.findElement(By.className("initial")).click();
	}
	@AfterMethod(alwaysRun = true)
	public void logOut() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.close();
		}
	}
	 
	

