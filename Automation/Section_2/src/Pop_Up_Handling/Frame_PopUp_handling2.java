package Pop_Up_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_PopUp_handling2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='By.Remotable']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(2);
		Thread.sleep(3000);
		String textmsg=driver.findElement(By.xpath("//h2[text()='Interface By.Remotable']")).getText();
		Thread.sleep(3000);
		System.out.println("Alert msg is : "+textmsg);
		
		
		driver.quit();
		
	}

}
