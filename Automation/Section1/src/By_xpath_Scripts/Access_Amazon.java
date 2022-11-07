package By_xpath_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		String brand = driver.findElement(By.xpath("(//span[text()='Campus'])[1]\r\n"
				+ "")).getText();
		Thread.sleep(3000);
	String name = driver.findElement(By.xpath("(//span[text()='Campus'])[1]/../../../../div[2]/h2/a/span")).getText();
		
	String price = driver.findElement(By.xpath("(//span[text()='Campus'])[1]/../../../../div[2]/h2/a/span/../../../../../div[3]/div[4]/div[2]/a/span[1]/span[2]/span[2]")).getText();
		
		
		System.out.println(brand+"******"+name+"------->"+price);
	}

}
