package XPath_Prgms;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Product_Brand_PdtName_PdtCost {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watch");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    Thread.sleep(3000);
String BrandName= driver.findElement(By.xpath("(//span[text()='Fastrack'])[1]")).getText();
String ProductName=driver.findElement(By.xpath("(//span[text()='Fastrack'])[1]/../../following-sibling::h2/a")).getText();
String Cost=driver.findElement(By.xpath("(//span[text()='Fastrack'])[1]/../../following-sibling::h2/a/../../following-sibling::div[2]/div/a/span[2]")).getText();
    
    System.out.println("Brand is:"+BrandName+".......ProductName is:"+ProductName+".......Cost is:"+Cost);
    
    driver.close();
    
    
	}

}
