package Batch_Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Task_Execution_class extends Base_class_Batch{
	@Test
	public void task()
	{
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		System.out.println("Task click executed");
	
}
}
