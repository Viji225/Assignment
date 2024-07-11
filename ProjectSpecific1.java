package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectSpecific1 {
	ChromeDriver driver;
	
	@BeforeMethod
public void precondition() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	 driver = new ChromeDriver(options);
	 driver.get("https://login.salesforce.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	 driver.findElement(By.id("password")).sendKeys("testleaf@2024");
	 driver.findElement(By.id("Login")).click();
}
	@AfterMethod
public void postcondition() {
	driver.close();
}
}
