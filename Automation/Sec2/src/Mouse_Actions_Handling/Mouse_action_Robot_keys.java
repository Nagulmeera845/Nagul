package Mouse_Actions_Handling;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action_Robot_keys {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    //Thread.sleep(3000);
	    Actions act =new Actions(driver);
	    WebElement element=driver.findElement(By.xpath("//a[text()='Gmail']"));
	    act.moveToElement(element);
	    //Thread.sleep(3000);
	    //build():-> functionality of bridge b/w two diff methods
	    act.contextClick().build().perform();
	    
	   // act.perform();
	    Thread.sleep(3000);
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);  //1
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_DOWN);  //2
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_DOWN); //3
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_DOWN); //4
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_DOWN);  //5
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_DOWN); //6
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		//to click inspect button
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.close();
	}

}
