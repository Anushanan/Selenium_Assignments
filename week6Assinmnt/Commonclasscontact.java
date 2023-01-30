package week6Assinmnt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Commonclasscontact {
	public ChromeDriver driver;
	
	
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	
	public void preConditions(String browser,String url,String uname,String Password)
	{
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		

	}
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
	

}
