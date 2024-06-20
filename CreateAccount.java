package Week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Username =  driver.findElement(By.id("username"));
		Username.sendKeys("demosalesmanager");
		WebElement Password = driver.findElement(By.name("PASSWORD"));
		Password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Viji");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.id("numberEmployees")).sendKeys("20");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		driver.findElement(By.className("smallSubmit")).click();
		String actualTitle = driver.getTitle();
		String ExpectedTitle = "Create Account | opentaps CRM";
		if(actualTitle.equals(ExpectedTitle))
		{System.out.println("Title verification passed! Actual title is: " + actualTitle);}
		else
		{
			System.out.println("Title verification failed! Expected title was: " + ExpectedTitle
                    + " but the actual title is: " + actualTitle);
		}
		driver.close();

		
		
		
		
		
		
	}

}
