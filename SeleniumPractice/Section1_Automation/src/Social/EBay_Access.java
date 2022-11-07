package Social;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBay_Access {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.ebay.com/");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shoes");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    Thread.sleep(3000);
String result=    driver.findElement(By.xpath("//h1[@class=\"srp-controls__count-heading\"]")).getText();
Thread.sleep(3000);
    System.out.println("Result is:"+result);
    driver.quit();
	}

}
