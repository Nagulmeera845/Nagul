package Batch_execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
//don't get suggestionbox properties without extends done

public class Execute_task extends Base_class_batch {
	@Test
	public void task()
	{
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		System.out.println("Task click executed");
	}

}
