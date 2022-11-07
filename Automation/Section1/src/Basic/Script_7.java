package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(4000);
	    driver.findElement(By.id("username")).sendKeys("admin");
	    Thread.sleep(4000);
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    Thread.sleep(4000);
	    driver.findElement(By.className("initial")).click();
	    Thread.sleep(3000);
	    driver.close();
	}

}
