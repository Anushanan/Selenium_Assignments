package ServiceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Createnewcaller {

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
				
		WebElement click = sd.findElementByXPath("//input[@id='filter']");
		click.sendKeys("Callers");
		click.click();
		sd.setImplicitWait(30);
		Thread.sleep(3000);
		sd.findElementByXPath("//mark[text()='Callers']").click();
		WebElement elemntFrame = sd.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(elemntFrame);	
		
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Anusha1");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Anand1");
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("Practise");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("cvanupravi@gmail.com");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("9887654356");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		sd.setImplicitWait(15);
		WebElement verifycaller = driver.findElement(By.xpath("//td[text()='Anusha1']"));
		if(verifycaller.getText().contains("Anusha1")) {
			System.out.println("contact verified");
		}
		else {
			System.out.println("contact unverified");
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys();
		
		
	
		
	

	}

}
