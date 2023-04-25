package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
	
	WebDriver driver;
	
	public ProfilePage(WebDriver webDriver) {
		this.driver = webDriver;
	}
	
	By txtGender = By.xpath("//input[@id='gender']");
	By txtAge = By.xpath("//input[@id='age']");
	By txtPhone = By.xpath("//input[@id='phone']");
	By btnSave = By.xpath("//div[@class='row btn-block']//button[text()='Save']");
	By btnProfile = By.xpath("//div[@class='container']//*[text()='Profile']");
	By resultMsg = By.xpath("//div[contains(@class,'result alert')][1]");
	
	public void enterGender(String gender) {
		driver.findElement(txtGender).clear();
		driver.findElement(txtGender).sendKeys(gender);
	}
	
	public void enterAge(String age) {
		driver.findElement(txtAge).clear();
		driver.findElement(txtAge).sendKeys(age);
	}
	public void enterPhone(String phone) {
		driver.findElement(txtPhone).clear();
		driver.findElement(txtPhone).sendKeys(phone);
	}
	public void clickSave() {
		driver.findElement(btnSave).click();
	}
	public void clickProfile() {
		driver.findElement(btnProfile).click();
	}
	public String getResultText() {
		return driver.findElement(resultMsg).getText();
	}
}
