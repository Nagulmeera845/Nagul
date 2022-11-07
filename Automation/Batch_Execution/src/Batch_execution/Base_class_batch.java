package Batch_execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_class_batch {
	WebDriver driver;  //making global
	   Datautility_batch db = new Datautility_batch(); //create obj of Datautility_batch clss
	  // all data stored in the obj ref of 'db'
	   @BeforeClass(alwaysRun =true)
	   public void launchBrowser() throws Exception
	   {
		   System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(db.getDataFromProperties("url"));
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// to handle synchronzn
		 System.out.println("authorname is : "+db.getDataFromProperties("authorname"));
		 System.out.println("browsername is : "+db.getDataFromProperties("browsername"));
		 System.out.println("username is : "+db.getDataFromProperties("username"));
		 System.out.println("password is : "+db.getDataFromProperties("password"));
	   }
	   @BeforeMethod(alwaysRun = true)
	   public void login() throws Exception
	   {     
		   //get data from propertiesfile with help of obj ref
		   driver.findElement(By.id("username")).sendKeys(db.getDataFromProperties("username"));
		   driver.findElement(By.name("pwd")).sendKeys(db.getDataFromProperties("password"));
		   driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		   driver.findElement(By.className("initial")).click();
	   }
	   //here we are creating base class not write any  testcase
	   @AfterMethod(alwaysRun = true)
	   public void logOut() {
		   driver.findElement(By.xpath("//a[text()='Logout']")).click();
	   }
	   @AfterClass(alwaysRun = true)
	   public void closeBrowser()
	   {
		   driver.close();
	   }
}
