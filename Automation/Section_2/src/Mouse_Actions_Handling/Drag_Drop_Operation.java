package Mouse_Actions_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Operation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    //To perform scroll handling by javascript
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,80);");
	    Thread.sleep(3000);
	    
	    //To perform Drag drop operation by actions class
	    Actions act=new Actions(driver);
	 WebElement dragMadrid= driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
	 WebElement dropSpain= driver.findElement(By.xpath("//div[text()='Spain']"));
	 act.dragAndDrop(dragMadrid, dropSpain);
	 act.perform();
	 Thread.sleep(2000);
	 
	 WebElement dragRome= driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
	 WebElement dropItaly= driver.findElement(By.xpath("//div[text()='Italy']"));
	 act.dragAndDrop(dragRome, dropItaly);
	 act.perform();
	 Thread.sleep(3000);
	 
	 WebElement dragSeoul= driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
	 WebElement dropSouthKorea= driver.findElement(By.xpath("//div[text()='South Korea']"));
	 act.dragAndDrop(dragSeoul, dropSouthKorea);
	 act.perform();
	 Thread.sleep(2000);
	 
	 WebElement dragCopenhagen= driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
	 WebElement dropDenmark= driver.findElement(By.xpath("//div[text()='Denmark']"));
	 act.dragAndDrop(dragCopenhagen, dropDenmark);
	 act.perform();
	 Thread.sleep(2000);
	 
	 WebElement dragWashington= driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
	 WebElement dropUnitedStates= driver.findElement(By.xpath("//div[text()='United States']"));
	 act.dragAndDrop(dragWashington, dropUnitedStates);
	 act.perform();
	 Thread.sleep(2000);
	 
	 WebElement dragStockholm= driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
	 WebElement dropSweden= driver.findElement(By.xpath("//div[text()='Sweden']"));
	 act.dragAndDrop(dragStockholm, dropSweden);
	 act.perform();
	 Thread.sleep(2000);
	 
	 WebElement dragOslo= driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
	 WebElement dropNorway= driver.findElement(By.xpath("//div[text()='Norway']"));
	 act.dragAndDrop(dragOslo, dropNorway);
	 act.perform();
	 Thread.sleep(10000);
	 
	 driver.close(); 
	 
	}

}
