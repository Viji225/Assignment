package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook1 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	//Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Banu");
	driver.findElement(By.name("lastname")).sendKeys("Kumar");
	driver.findElement(By.name("reg_email__")).sendKeys("99");
	driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Qwe@123");
	
	 WebElement DayWE =    driver.findElement(By.id("day"));
	 Select Daydd = new Select(DayWE);
	 Daydd.selectByValue("22");
	 
	 WebElement MonthWE = driver.findElement(By.id("month"));
	  Select Monthdd = new Select(MonthWE);
	  Monthdd.selectByVisibleText("May");
	  
	 WebElement YearWE = driver.findElement(By.id("year"));
	 Select YearDD = new Select(YearWE);
	 YearDD.selectByIndex(5);
	 //driver.findElement(By.name("sex")).click();
	driver.findElement(By.xpath("(//*[@name='sex'])[2]")).click();

	 
	
	
	driver.close();

	}

}
