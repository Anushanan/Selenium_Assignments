package ServiceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class CreateNewproposal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev100520.service-now.com/navpage.do");	
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("fx0F8*!jwNSW");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		Shadow sd= new Shadow(driver);
		sd.setImplicitWait(30);
		sd.findElementByXPath("//div[text()='All']").click();		
		WebElement filter = sd.findElementByXPath("//input[@id='filter']");
		//sd.setImplicitWait(30);
		filter.click();
		filter.sendKeys("My Proposals");
		
		sd.findElementByXPath("//mark[text()='My Proposals']").click();
		Thread.sleep(3000);
		WebElement elemntFrame = sd.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(elemntFrame);	
		
		driver.findElement(By.xpath("//button[text()='New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("std_change_proposal.template_name")).sendKeys("Anusha123");
				
		driver.findElement(By.id("std_change_proposal.short_description")).sendKeys("This is testcase for new proposal");
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		
		
	
	}

}
