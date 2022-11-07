package Cross_Browser_Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Execute_task extends Base_class_Cross {
	@Test
	public void task()
	{
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		System.out.println("Task click executed");
	}

}
