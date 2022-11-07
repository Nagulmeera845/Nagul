package Basic;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    //driver.get("https://www.youtube.com/watch?v=gvyUuxdRdR4");
	    Navigation nav=driver.navigate();
	    driver.navigate().to("https://dharani.telangana.gov.in/homePage?lang=en");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.navigate().to("https://www.youtube.com/watch?v=_3mzPrXqfHg");
	    Thread.sleep(5000);
	    nav.back();//to perform backward operation
	    Thread.sleep(5000);
	    nav.forward();//to perform forward operation
	    Thread.sleep(15000);
	    nav.refresh(); //to perform refresh
	    Thread.sleep(3000);
	    driver.close();	
	}

}
