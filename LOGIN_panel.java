package ORENGE_HRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LOGIN_panel 
{
     
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement Login;
	
	public void LOGIN_panel_M(String x,String y)
	{
		username.sendKeys(x);
		username.sendKeys(y);
		Login.click();
	}
	
}
