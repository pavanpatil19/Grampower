package Gram_power1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gram_Home_page 
{
	public static void main (String []  args) throws InterruptedException 
	{
	// Opening browser Step-1
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\Chromedriver-new\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	// Opening Application Step-2
	driver.get("https://grampower.com/utility.html");

	Thread.sleep(3000);
	//Verifying Logo is interlink with another page or not Step-3
	driver.findElement(By.xpath("//img[@src=\"/static/images/gp-logo.svg\"]")).click();
	driver.navigate().back();
	Thread.sleep(3000);

	// Verifying Email ID Text Box Field Step-4
	driver.findElement(By.xpath("//input[contains(@id,\"tb\")]")).sendKeys("pavan.kdpatil5@gmail.com");
	Thread.sleep(3000);

	//Verifying Get Started Button Step-5
	driver.findElement(By.xpath("//button[contains(@id,\"btn_submit\")]")).click();
	driver.navigate().back();
	Thread.sleep(3000);

	//Click Home tab element Step-6
	driver.findElement(By.xpath("(//a[text()=\"Home\"])[2]")).click();
	Thread.sleep(3000);

	//Click Mapping tab element Step-7
	driver.findElement(By.xpath("//a[text()=\"Mapping\"]")).click();
	Thread.sleep(3000);

	//Click Mapping tab element Step-8
	driver.findElement(By.xpath("//a[text()=\"Meters\"]")).click();

	//Click Online Portal tab element Step-8
	driver.findElement(By.xpath("//a[text()=\"Online Portal\"]")).click();

	//Click role button in portal tab Step-9
	driver.findElement(By.xpath("(//button[@role=\"button\"])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@role=\"button\"])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@role=\"button\"])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@role=\"button\"])[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@role=\"button\"])[5]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@role=\"button\"])[6]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@role=\"button\"])[7]")).click();



	driver.close();


	
	
	
	
}
