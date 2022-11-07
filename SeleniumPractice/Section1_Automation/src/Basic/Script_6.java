package Basic;
//Access webpage and perform resize and relocation of window

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script_6 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.nvsp.in/");
    Thread.sleep(3000);
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.manage().window().setSize(new Dimension(400,400));
    Thread.sleep(3000);
    Point p=new Point(100,100);
    Thread.sleep(3000);
    driver.manage().window().setPosition(p);
    Thread.sleep(3000);
    driver.close();
    
	}

}
