package Scroll_Handling;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_With_Help_Of_Robot_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement element=driver.findElement(By.xpath("//input[@class='_3704LK']"));
	    Thread.sleep(2000);
	    element.sendKeys("i phone 11");
	    Thread.sleep(2000);
	    element.submit();
	    Thread.sleep(5000);
	    
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(3000);
	    
	    r.keyPress(KeyEvent.VK_PAGE_UP);
	    r.keyRelease(KeyEvent.VK_PAGE_UP);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(2000);
	    
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(10000);
	    driver.close();
	    
	}

}
