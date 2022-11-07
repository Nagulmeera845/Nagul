package Basic;
//Access flipkart & by using submit() mehtod
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aceess_by_using_submit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    Thread.sleep(3000);
	    WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
	    Thread.sleep(3000);
	    element.sendKeys("i-phone 11");
	    Thread.sleep(3000);
	    element.submit();
	    Thread.sleep(3000);
	    driver.close();
	}

}
