package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rail {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.linkText(" FLIGHTS ")).click();
		driver.findElement(By.xpath("//*[text()=' FLIGHTS ']")).click();
		String currentWindow = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(window);
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(windows.get(0));
		driver.close();
		
		
		

}
}
