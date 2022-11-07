package Auto_Suggestion_handling;
/*
 * Access Google search for virat kohli 
 * click only the suggestion which contains age
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Auto_Searching_suggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    Thread.sleep(3000);
	WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
	    element.sendKeys("virat kohli");
	    Thread.sleep(2000);
	List<WebElement> elements=driver.findElements(By.xpath("//div[@class='mkHrUc']/ul/div/ul/li"));
	    for(WebElement ref:elements)
	    {
	    	String s=ref.getText();
	    	if(s.contains("age")) {
	    		ref.click();
	    	    break;
	    }}
	    Thread.sleep(3000);
	    driver.close();
	}

}
