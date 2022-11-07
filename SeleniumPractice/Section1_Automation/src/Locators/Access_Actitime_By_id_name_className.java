package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_Actitime_By_id_name_className {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
    Thread.sleep(3000);
    driver.findElement(By.id("username")).sendKeys("admin");
    Thread.sleep(3000);
    driver.findElement(By.name("pwd")).sendKeys("manager");
    Thread.sleep(3000);
    driver.findElement(By.className("initial")).click();
    Thread.sleep(15000);
    driver.close();
	}

}
