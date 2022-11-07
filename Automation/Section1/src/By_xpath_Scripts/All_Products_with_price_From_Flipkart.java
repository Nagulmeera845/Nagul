package By_xpath_Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Products_with_price_From_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone 11");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(4000);
	List<WebElement> Productname=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	List<WebElement>ProductPrice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	      for(int i=0;i<Productname.size()-1;i++)
	        {
			 System.out.println(Productname.get(i).getText()+":"+ProductPrice.get(i).getText());
		    }
	     Thread.sleep(5000);
	     driver.quit();
	}

}
