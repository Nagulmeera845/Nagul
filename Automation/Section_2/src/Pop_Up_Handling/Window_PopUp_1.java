package Pop_Up_Handling;
/*
 * Access flipkart
 * search for i phone 11
 * click on 1st product
 * print product name and product price
 */
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_PopUp_1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
WebElement Element=driver.findElement(By.xpath("//input[@name='q']"));
	Element.sendKeys("i phone 11");
	Element.submit();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 128 GB)']")).click();
	Thread.sleep(2000);
	String parentId=driver.getWindowHandle();
	Thread.sleep(1000);
	Set<String> childId=driver.getWindowHandles();
	
	for(String allId: childId) {
		if(!parentId.equals(allId)) {
			driver.switchTo().window(allId);
		}
	}
	WebElement childElement1=driver.findElement(By.xpath("//span[@class='B_NuCI']"));
    WebElement childElement2=driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']/../../../../div/div/div[1]/div[1]"));
    String productname=childElement1.getText();
	String productprice=childElement2.getText();
	System.out.println("Product Nme: "+productname);
	System.out.println("Product Price is: "+productprice);
	driver.quit();
	}

}
