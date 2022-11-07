package Pom_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {
	@FindBy(xpath ="//input[@id='username']")
	private WebElement usernameId;
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordId;
    
	 
	public Pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsernameId()
	{
		return usernameId;
	}
	public WebElement getPasswordId()
	{
		return passwordId;
	}
	public void login(String username, String password)
	{
		getUsernameId().sendKeys(username);
		getPasswordId().sendKeys(password);
	}

}
