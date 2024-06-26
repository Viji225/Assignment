package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[text()='Basic']")).click();
		driver.findElement(By.xpath("//*[text()='Ajax']")).click();
		
//To check the message is displayed
		WebElement MessageWE = driver.findElement(By.xpath("//*[@class ='ui-growl-title']"));
		boolean Message = MessageWE.isDisplayed();
		System.out.println("Message dispalyed: " +Message); 
//To click on python checkbox which is second checkbox
		WebElement LangWE = driver.findElement(By.xpath("(//*[@class = 'ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]"));
		driver.executeScript("arguments[0].click();", LangWE);
//Click on Tri-state Checkbox
	  WebElement Tri	= driver.findElement(By.xpath("//*[@class='ui-chkbox-icon ui-c ']"));
	  driver.executeScript("arguments[0].click()", Tri);
//Verify Which Tri-state is chosen (0,1,2)
	
	 String TriSt = driver.findElement(By.xpath("//p[contains(text(),'State = ')]")).getText();
	 System.out.println("TriState:  " + TriSt);
//Click on Toggle
	 //ui-toggleswitch-slider
     driver.findElement(By.xpath("//*[@class = 'ui-toggleswitch-slider']")).click();
     ////*[@class='ui-growl-title']
     WebElement TogWE = driver.findElement(By.xpath("//*[@class='ui-growl-title']"));
     boolean Toggle = TogWE.isDisplayed();
     System.out.println("Toggle displayed:" +Toggle);
     
     //verify if the checkbox is disabaled
    WebElement Checkbox = driver.findElement(By.xpath("//*[@name='j_idt87:j_idt102_input']"));
     if(!Checkbox.isEnabled())
    	System.out.println("Checkbox is disabled");
    else
    	System.out.println("Checkbox is Enabled");
     //Click on the Select multiple   check london and paris
     driver.findElement(By.xpath("//*[@id='j_idt87:multiple']")).click();
     driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div")).click();
     driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div")).click();
     //close the multi select checkbox
      driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
	driver.close();
	 
	 
	}

}
