package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) {
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.leafground.com/radio.xhtml");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.manage().window().maximize();

	   driver.findElement(By.xpath("//label[@for='j_idt87:console1:1']")).click();
	   
	  WebElement Unselected =  driver.findElement(By.xpath("//*[@for='j_idt87:city2:1']"));
	  Unselected.click();
	  Unselected.click();
	  System.out.println("Button unselected: "+!Unselected.isSelected());
	  
	  WebElement chrome = driver.findElement(By.xpath("//input[@id='j_idt87:console2:0']"));
	  WebElement Firefox = driver.findElement(By.xpath("//input[@id='j_idt87:console2:1']"));
	  WebElement Safari = driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
	  WebElement Edge = driver.findElement(By.xpath("//input[@id='j_idt87:console2:3']"));
	  if(chrome.isSelected())
		  System.out.println("Default radio is: "+chrome);
	  else if(Firefox.isSelected())
	  System.out.println("Default radio is: "+Firefox);
	  else if(Safari.isSelected())
		  System.out.println("Default radio is: Safari");
	  else if(Edge.isSelected())
		  System.out.println("Default radio is: "+Edge);
 
	  WebElement age = driver.findElement(By.xpath("//input[@value='21-40 Years']"));

if(age.isSelected())
	System.out.println("Selected");
else
	age.click();



	  
			  
	   
	  
	   
	

	}

}
