package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_With_Java_Script {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(3000);
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("document.getElementById('username').value=('admin');");
	    Thread.sleep(3000);
	    jse.executeScript("document.getElementsByName('pwd')[0].value=('manager');");
	    Thread.sleep(3000);
	    jse.executeScript("document.getElementById('loginButton').click();");
	    Thread.sleep(10000);
	    
	    driver.close();
	}

}
