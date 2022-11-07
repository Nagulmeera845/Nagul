package Pop_Up_Handling;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Pop_Up_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/YYYY");
		String modifieDate=sdf.format(d); //we've to mmodified the date
		Thread.sleep(3000);
		System.out.println(modifieDate);
		// System.out.println(d); with this there is no use
	}

}
