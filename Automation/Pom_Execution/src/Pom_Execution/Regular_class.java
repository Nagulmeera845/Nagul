package Pom_Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular_class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement element = driver.findElement(By.xpath("//input[@id='username']"));

		element.sendKeys("admin");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		element.sendKeys("admin");
				
				
	}

}
