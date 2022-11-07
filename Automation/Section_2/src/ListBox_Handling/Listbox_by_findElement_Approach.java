package ListBox_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox_by_findElement_Approach {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///E:/HTML/Create%20Account.html");
	    WebElement element=driver.findElement(By.xpath("//select[@id='State']"));
	    element.click();
	    Thread.sleep(3000);
	    WebElement element2=driver.findElement(By.xpath("//option[text()=' TS ']"));
	    element2.click();
	}

}
