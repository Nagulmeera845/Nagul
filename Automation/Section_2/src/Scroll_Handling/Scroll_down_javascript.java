package Scroll_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_javascript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//button[text()='✕']")).click();
		   Thread.sleep(3000);
WebElement Element=driver.findElement(By.xpath("//input [@name='q']"));
		   Thread.sleep(3000);
		   Element.sendKeys("i phone 11");
		   Thread.sleep(3000);
		   Element.submit();
		   Thread.sleep(3000);
		   
		   JavascriptExecutor jse=(JavascriptExecutor)driver;
		   jse.executeScript("window.scrollBy(0,2000);");
		   Thread.sleep(3000);
		   jse.executeScript("window.scrollBy(0,2000);");
		   Thread.sleep(3000);
		   jse.executeScript("window.scrollBy(0,2000);");
		   Thread.sleep(5000);
		   driver.close();
	}

}
