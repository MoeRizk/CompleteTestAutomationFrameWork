package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends pageBase{

	
	public RegisterPage(WebDriver driverToBeUsedByPaseBaseObj) {
		super(driverToBeUsedByPaseBaseObj);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "gender-male")
	WebElement Male_Radio_Button;
	
	@FindBy(id = "gender-female")
	WebElement Female_Radio_Button;
	
	@FindBy(id = "FirstName")
	WebElement First_name_txtBox;
	
	@FindBy(id = "LastName")
	WebElement Last_name_txtBox;
	
	@FindBy(name = "DateOfBirthDay")
	WebElement the_day_of_birth_dropdown;
	
	@FindBy(name = "DateOfBirthMonth")
	WebElement the_month_of_birth_dropdown;
	
	@FindBy(name = "DateOfBirthYear")
	WebElement the_year_of_birth_dropdown;
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Company")
	WebElement company_txtbox;
	
	@FindBy(id = "Newsletter")
	WebElement newletter_checkbox;
	
	@FindBy(id = "Password")
	WebElement password_txtBox;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confirm_password_txtBox;
	
	@FindBy(id = "register-button")
	WebElement register_button;
	
	//For assertion
	
	@FindBy(xpath = "//div[@class='result']")
	public WebElement registerationSuccessMsg;
	
	@FindBy(xpath = "//input[@value='Continue']")
	public WebElement successContinueBTN;
	
	
	
	
	@FindBy(xpath= "//h1[contains(text(),'Register')]")
	WebElement registerTitle;
	
	public void registerNewUser(String gender, String Fname, String lname, String date, int month, String year, String email, String company, String testPassword) {
		Select birth_day_drp_obj = new Select(the_day_of_birth_dropdown);
		Select birth_month_drp_obj = new Select(the_month_of_birth_dropdown);
		Select birth_year_drp_obj = new Select(the_year_of_birth_dropdown);
		if (gender.toLowerCase().contentEquals("male")) {
			click(Male_Radio_Button);
			
		}else {
			click(Female_Radio_Button);
		}
		
		writeInElement(Fname, First_name_txtBox);
		writeInElement(lname, Last_name_txtBox);
		birth_day_drp_obj.selectByVisibleText(date);
		birth_month_drp_obj.selectByIndex(month);
		birth_year_drp_obj.selectByVisibleText(year);
		writeInElement(email, this.email);
		writeInElement(company, company_txtbox);
		click(newletter_checkbox);
		writeInElement(testPassword, password_txtBox);
		writeInElement(testPassword, confirm_password_txtBox);
		click(register_button);
		
		
	}
	
	public WebElement getRegisterTitle() {
		return registerTitle;
	}
		

	
}
