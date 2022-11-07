package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script_4 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\\\Selenium\\\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://dharani.telangana.gov.in/homePage?lang=en");
    driver.manage().window().minimize();
    Thread.sleep(3000);
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.manage().window().minimize();
    Thread.sleep(3000);
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.close();
    
	}

}
