package Social;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_Superset {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://app.joinsuperset.com/#/s/profile");
    Thread.sleep(3000);
    driver.findElement(By.xpath("")).sendKeys("nagulmeera845@gmail.com");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@class=\"form-control ng-empty ng-invalid ng-invalid-required ng-pristine ng-untouched\"]")).sendKeys("Sania@143");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@class=\"btn btn-primary btn-block\"]")).click();
    driver.close();
	}

}
