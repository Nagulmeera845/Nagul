package DataUtilty_class_Base_class_Parallel_Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Users_Execution  extends Base_class_Parallel {
	@Test
	public void User()
	{
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		System.out.println("Users Executed");
	}
}
