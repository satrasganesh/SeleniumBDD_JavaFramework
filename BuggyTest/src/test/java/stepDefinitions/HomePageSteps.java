package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Dashboard;
import pageObjects.HomePage;

public class HomePageSteps {

	HomePage hPage = new HomePage(BuggySteps.driver);
	String car;
	Dashboard loginPage = new Dashboard(BuggySteps.driver);
	@When("^Popular Model \"([^\"]*)\" is chosen$")
	public void popular_Model_chosen(String item) throws Throwable {
		car = item.trim();
		hPage.selectItem(item.trim());
	}
	
	@Then("^Verify correct car popular model is opened$")
	public void user_is_on_profile_page() throws Throwable {
		hPage.verifyTitle().equalsIgnoreCase(car);
	}
	
	
	@When("^User puts comment \"([^\"]*)\"$")
	public void user_puts_comment(String txt) throws Throwable{
		hPage.enterComment(txt+loginPage.rNum);
		hPage.clickVote();
	}
	
}
