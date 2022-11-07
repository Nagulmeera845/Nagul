package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_9_getTagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(3000);
	String ref=driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']")).getTagName();
	    System.out.println("TagName is: "+ref);
	    driver.close();
	}

}
