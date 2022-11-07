package Pop_Up_Handling;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alender_Pop_Up_handling_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH,5);
		Date date=cal.getTime();
SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YY");
     String modifiedDate  = sdf.format(date);
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(modifiedDate);
     System.out.println("Modified Date: "+modifiedDate);
     
	}

}
