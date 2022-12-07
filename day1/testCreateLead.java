package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testCreateLead {


	public static void main(String[] args) {
		
		
		
		
		
		ChromeDriver driver= new ChromeDriver ();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		//Apply the wait to locate the element-global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anusha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Praveen");
			
		WebElement source= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source1=new Select(source);
		source1.selectByIndex(2);
		WebElement ownership=driver.findElement(By.id("ownershipEnumId"));
		Select owner= new Select(ownership);
		owner.selectByIndex(3);
		owner.selectByValue("OWN_PROPRIETOR");
		owner.selectByVisibleText("Corporation");		
		
		driver.findElement(By.name("submitButton")).click();
		driver.close();

	}

}
