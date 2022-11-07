package ListBox_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Handling_By_Select_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///E:/HTML/Create%20Account.html");
	    WebElement element=driver.findElement(By.xpath("//select[@id='State']"));
	    element.click();
	    System.out.println("all the options: ");
	    Select s=new Select(element);
	    List<WebElement> options=s.getOptions();
	    for(WebElement alloptions:options) {
	    	System.out.println(alloptions.getText());
	    }
	    if(s.isMultiple()) {
	    	System.out.println("ListBox is multi-selected");
	    }
	    else
	    	System.out.println("ListBox is not multi-selected");
	}
	}


