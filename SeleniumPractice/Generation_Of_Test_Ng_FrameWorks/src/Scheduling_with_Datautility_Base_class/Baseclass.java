package Scheduling_with_Datautility_Base_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baseclass {
	WebDriver driver;
	DataUtility_class dsc = new DataUtility_class();
	  @BeforeClass(alwaysRun =true)
	  public void launchBrowser() throws Exception
	   {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 System.out.println(dsc.getDataFromProperties("authorname"));
		 System.out.println(dsc.getDataFromProperties("browsername"));
		 System.out.println(dsc.getDataFromProperties("username"));
		 System.out.println(dsc.getDataFromProperties("password"));
		 System.out.println(dsc.getDataFromProperties("url"));
		 Thread.sleep(3000);
		 driver.get(dsc.getDataFromProperties("url"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   }
	  @BeforeMethod(alwaysRun = true)
	   
	   public void login() throws Exception
	   {
		   driver.findElement(By.id("username")).sendKeys(dsc.getDataFromProperties("username"));
		   driver.findElement(By.name("pwd")).sendKeys(dsc.getDataFromProperties("password"));
		   driver.findElement(By.className("initial")).click();
	   }
	  
	   @Test
	   public void clickOnTask()
	   {
		   driver.findElement(By.xpath("//a[@class='content tasks']")).click();
	   }
	   
	   @AfterMethod(alwaysRun =true)
	   public void logout()
	   {
		  driver.findElement(By.xpath("//a[text()='Logout']")).click();
	   }
		 
		@AfterClass(alwaysRun = true)
		public void closeBrowser()
		{
			driver.close();
		}
}


