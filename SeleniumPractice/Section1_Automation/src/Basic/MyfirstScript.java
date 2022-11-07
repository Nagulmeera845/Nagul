package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyfirstScript {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://mail.google.com");
    Thread.sleep(3000);
    driver.close();
 	}

}
