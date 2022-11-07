package By_xpath_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_ProductBrand_Name_Price {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
	String Brand=driver.findElement(By.xpath("(//span[text()='Campus'])[1]")).getText();

	String ProductName=driver.findElement(By.xpath("(//span[text()='Campus'])[1]/../../following-sibling::h2/a/span")).getText();

	String ProductCost=driver.findElement(By.xpath("(//span[text()='Campus'])[1]/../../following-sibling::h2/a/span/../../../following-sibling::div[2]/div/a/span[1]/span[2]/span[2]")).getText();

	System.out.println("Brand Name is:"+Brand+"---->Product Name is:"+ProductName+"---->  Product cost is:"+ProductCost);

		
		driver.quit();
		
	}

}
