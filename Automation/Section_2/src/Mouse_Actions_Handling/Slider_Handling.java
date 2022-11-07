package Mouse_Actions_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Handling {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
WebElement element=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		element.sendKeys("i phone 11");
		Thread.sleep(2000);
		element.submit();
		Thread.sleep(2000);
JavascriptExecutor jse=(JavascriptExecutor) driver;
   jse.executeScript("window.scrollBy(0,100);");
        Thread.sleep(2000);
        Actions act=new Actions(driver);
WebElement slider1=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
        Thread.sleep(2000);
        act.dragAndDropBy(slider1,-30,0);
        Thread.sleep(3000);
act.perform();
 
WebElement slider2=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
 Thread.sleep(2000);
act.dragAndDropBy(slider2,30,0);
 Thread.sleep(3000);
 act.perform();
  
	}

}
