package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver webDriver) {
		this.driver = webDriver;
	}
	
	By popularModel;
	By item = By.xpath("//div[@class='container']//h3");
	By commentBox = By.xpath("//*[@id='comment']");
	By btnVote = By.xpath("//button[text()='Vote!']");
	
	public void selectItem(String item) {
		popularModel = By.xpath("//*[@title='"+item+"']/parent::*");
		driver.findElement(popularModel).click();
	}
	
	public String verifyTitle() {
		return driver.findElement(item).getText();
	}
	
	public void enterComment(String text) {
		driver.findElement(commentBox).sendKeys(text);
	}
	
	public void clickVote() {
		driver.findElement(btnVote).click();
	}
	
}
