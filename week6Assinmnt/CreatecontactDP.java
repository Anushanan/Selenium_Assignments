package week6Assinmnt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreatecontactDP extends  Commonclasscontact{
	@Test(dataProvider="contact")

	public  void main(String Fname,String Lname) {
		
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Fname");
		driver.findElement(By.id("lastNameField")).sendKeys("Lname");
		driver.findElement(By.className("smallSubmit")).click();
		

	}
	@DataProvider(name="contact")

	public String[][] createcontact()  throws IOException
	{
		String [][]datacontact=Excelcontact.contactmethod();
		return datacontact;
	}
}
