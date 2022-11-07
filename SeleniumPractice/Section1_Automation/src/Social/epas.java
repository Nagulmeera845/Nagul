package Social;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class epas {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://telanganaepass.cgg.gov.in/");
   Thread.sleep(3000);
   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
   
 WebElement element=driver.findElement(By.xpath("//a[@href='https://telanganaepass.cgg.gov.in/epassonlinelinks.do']"));
   element.click();
   Thread.sleep(2000);
   String parentId=driver.getWindowHandle();
   Set<String> childId=driver.getWindowHandles();
   for(String allId:childId) {
	   if(!parentId.equals(allId)) {
		   driver.switchTo().window(allId);
	   }
}
   WebElement e1=  driver.findElement(By.xpath("//a[@href='https://telanganaepass.cgg.gov.in/applicationStatus.do']"));
   e1.click();
   Thread.sleep(3000);
   WebElement e2 = driver.findElement(By.xpath("(//input[@class='inputbox'])[1]"));
   e2.sendKeys("1630104472");
	
	}

}
