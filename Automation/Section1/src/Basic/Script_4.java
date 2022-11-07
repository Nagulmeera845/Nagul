package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_4 {

	public static void main(String[] args) throws InterruptedException {
		//step-1:configuration
	    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//step-2:Access
		//create object
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//Dimension d=new Dimension(400,400);
		driver.manage().window().setSize(new Dimension(400,400));
		Thread.sleep(4000);
		driver.close();
		
	}

}
