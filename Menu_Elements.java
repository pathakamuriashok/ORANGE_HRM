package ORENGE_HRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu_Elements 
{
     @FindBy(linkText="Admin")
     WebElement Admin;
     
     @FindBy(linkText="PIM")
     WebElement PIM;
     
     @FindBy(linkText="Leave")
     WebElement Leave;
     
     @FindBy(linkText="Time")
     WebElement Time;
     
     @FindBy(linkText="Recruitment")
     WebElement Recruitment;
     
     @FindBy(linkText="Discipline")
     WebElement Discipline;
     
     @FindBy(linkText="Training")
     WebElement Training;
     
     @FindBy(linkText="Performance")
     WebElement Performance;
     
     @FindBy(linkText="On-boarding")
     WebElement boarding;
     
     @FindBy(linkText="More")
     WebElement More;
     
     public void PIM_CLICK()
     {
    	 PIM.click();
     }
     
}
