package Basic;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.monsterindia.com/");
				//maximize the window
				driver.manage().window().maximize();
				Thread.sleep(3000);
				//to perform relocation
				Point p=new Point(100,100);
				driver.manage().window().setPosition(p);
				Thread.sleep(4000);
				//to close the window
				driver.close();
			}
	}


