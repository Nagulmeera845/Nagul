package xpath_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_Actitme {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    Thread.sleep(15000);
	    driver.close();
	}

}
