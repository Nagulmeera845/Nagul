package Cross_Browser_Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Execute_Reports extends Base_class_Cross {
	@Test
	public void reports()
	{
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
		System.out.println("Reports executed");
	}
	

}
