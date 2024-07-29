package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	@FindBy(id="gender-male")
	private WebElement MaleRadioButton;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement FemaleRadioButton;
	
	@FindBy(xpath="//label[text()='First name']")
	private WebElement FirstNameTextField;
	
	@FindBy(id="LastName")
	private WebElement LastNameTextField;
	
	@FindBy(id="Email")
	private WebElement EmailTextField;
	
	@FindBy(id="Password")
	private WebElement PasswordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextField;
	
	@FindBy(id="register-button")
	private WebElement RegisterButton;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
}

	public WebElement getMaleRadioButton() {
		return MaleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return FemaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

	public WebElement getCompletedmsg() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
