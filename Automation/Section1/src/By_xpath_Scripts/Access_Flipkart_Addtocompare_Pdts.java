package By_xpath_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_Flipkart_Addtocompare_Pdts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//button[text()='✕']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//input [@name='q']")).sendKeys("i-phone 11");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//button [@class='L0Z3Pu']")).click();
		   Thread.sleep(3000);
		   //click 1st product add to compare
		   driver.findElement(By.xpath("(//div[@class='_24_Dny'])[13]")).click();
		   Thread.sleep(3000);
		   //click 5th product add to compare
		   driver.findElement(By.xpath("(//div[@class='_24_Dny'])[17]")).click();
		   Thread.sleep(3000);
		   //click 8th product add to compare
		   driver.findElement(By.xpath("(//div[@class='_24_Dny'])[20]")).click();
		   Thread.sleep(5000);
		   
		   driver.quit();
	}

}
