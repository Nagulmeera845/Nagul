package Basic;
//Access webpages and perform navigate method

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_7 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    Navigation nav=driver.navigate();
    driver.navigate().to("https://eshram.gov.in/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.navigate().to("https://myaadhaar.uidai.gov.in/");
    Thread.sleep(3000);
    nav.back();
    Thread.sleep(5000);
    nav.forward();
    Thread.sleep(5000);
    nav.refresh();
    Thread.sleep(3000);
    driver.close();
    
    
	}

}
