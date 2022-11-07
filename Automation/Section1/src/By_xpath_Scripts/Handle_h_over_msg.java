package By_xpath_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_h_over_msg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(3000);
	String s1=driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']")).getAttribute("title");
	    System.out.println("h-over msg is: "+s1);
	String s2=driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']")).getTagName();
	    System.out.println("TagName is: "+s2);
	    
		driver.close();
	}

}
