package BasicProgram;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Key_FrameWork {
	public static void main(String[] args) throws Exception {
	    FileInputStream fis = new FileInputStream("E:\\Excel\\actitme.txt");
	    Properties pro = new Properties();
	    pro.load(fis);
	    String authorname = pro.getProperty("authorname");
	    String browsername = pro.getProperty("browsername");
	    String username =  pro.getProperty("username");
	    String password = pro.getProperty("password");
	    String url =  pro.getProperty("url");
	    System.out.println("Authorname: "+authorname);
	    System.out.println("Browsername: "+browsername);
	    System.out.println("Username: "+username);
	    System.out.println("Password: "+password);
	    System.out.println("Url is: "+url);
	    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class='logout']")).click();
	    Thread.sleep(3000);
	    driver.quit();
	   	}
}
