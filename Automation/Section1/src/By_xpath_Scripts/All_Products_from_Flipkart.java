package By_xpath_Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Products_from_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i-phone 11");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);
	List<WebElement> Productname=    driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    for(WebElement ref: Productname)
	    {
	    	System.out.println(ref.getText());
	    }
	}

}
