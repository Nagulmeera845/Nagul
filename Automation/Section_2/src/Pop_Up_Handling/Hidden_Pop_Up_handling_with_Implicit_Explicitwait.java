package Pop_Up_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hidden_Pop_Up_handling_with_Implicit_Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    
	  driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	  driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[1]")).click();
	  driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'You are about to delete')]")));
	  
String msg=	driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
	   
   System.out.println("delete msg is:"+msg);
	}

}
