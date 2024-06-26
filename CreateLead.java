package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Collection based xpath
		
		driver.findElement(By.xpath("(//input[@class ='inputLogin'])[1]")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//xpath using contains text keyword
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.name("generalProfTitle")).sendKeys("TestWelcome");
		//dropdown
		WebElement SourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select SourceDD = new Select(SourceWE);
		SourceDD.selectByIndex(5);
		
		WebElement MarketCampign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select MarketCampignDD = new Select(MarketCampign);
		MarketCampignDD.selectByVisibleText("Road and Track");
		
		
		WebElement Currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select CurrencyDD = new Select(Currency);
		CurrencyDD.selectByValue("USD");
		
		
		driver.findElement(By.name("submitButton")).click();
		
		

	}

}
