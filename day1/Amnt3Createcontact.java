package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amnt3Createcontact {

	public static <webElement> void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Anusha1");
		driver.findElement(By.id("lastNameField")).sendKeys("Praveen");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement name=driver.findElement(By.id("firstNameField"));
		 String firstname=name.getText();
		 System.out.println(firstname);
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		//driver.close();
		 
		

	}

	
	}


