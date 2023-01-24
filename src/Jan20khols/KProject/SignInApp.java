package Jan20khols.KProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String pwd="Online@1988k";
		WebDriver driver=new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		driver.get("https://www.kohls.com/myaccount/kohls_login.jsp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='kiosk_loginEmail']")).sendKeys("jjancychristy1988@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='kiosk_loginPassword']")).sendKeys(pwd);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Profilelogin']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement userName=driver.findElement(By.xpath("//input[@id='kiosk_loginEmail']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@id='kiosk_loginPassword']"));
		WebElement submit=driver.findElement(By.xpath("//input[@id='Profilelogin']"));
		Actions a=new Actions(driver);
		a.moveToElement(userName).click().sendKeys("jjancychristy1988@gmail.com").build().perform();
		Thread.sleep(2000);
		a.moveToElement(passWord).click().sendKeys("Online@1988k").build().perform();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		
		a.moveToElement(submit).click().build().perform();
		*/
	}

}
