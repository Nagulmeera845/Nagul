package Group_Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_class {
	WebDriver driver;
	Data_Utility du = new Data_Utility();
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
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
