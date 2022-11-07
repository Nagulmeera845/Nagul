package Social;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Superset_Login {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://app.joinsuperset.com/#/s/profile");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("nagulmeera845@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sania@143");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(10000);
	driver.close();
	
	
	}

}
