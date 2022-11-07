package By_xpath_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Actitme_with_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='keepLoggedInCheckBoxContainer']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='Login '] ")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='Add New']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Shaik Nagulmeera");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//textarea[@placeholder=\"Enter Customer Description\"]")).sendKeys("Software Test Engineer");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	    Thread.sleep(3000);
	    String Actualname=driver.findElement(By.xpath("//div[@title='Shaik Nagulmeera']")).getText();
	    
	    System.out.println("User Name:"+Actualname);
	    
	    String expectedname="Shaik Sania";
	   if( Actualname.equals(expectedname)) {
		   System.out.println("User created successfully !!!");
	   }
	   else {
		   System.out.println("User not created successfully !!! ");
	   }
	}

}
