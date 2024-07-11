package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Salesforce extends ProjectSpecific1 {
@Test
public void runsalesforce() throws InterruptedException {
	driver.findElement(By.xpath("//*[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	WebElement legal = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	Actions action = new Actions(driver);
	action.moveToElement(legal).click().perform();
	//WebDriverWait nn = new WebDriverWait(driver,Duration.ofSeconds(5));
	
	//driver.findElement(By.xpath("//*[text()='Recently Viewed | Legal Entities']")).click();

	driver.findElement(By.xpath("//*[@title='New']")).click();
	//driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
	driver.findElement(By.xpath("//*[@name='CompanyName']")).sendKeys("TestLeaf");
	driver.findElement(By.xpath("(//*[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
	WebElement status = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox')]"));
	driver.executeScript("arguments[0].click();", status);
	//action.moveToElement(status).click().perform();
	driver.findElement(By.xpath("//span[text()='Active']")).click();
	//driver.findElement(By.xpath("(//*[@class='slds-media__body'])[3]")).click();
	driver.findElement(By.xpath("//*[@class='slds-button slds-button_brand']")).click();
	String ActualMessage = driver.findElement(By.xpath("//*[@class='slds-truncate slds-text-heading_medium']")).getText();
	
	String ExpectedMessage = "We hit a snag.";
	if(ActualMessage.equals(ExpectedMessage))
		System.out.println(ActualMessage);
}
}