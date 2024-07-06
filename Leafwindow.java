package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafwindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//*[text()='Contacts']")).click();
		driver.findElement(By.xpath("//*[text()='Merge Contacts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		String ParentWn = driver.getWindowHandle();
		System.out.println(ParentWn);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allhandles.get(1));
		
		driver.findElement(By.xpath("//*[@class='linktext']")).click();
		driver.switchTo().window(ParentWn);
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> allhandles1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(allhandles1.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click();
		driver.switchTo().window(ParentWn);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		String actualtitle = driver.getTitle();
		String ExceptedTitle = "Merge Contacts | opentaps CRM";
		if(actualtitle.equals(ExceptedTitle))
			System.out.println(actualtitle);
		driver.close();
		
		
		
		
		

	}

}
