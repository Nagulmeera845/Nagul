package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_11_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://demo.actitime.com/login.do");
		    Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']"));
		if(element.isDisplayed()) {
			System.out.println("Element is Displaying");
		}
		else
		{
			System.out.println("Element is not Diplaying");
		}
		    driver.close();
	}

}
