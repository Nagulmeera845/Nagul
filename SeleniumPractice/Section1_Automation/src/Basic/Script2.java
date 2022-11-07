package Basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://telanganaepass.cgg.gov.in/");
    Thread.sleep(3000);
    driver.close();
	}

}
