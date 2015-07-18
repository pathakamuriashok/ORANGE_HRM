package ORENGE_HRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class control_program
{ 
   WebDriver driver;
   @Test
   public void setUP() throws IOException
   {
	   driver=new FirefoxDriver();
	   driver.get("http://professional.demo.orangehrmlive.com/symfony/web/index.php/auth/login");
	   LOGIN_panel LP=PageFactory.initElements(driver,LOGIN_panel.class);
	   LP.LOGIN_panel_M("admin","admin");
	   
 FileInputStream fin=new FileInputStream("C:\\Users\\qdge\\maven_project\\src\\test\\java\\com\\files\\PIM.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fin);
	XSSFSheet ws=wb.getSheet("Sheet1");
	   add_employee ADDEMP=PageFactory.initElements(driver,add_employee.class);
	   ADDEMP.menu.PIM_CLICK();
	   Row r=null;
	   Iterator<Row> rows=ws.iterator();
	   rows.next();
	   while(rows.hasNext())
	   {
		   r=rows.next();
		   ADDEMP.ReadfromXL(r);
	   }
   }
}
