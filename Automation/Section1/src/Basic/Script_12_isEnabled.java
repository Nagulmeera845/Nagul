package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_12_isEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    Thread.sleep(3000);
	    driver.get("https://demo.actitime.com/login.do");
WebElement element=driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']"));
	if(element.isEnabled()) {
		System.out.println("Element is Enabled");
	}
	else
	{
		System.out.println("Element is not Disabled");
	}
	    driver.close();
	}

}
