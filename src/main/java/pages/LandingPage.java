package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {
	
	@FindBy(xpath="//*[@id='u_0_j']")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id='u_0_l']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id='u_0_o']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='u_0_v']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='day']")
	WebElement dateOfBirth;
	
	@FindBy(xpath="//*[@id='month']")
	WebElement monthOfBirth;
	
	@FindBy(xpath="//*[@id='year']")
	WebElement yearOfBirth;
	
	@FindBy(xpath="//*[@id='u_0_7']")
	WebElement genderMale;
	
	@FindBy(xpath="//*[@id='u_0_6']") 
	WebElement genderFemale;
	
	@FindBy(xpath="//*[@id='u_0_11']")
	WebElement signUp;
	
	public void registerNewAccountMale()
	{
		firstName.sendKeys("");
		lastName.sendKeys("");
		email.sendKeys();
		
		/*Select dateBirth = new Select(dateOfBirth);
		dateBirth.selectByValue(value);
		
		Select monthBirth = new Select(monthOfBirth);
		monthBirth.selectByValue(value);
		
		Select yearBirth = new Select(yearOfBirth);
		yearBirth.selectByValue(value);*/
		
		genderMale.click();
		
		signUp.click();
		
		
		
	}
}
