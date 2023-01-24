package Jan20khols.KProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOrder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.kohls.com");
		driver.manage().window().maximize();
		
		WebElement userSearchText = driver.findElement(By.xpath("//input[@class='input-text']"));
		Actions a=new Actions(driver);
		a.sendKeys(userSearchText, "womens dress").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='K1000_1']")));
		driver.findElement(By.xpath("//li[@id='K1000_1']")).click();
		
		Thread.sleep(5000); 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[rel*='prd-5570619']")));
		driver.findElement(By.cssSelector("p[rel*='prd-5570619']")).click();
		
		js.executeScript("window.scrollBy(0,200)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='pdp-addtobag']")));
		driver.findElement(By.xpath("//input[@class='pdp-addtobag']")).click();
		
		//popup for continue shopping or iew cart
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-primary")));
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("button-panel1079")).click();
		
		//popup
		WebElement popup=driver.findElement(By.cssSelector(".close-modal "));
		if(popup!=null) {
			popup.click();
		}
		else {
			System.out.println("no popup present");
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='button-panel1099']")));
		driver.findElement(By.xpath("//button[@id='button-panel1099']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Jancy Christy");
        driver.findElement(By.name("lastName")).sendKeys("Johnson");
        driver.findElement(By.name("phoneNumber")).sendKeys("4236175026");
        driver.findElement(By.name("emailId")).sendKeys("jjancychristy24@gmail.com");
	}

}
