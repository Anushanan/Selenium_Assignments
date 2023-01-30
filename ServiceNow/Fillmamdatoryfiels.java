package ServiceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Fillmamdatoryfiels {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://dev100520.service-now.com/navpage.do");	
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("fx0F8*!jwNSW");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		Shadow sd= new Shadow(driver);
		sd.setImplicitWait(30);
		sd.findElementByXPath("//div[text()='All']").click();
		
		
		WebElement click = sd.findElementByXPath("//input[@id='filter']");
		click.sendKeys("Knowledge");
		click.click();
		sd.setImplicitWait(30);
		Thread.sleep(3000);
		sd.findElementByXPath("//mark[text()='Knowledge']").click();
		WebElement elemntFrame = sd.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(elemntFrame);	
		
		driver.findElement(By.xpath("//span[text()='Create an Article']")).click();
		driver.findElement(By.id("sys_display.kb_knowledge.kb_knowledge_base")).sendKeys("IT");
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_category']")).sendKeys("JAVA");
		driver.findElement(By.id("kb_knowledge.short_description")).sendKeys("new description");
		driver.findElement(By.xpath("//iframe[@id='kb_knowledge.text_ifr']")).sendKeys("new description");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		

	}

}
