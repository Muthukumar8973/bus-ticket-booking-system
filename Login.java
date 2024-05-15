package testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
		
	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\whynew.in\\eclipse-workspace\\seleniumnew\\driver\\msedgedriver.exe");
	    
	     driver = new EdgeDriver();
		
	}

	@Test(priority=1)
	public void openRedBus() throws InterruptedException {
		 driver.get("https://www.redbus.in/");
	     driver.manage().window().maximize();
	     	}
	
	@Test(priority=2)
    public void search() throws InterruptedException{
       
    	
        WebElement source = driver.findElement(By.id("src"));
        
        source.sendKeys("chennai");
        Thread.sleep(2000);
       
        WebElement destination = driver.findElement(By.id("dest"));
        destination.sendKeys("dindigul");
        Thread.sleep(2000);
       
        WebElement date = driver.findElement(By.id("onwardCal"));
        date.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='26']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.id("search_button")).click();
        
       }
       
@Test(priority=3)
public	void select() throws InterruptedException
{
	
	
    Thread.sleep(2000);  
	WebElement down = driver.findElement(By.xpath("//div[text()='OPERATOR']"));
	
	 JavascriptExecutor j= (JavascriptExecutor)driver;
	j.executeScript("arguments[0].scrollIntoView(true)",down);
	
	
	WebElement seat= driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[4]"));
	j.executeScript("arguments[0].click()", seat);
	Thread.sleep(40000);
	
	
   driver.findElement(By.xpath("(//div[@class='radio-unchecked'])[1]")).click();
   driver.findElement(By.xpath("(//div[@class='radio-unchecked'])[9]")).click();
   driver.findElement(By.xpath("//button[text()='Proceed to book']")).click();
   Thread.sleep(2000);
     
   driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("muthu");    
   
	//genderselect	
	//driver.findElement(By.xpath("//div[@class='gender_position_abs ']")).click();
	Thread.sleep(1000);
	//radiobutton
	WebElement rad = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	j.executeScript("arguments[0].click()", rad);
	
	//age
	WebElement age = driver.findElement(By.xpath("//input[@placeholder='Age']"));
	
	age.sendKeys("25");
	//state
	WebElement state = driver.findElement(By.xpath("//input[@id='201']"));
	state.sendKeys("tamilnadu");
	
	//email
	WebElement email = driver.findElement(By.xpath("//input[@id='seatno-05']"));
	email.sendKeys("muthukumar21598@gmail.com");
	
	//mobileno
	WebElement mobileno = driver.findElement(By.xpath("//input[@id='seatno-06']"));
	mobileno.sendKeys("8973185508");
			
			
	//i agree terms&condition
			
	driver.findElement(By.xpath("(//span[@class='checkmark-radio'])[1]")).click();
	
	driver.findElement(By.xpath("//input[@value='Proceed to pay']")).click();
			
	driver.quit();
	
	
}
	}