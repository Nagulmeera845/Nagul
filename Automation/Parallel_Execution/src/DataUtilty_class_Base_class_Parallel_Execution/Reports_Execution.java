package DataUtilty_class_Base_class_Parallel_Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Reports_Execution extends Base_class_Parallel {
	@Test
	public void task()
	{
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
		System.out.println("Reports executed");
	}

}
