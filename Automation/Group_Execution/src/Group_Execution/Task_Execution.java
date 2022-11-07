package Group_Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Task_Execution  extends Base_class{
	@Test(groups = {"smoke"})
	public void Task() {
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		System.out.println("Task click executed");
	}

}
