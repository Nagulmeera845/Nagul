package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException {
		//Step-1:configuration
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	//step-2:Access
   //create object
   ChromeDriver driver=new ChromeDriver();
	//use get method to access in webpage
   driver.get("https://telanganaepass.cgg.gov.in/");
	//to maximize
   driver.manage().window().maximize();
	Thread.sleep(2000);
	//to minimize
   driver.manage().window().minimize();
	Thread.sleep(2000);
   driver.manage().window().maximize();
	Thread.sleep(3000);
	//to close the window
				driver.close();
	}

}
