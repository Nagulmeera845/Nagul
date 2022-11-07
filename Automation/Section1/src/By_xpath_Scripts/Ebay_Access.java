package By_xpath_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Access {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Shoes");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	    Thread.sleep(3000);
	    String result=driver.findElement(By.xpath("//div[@class='srp-controls__control srp-controls__count']")).getText();
	    Thread.sleep(3000);
	    System.out.println("Results :"+result);
	    driver.quit();
	}

}
