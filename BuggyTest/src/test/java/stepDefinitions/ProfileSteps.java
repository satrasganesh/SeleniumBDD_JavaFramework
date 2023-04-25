package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProfilePage;


public class ProfileSteps {
	
	ProfilePage proPage = new ProfilePage(BuggySteps.driver);
	
	@Given("^User is on profile page$")
	public void user_is_on_profile_page() throws Throwable {
		proPage.clickProfile();
	}
		  
	@When("^Enter profile info \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" in additional info pane$")
	public void enter_profile_info(String gender, String age, String phone) throws Throwable{
		
		proPage.enterGender(gender.trim());
		proPage.enterAge(age.trim());
		proPage.enterPhone(phone.trim());
		
		proPage.clickSave();
	}
	
	@Then("^Verify profile saved!$")
	public void verify_additional_info_pane() throws Throwable{
				
		proPage.getResultText().equalsIgnoreCase("The profile has been saved successful");
	}
	

}
