package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script_3 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    Thread.sleep(3000);
    String title=driver.getTitle();
    String Pagesource=driver.getPageSource();
    System.out.println("Title of webpage is:"+title);
   // System.out.println("Pagesource code is:"+Pagesource);
    driver.close();
	}

}
