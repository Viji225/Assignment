package Week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.name("generalProfTitle")).sendKeys("TestWelcome");
		driver.findElement(By.className("smallSubmit")).click();
		String actualTitle = driver.getTitle();
		String ExpectedTitle = "View Lead | opentaps CRM";
		if(actualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title verification passed! Actual title is: " + actualTitle);
		}
		else
		{
			System.out.println("Title verification failed! Expected title was: " + ExpectedTitle
                    + " but the actual title is: " + actualTitle);
		}
			
		driver.close();
		
		

	


	}

}
