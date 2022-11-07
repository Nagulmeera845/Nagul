package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_Actitime_By_cssSelector {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
    Thread.sleep(3000);

    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
    Thread.sleep(3000);

    driver.findElement(By.cssSelector("input[type='checkbox']")).click();
    Thread.sleep(3000);

    driver.findElement(By.cssSelector("a[id='loginButton']")).click();
    Thread.sleep(10000);

    driver.close();
	}

}
