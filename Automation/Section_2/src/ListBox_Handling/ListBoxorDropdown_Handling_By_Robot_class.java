package ListBox_Handling;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxorDropdown_Handling_By_Robot_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    Thread.sleep(3000);
		    //ListBox or Dropdown operation
		    driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][3]")).click();
		    Thread.sleep(3000);
		    WebElement element=driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
		    Thread.sleep(3000);
		    element.click();
		    
		    Robot ref=new Robot();
			Thread.sleep(3000);
			
			ref.keyPress(KeyEvent.VK_DOWN);
			ref.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			
			ref.keyPress(KeyEvent.VK_DOWN);
			ref.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			ref.keyPress(KeyEvent.VK_ENTER);
			ref.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			
			driver.close();

	}

}
