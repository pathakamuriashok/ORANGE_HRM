package ORENGE_HRM;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class add_employee
{
	//WebDriver driver;
	Menu_Elements  menu=null;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement menu_pim_addEmployee;
	
	public add_employee(WebDriver driver)
	{
		menu=PageFactory.initElements(driver,Menu_Elements.class);
		menu_pim_addEmployee.click();
	}
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="middleName")
	WebElement middleName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="employeeId")
	WebElement employeeId;
	
	@FindBy(id="chkLogin")
	WebElement chkLogin;
	
	@FindBy(id="location")
	WebElement location;
	
	@FindBy(id="user_name")
	WebElement user_name;
	
	@FindBy(id="user_password")
	WebElement user_password;
	
	@FindBy(id="re_password")
	WebElement re_password;
	
	@FindBy(id="status")
	WebElement status;
	
	@FindBy(id="btnSave")
	WebElement btnSave;

public void ReadfromXL(Row r)
{
firstName.sendKeys(r.getCell(0).getStringCellValue());

middleName.sendKeys(r.getCell(1).getStringCellValue());

lastName.sendKeys(r.getCell(2).getStringCellValue());

employeeId.sendKeys(r.getCell(3).getStringCellValue());

chkLogin.sendKeys(r.getCell(4).getStringCellValue());
		if(r.getCell(4).getStringCellValue().equals("Y"))
		{
			if(!chkLogin.isSelected())
			{
				chkLogin.click();
			}	
			user_name.sendKeys(r.getCell(5).getStringCellValue());

			user_password.sendKeys(r.getCell(6).getStringCellValue());

			re_password.sendKeys(r.getCell(7).getStringCellValue());

			status.sendKeys(r.getCell(8).getStringCellValue());
		}
        location.sendKeys(r.getCell(9).getStringCellValue());
		btnSave.click();
}
}

