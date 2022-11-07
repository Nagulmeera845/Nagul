package cssSelector_Prgms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_Orange_hrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.cssSelector("button[type='Submit']")).click();
	    Thread.sleep(4000);
	    driver.close();
	}

}
