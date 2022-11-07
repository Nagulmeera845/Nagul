package XPath_Prgms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Product_Brand_Name_Cost {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("fridge");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    Thread.sleep(3000);
String Pdtname=driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[5]")).getText();
String Cost=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[5]/../../../following-sibling::div[2]/div/div/div/div/a/span/span[2]/span[2]")).getText();
System.out.println("Productname is:"+Pdtname+"......Cost:"+Cost);
	
driver.close();
	
	}

}
