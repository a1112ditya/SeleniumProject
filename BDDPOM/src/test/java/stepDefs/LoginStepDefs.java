package stepDefs;


import org.junit.Assert;
import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDefs extends TestBase{
	
	

	
	@Given("User is aleady on login page")
	public void user_is_aleady_on_login_page() {
		
		initialize();
		
	}
	
	
	@When("User enters login credentials")
	public void user_enters_login_credentials(DataTable dataTable) {
		LoginPage login = new LoginPage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
    @Then("User is on Home Page")
	public void user_is_on_Home_Page() {
  	
    	LoginPage login = new LoginPage();
    	String title = login.getPageTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}
	
    @Then("Close the browser")
	public void close_the_browser() {
    	
    	LoginPage login = new LoginPage();
    	login.closeBrowser();
	    
	}
	


}
