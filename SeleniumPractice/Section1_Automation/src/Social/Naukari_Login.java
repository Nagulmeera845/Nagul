package Social;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari_Login {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id=\"usernameField\"]")).sendKeys("nagulmeera845@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Nagul@786");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class=\"waves-effect waves-light btn-large btn-block btn-bold otpButton textTransform\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class=\"mobileInputt  \"]")).sendKeys("9515627845");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class=\"waves-effect waves-light btn-large blue-btn sndbtn \"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class=\"mobileInput \"]")).sendKeys("951562");
	Thread.sleep(20000);
	driver.findElement(By.xpath("//button[@class=\"waves-effect waves-light btn-large blue-btn sndbtn \"]")).click();
	Thread.sleep(3000);


	}

}
