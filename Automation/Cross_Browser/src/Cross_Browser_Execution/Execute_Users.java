package Cross_Browser_Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Execute_Users extends Base_class_Cross {
	@Test
	public void User()
	{
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		System.out.println("Users Executed");
	}

}
