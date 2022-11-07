package Pop_Up_Handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_PopUp_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
	element.sendKeys("i phone 11");
	element.submit();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 128 GB)']")).click();
	String parentId=driver.getWindowHandle();
	
	Set<String> childId=driver.getWindowHandles();
	
	for(String allId: childId) {
		if(!parentId.equals(allId)) {
			driver.switchTo().window(allId);
		}
	}
	WebElement childElement=driver.findElement(By.xpath("//span[@class='B_NuCI']"));
    WebElement childElement2=driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']/../../../../div/div/div[1]/div[1]"));
    String productname=childElement.getText();
	String productprice=childElement2.getText();
	System.out.println("Product name is: "+productname);
	System.out.println("Product price is: "+productprice);
	driver.quit();
	}

}
