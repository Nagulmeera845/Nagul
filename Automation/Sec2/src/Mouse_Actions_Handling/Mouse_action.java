package Mouse_Actions_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    Thread.sleep(3000);
	    Actions act =new Actions(driver);
	    WebElement element=driver.findElement(By.xpath("//a[text()='Gmail']"));
	    act.moveToElement(element);
	    act.click();
	    act.perform();
	}

}
