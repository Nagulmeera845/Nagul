package Pop_Up_Handling;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//other way to perform calender date
public class Calender_Pop_Up_handling_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Calendar cal=Calendar.getInstance();
	    Date d=cal.getTime();
	    SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/YYYY");
		String modifiedDate=sdf.format(d);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(modifiedDate);
		System.out.println("Today date is: "+modifiedDate);
		Thread.sleep(3000);
		driver.close();
		
	}

}
