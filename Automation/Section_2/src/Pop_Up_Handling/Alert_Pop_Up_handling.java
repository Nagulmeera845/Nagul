package Pop_Up_Handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Pop_Up_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("ABC");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
	    Thread.sleep(3000);
	    Alert alt=driver.switchTo().alert();
	    //Thread.sleep(3000);
	    //To perform 'OK' option
	   // alt.accept();
	    //to perform 'Cancel' option
	    //alt.dismiss();
	   // Thread.sleep(3000);
	    //To print the pop-up msg
	    System.out.println(alt.getText());
	    //Thread.sleep(5000);
	   // driver.close();
		

	}

}
