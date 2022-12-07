package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amnt2DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver  driver =new  ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anusha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anand");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.name("departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("No experience");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anu.anand87@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle();	
		WebElement companyNameField=driver.findElement(By.id("createLeadForm_companyName"));
		companyNameField.sendKeys("Testleaf");
		companyNameField.clear();
		companyNameField.sendKeys("Tech Mahindra");
		WebElement firstNameChange=driver.findElement(By.id("createLeadForm_firstName"));
		firstNameChange.sendKeys("Anusha");
		firstNameChange.clear();
		firstNameChange.sendKeys("Karthika");
		
		
		driver.findElement(By.name("submitButton")).click();
	    driver.getTitle();
		
		driver.close();		
		
		
		
		
				


	}

}
