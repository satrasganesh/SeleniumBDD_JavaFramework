package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	WebDriver driver;
	int randomNum = (int)(Math.random()*(9999-99+1)+99);  
	public final int rNum = randomNum;
	
	public Dashboard(WebDriver webDriver) {
		this.driver = webDriver;
	}
	
	//Locator for login button
	By btnLogin = By.xpath("//button[text()='Login']");
	By userName = By.xpath("//input[@name='login']");
	By password = By.xpath("//input[@name='password']");

	By btnLogOut = By.xpath("//li/a[text()='Logout']");
	By btnRegister = By.xpath("//form/a[text()='Register']");
	
	By regUserName = By.xpath("//input[@id='username']");
	By firstName = By.xpath("//input[@id='firstName']");
	By lastName = By.xpath("//input[@id='lastName']");
	By regPassword = By.xpath("//input[@id='password']");
	By regCnfPwd = By.xpath("//input[@id='confirmPassword']");
	
	By btnRegisterForm = By.xpath("//button[text()='Register']");
	By homePage = By.xpath("//div/a[text()='Buggy Rating']");
	
	public void enterUserName(String uName) {
		driver.findElement(userName).sendKeys(uName);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(btnLogin).click();
	}
	
	public void clickLogout() {
		driver.findElement(btnLogOut).click();
	}
	
	public void clickRegister() {
		driver.findElement(btnRegister).click();
	}
		
	public void enterRegUserName(String user) {
		driver.findElement(regUserName).sendKeys(user+rNum);
	}
	
	public void enterRegFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname+rNum);
	}
	
	public void enterRegLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}
	
	public void enterRegPassword(String rpwd) {
		driver.findElement(regPassword).clear();
		driver.findElement(regPassword).sendKeys(rpwd+rNum);
	}
	
	public void enterRegCnfPassword(String rcnfpwd) {
		driver.findElement(regCnfPwd).clear();
		driver.findElement(regCnfPwd).sendKeys(rcnfpwd+rNum);
	}
	

	public void clickRegisterOnForm() {
		driver.findElement(btnRegisterForm).click();
	}
	
	public boolean isLoginSuccessful() {
		return driver.findElement(btnLogOut).isDisplayed();
	}
	public void clickHomePage() {
		driver.findElement(homePage).click();
	}
}
