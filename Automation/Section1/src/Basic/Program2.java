package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		//step-1:configuration
	    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    //step-2:Access
	    //create object
	    ChromeDriver driver=new ChromeDriver();
	    //Use get method to access in webpage
	     driver.get("https://www.irctc.co.in/nget/");
	     //To print the webpage title
	     String title=driver.getTitle();
	     //To print the page source
	     //String pagesource=driver.getPageSource();
	     System.out.println("title of webpage is:"+title);
	     //System.out.println("page source code is:"+pagesource);
	     driver.close();
	}

}
