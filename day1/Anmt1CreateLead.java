package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anmt1CreateLead {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anusha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Praveen");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.name("departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("No experience");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anu.anand87@gmail.com");
		driver.findElement(By.name("submitButton")).click();	
		driver.getTitle();
		
		
		

	}

}

