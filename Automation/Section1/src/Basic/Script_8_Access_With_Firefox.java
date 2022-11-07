package Basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_8_Access_With_Firefox {

	public static void main(String[] args) {
		//step-1:configuration
		
	    System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
	    //step-2:Access
	    //create object
	    
	    FirefoxDriver driver=new FirefoxDriver();
	    //use get method to access in webpage
	    
	    driver.get("https://ts.meeseva.telangana.gov.in/meeseva/login.htm");
       }
	}


