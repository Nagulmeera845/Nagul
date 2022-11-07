package Basic;
//Access webpage and perform resize operation

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
public class Script_5 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://dharani.telangana.gov.in/homePage?lang=en");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.manage().window().setSize(new Dimension(400,400));
    Thread.sleep(3000);
    driver.close();
	}

}
