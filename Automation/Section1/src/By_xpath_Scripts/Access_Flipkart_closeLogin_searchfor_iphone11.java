package By_xpath_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_Flipkart_closeLogin_searchfor_iphone11 {

	public static void main(String[] args) throws InterruptedException {
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
		   String productname=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']")).getText();
		   System.out.println("Product name is:"+productname);
		   Thread.sleep(3000);
		   driver.close();
	}

}
