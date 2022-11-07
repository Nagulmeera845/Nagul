package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution_Of_Datautility {
	public static void main(String[] args) throws Exception {
	    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    DataUtility dta = new DataUtility();
	    driver.get(dta.getDataFromProperties("url"));
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(dta.getDataFromProperties("username"));
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(dta.getDataFromProperties("password"));
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]")).sendKeys(dta.getDataFromExcelSheet("Sheet1", 0, 0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		}
}
