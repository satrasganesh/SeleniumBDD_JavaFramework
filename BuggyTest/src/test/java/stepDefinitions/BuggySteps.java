package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Dashboard;
import pageObjects.ProfilePage;

public class BuggySteps {

	public static WebDriver driver;
	Dashboard loginPage;

	@Given("^User is on HomePage$")
	public void user_logins_Buggy_Software_site() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://buggy.justtestit.org/");
		loginPage = new Dashboard(driver);
	}

	@When("^Enter user name \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_user_name_and_password(String uName, String pwd) throws Throwable {
		loginPage.enterUserName(uName);
		loginPage.enterPassword(pwd);
		loginPage.clickLogin();
		Thread.sleep(2000);
	}
	
	@Then("^Homepage is displayed$")
	public void homepage_is_displayed() throws Throwable {
		loginPage.isLoginSuccessful();
	}
	
	@Then("^Close the Browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
	
	@Then("^User logs out$")
	public void user_logs_out() throws Throwable {
		loginPage.clickLogout();
	}

	@When("^Go to Register Page$")
	public void go_to_register_page() throws Throwable{
		loginPage.clickRegister();
	}
	
	@When("^Register with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void register_with(String user, String fName, String lName, String pwd, String cnfPwd) throws Throwable{
		loginPage.enterRegUserName(user.trim());
		loginPage.enterRegFirstName(fName.trim());
		loginPage.enterRegLastName(lName.trim());
		loginPage.enterRegPassword(pwd.trim());
		loginPage.enterRegCnfPassword(cnfPwd.trim());
		
		loginPage.clickRegisterOnForm();
	}
	    
	@Then("^Verify resgitered successfully$")
	public void verify_registered_success() throws Throwable{
		ProfilePage proPage = new ProfilePage(driver);
		proPage.getResultText().equalsIgnoreCase("Registration is successful");
		
	}
	
	@When("^Enter user name \"([^\"]*)\" and password \"([^\"]*)\" after registeration$")
	public void enter_user_name_and_password_on_register(String uName, String pwd) throws Throwable {
		loginPage.enterUserName(uName+loginPage.rNum);
		loginPage.enterPassword(pwd+loginPage.rNum);
		loginPage.clickLogin();
		Thread.sleep(2000);
		
		loginPage.clickHomePage();
	}
	
}
