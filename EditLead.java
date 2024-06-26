package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Collection based xpath
		
		driver.findElement(By.xpath("(//input[@class ='inputLogin'])[1]")).sendKeys("democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//xpath using contains text keyword
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		//createLeadForm_firstNameLocal
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vino");
		driver.findElement(By.name("generalProfTitle")).sendKeys("TestWelcome");
		driver.findElement(By.name("departmentName")).sendKeys("Market");
		driver.findElement(By.name("description")).sendKeys("Good name");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Vij@g.com");
		
		WebElement StateWE = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select	Statedd = new Select(StateWE);
	    Statedd.selectByVisibleText("New York");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateLeadForm_description")).clear();
	    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("HaveGoodDay");
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    String Title = driver.getTitle();
	    System.out.println("Title: "+Title);
	    driver.close();
	    
	    
	    
	    
	    
		
		
		
		
		

	}

}
