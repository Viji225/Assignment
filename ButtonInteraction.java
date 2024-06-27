package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/button.xhtml");
	Thread.sleep(1000);
	WebElement Button = driver.findElement(By.xpath("//*[text()='Click and Confirm title.']/following::span"));
	boolean buttondd = !Button.isEnabled();
	if(buttondd)
	System.out.println("Button is disable: "+buttondd);
	else
	System.out.println("Button is is not disable: "+buttondd);
	
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "dashboard.’";
	if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		System.out.println("Title of page is: "+ActualTitle);
	else
		System.out.println("Title of Page is: "+ActualTitle);
	//Position
	WebElement ButtonSubmit = driver.findElement(By.xpath("//span[text()='Submit']"));
	int x = ButtonSubmit.getLocation().getX();
	int y = ButtonSubmit.getLocation().getY();
	System.out.println("Position of x:" + x +",y"+y);
	//Background Color
	WebElement ButtonColor = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));
	String Color = ButtonColor.getCssValue("background-color");
	System.out.println("Backgroundcolor"+Color);
	//Height and Width
	WebElement Dimensions = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
	int height = Dimensions.getSize().getHeight();
	int width = Dimensions.getSize().width;
	System.out.println("Height:"+height+",width:"+width);
	
	driver.close();
	
	
	
	}

}

