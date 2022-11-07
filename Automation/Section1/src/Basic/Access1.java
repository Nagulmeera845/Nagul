package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access1 {

	public static void main(String[] args) {
		//step-1:configuration
	    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    //step-2:Access
	    //create object
	    WebDriver driver=new ChromeDriver();
	    //use get method to access in webpage
	     driver.get("https://www.amazon.in/");
	}

}
