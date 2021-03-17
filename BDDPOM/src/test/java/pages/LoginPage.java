package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(linkText = "Forget your password?")
	WebElement forgetLink;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	public void login(String user , String password) {
		
		username.sendKeys(user );
		pwd.sendKeys(password);
		loginBtn.click();
	}
	
	public void forgetPwd() {
		forgetLink.click();
	}
	
	public String pageTitle() {
		
		return driver.getTitle();
		
	}
	
	public void closeBrowser() {
		driver.close();
		
		
	}
	
	
}
