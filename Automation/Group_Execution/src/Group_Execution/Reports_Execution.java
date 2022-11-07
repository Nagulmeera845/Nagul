package Group_Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Reports_Execution extends Base_class{
	@Test(groups = {"sanitys"})
	public void Reports() {
	driver.findElement(By.xpath("//div[@id='container_reports']")).click();
	System.out.println("Reports executed");

}}
