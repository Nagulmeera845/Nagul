package Group_Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Users_Execution extends Base_class{
	@Test(groups = {"smoke","sanity"})
	public void Users() {
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
		System.out.println("Reports executed");
	}

}
