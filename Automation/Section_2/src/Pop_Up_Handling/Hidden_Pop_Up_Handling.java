package Pop_Up_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Pop_Up_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.manage().window().maximize();
	 	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Login ']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//div[@class='img'])[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();
	     Thread.sleep(3000);
	  
	  
String msg=	driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
	   
   System.out.println("delete msg is:"+msg);
	}

}
