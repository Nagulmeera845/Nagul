package By_xpath_Scripts;
//customize login of actitime
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Actitime_With_by_xpath {

		ChromeDriver driver;
        public void launchBrowser() {
 		 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("https://demo.actitime.com/login.do");
        }
        //login
        public void logincredentials() throws InterruptedException {
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//div[@id='keepLoggedInCheckBoxContainer']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//div[text()='Login '] ")).click();
        }
        //test case execution
        
        public void execution() throws InterruptedException {
       	 driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
       	 Thread.sleep(5000);
       	 driver.findElement(By.xpath("//div[text()='Add New']")).click();
       	 Thread.sleep(5000);
       	 driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
       	 Thread.sleep(5000);
       	 driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Nagul");
       	 Thread.sleep(5000);
       	 driver.findElement(By.xpath("//textarea[@placeholder=\"Enter Customer Description\"]")).sendKeys("Meera");
       	 Thread.sleep(3000);
       	 driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
        }
        //close browser
        public void close() {
		driver.close();
	}

}
