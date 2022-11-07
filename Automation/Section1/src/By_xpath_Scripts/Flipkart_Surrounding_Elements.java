package By_xpath_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Surrounding_Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    Thread.sleep(3000);
	    
		driver.findElement(By.xpath("//input [@name='q']")).sendKeys("iphone 11");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button [@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		
		String Pdtname=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']")).getText();
		Thread.sleep(3000);
		
		String Pdtprice=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		Thread.sleep(3000);
		
		System.out.println("Product name &Price  is : "+Pdtname+"........"+Pdtprice);
		driver.quit();
	}

}
