package Shadow;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_Handling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.msn.com/en-in/?AR=1");
		Thread.sleep(3000);
WebElement element = driver.findElement(By.xpath("//entry-point[@instance-id='EntryPointHpWC']"));
	SearchContext sc1 = element.getShadowRoot();
	Thread.sleep(3000);
	WebElement element2 = driver.findElement(By.cssSelector("//div[class='default-feed-nav-container']>feed-navigation-hp[instance-id='FeedNavigationHp']"));
	SearchContext sc2 = element2.getShadowRoot();
	Thread.sleep(3000);
	WebElement element3 = driver.findElement(By.cssSelector("//feed-navigation[class='top-navigation-parent']"));
	SearchContext sc3 = element3.getShadowRoot();
	Thread.sleep(3000);
	WebElement element4 = driver.findElement(By.cssSelector("//feed-navigation-item[id='entertainment']"));
	Thread.sleep(3000);
	element4.click();











	}

}
