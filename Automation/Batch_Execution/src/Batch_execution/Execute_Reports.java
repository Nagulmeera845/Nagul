package Batch_execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Execute_Reports extends Base_class_batch {
	@Test
	public void Reports()
	{
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
		System.out.println("Reports executed");
	}
	

}
