package ServiceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class OrderingMobile {

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
		
		WebElement clickfilter = sd.findElementByXPath("//input[@id='filter']");
		clickfilter.sendKeys("Service Catalog");
		clickfilter.click();
				sd.setImplicitWait(30);
		
		
		
		sd.findElementByXPath("//mark[text()='Service Catalog']").click();
		Thread.sleep(3000);

		sd.setImplicitWait(10);
		WebElement element = sd.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element);
		
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.linkText("Apple iPhone 13")).click();
		
		
		driver.findElement(By.xpath("//label[text()='No']")).click();
		driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']")).click();
		driver.findElement(By.xpath("//option[@value='Unlimited']")).click();
		driver.findElement(By.xpath("//label[text()='Blue']")).click();
		driver.findElement(By.xpath("//label[text()='128 GB']")).click();
		// Select  Order now option
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		
		
		
		
	}

}
