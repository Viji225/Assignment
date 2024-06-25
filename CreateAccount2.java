package Week2.day1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount2 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("(//input[@class ='inputLogin'])[1]")).sendKeys("demosalesmanager");
	
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	driver.findElement(By.xpath("(//*[@class='decorativeSubmit'])")).click();
	driver.findElement(By.xpath("(//a[contains(text(),'CRM/SFA')])")).click();
	driver.findElement(By.xpath("(//a[text()='Accounts'])")).click();
	driver.findElement(By.xpath("(//a[text()='Create Account'])")).click();
	driver.findElement(By.id("accountName")).sendKeys("IncomeTax");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	
	WebElement IndustryWE = driver.findElement(By.name("industryEnumId"));
	Select IndustryDD = new Select(IndustryWE);
	IndustryDD.selectByIndex(3);
	
     Select Ownership  = new Select(driver.findElement(By.name("ownershipEnumId")));
     Ownership.selectByVisibleText("S-Corporation");
     
    Select datasource= new Select(driver.findElement(By.id("dataSourceId")));
    datasource.selectByValue("LEAD_EMPLOYEE");
    
   Select MarketCampaign = new Select(driver.findElement(By.name("marketingCampaignId")));
   MarketCampaign.selectByIndex(6);
   
  Select StateProvince = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
  StateProvince.selectByValue("TX");
  
 driver.findElement(By.xpath("(//*[@value='Create Account'])")).click();
 

 
WebElement Accountname = driver.findElement(By.partialLinkText("IncomeTax"));
 boolean acc =   Accountname.isDisplayed();
 System.out.println("Accountname displayed:" + acc);
 
 driver.close();

	}

}
