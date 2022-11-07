package Auto_Suggestion_handling;
/*
 * Access google search for virat kohli
 * print all the suggestions which is visible
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    Thread.sleep(3000);
	    
	    WebElement element=driver.findElement(By.xpath("//input[@title='Search']"));
	    element.sendKeys("Virat kohli");
	    Thread.sleep(2000);
	    
	 List<WebElement> elements=driver.findElements(By.xpath("(//div[@class='OBMEnb'])/ul/li"));
	    for(WebElement ref: elements) {
	    	String s=ref.getText();
	    	System.out.println(s);
	    }
	    Thread.sleep(3000);
	    driver.close();
	}

}
