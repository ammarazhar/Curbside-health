package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class curbsideHealth_signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://curbside-front-end.herokuapp.com/sign-up");
		
		WebElement btn = driver.findElement(By.name("firstName"));
		btn.sendKeys("", Keys.ENTER);
		
		WebElement fn = driver.findElement(By.name("firstName"));
		fn.sendKeys("@ammar");
		fn.clear();
		
		WebElement fn2 = driver.findElement(By.name("firstName"));
		fn2.sendKeys("Ammar");
		
		WebElement ln = driver.findElement(By.name("lastName"));
		ln.sendKeys("Te$ter");
		ln.clear();
		
		WebElement ln2 = driver.findElement(By.name("lastName"));
		ln2.sendKeys("Tester");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("ammartest@");
		email.clear();
		
		WebElement email2 = driver.findElement(By.name("email"));
		email2.sendKeys("ammartest@a.com");
		
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys("Admin@123");
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,500)");
		
		WebElement cn_pw = driver.findElement(By.name("confirmPassword"));
		cn_pw.sendKeys("Admin@123", Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement signin = driver.findElement(By.linkText("Sign In"));
		signin.click();
		driver.navigate().back();
		
		WebElement demo = driver.findElement(By.linkText("Schedule a Demo"));
		demo.click();
		driver.navigate().back();
		
		WebElement about = driver.findElement(By.linkText("About Us"));
		about.click();
		driver.navigate().back();
		
		WebElement contact = driver.findElement(By.linkText("Contact Us"));
		contact.click();
		driver.navigate().back();
		
		WebElement privacy = driver.findElement(By.linkText("Privacy Policy"));
		privacy.click();
		driver.navigate().back();
		
		WebElement terms = driver.findElement(By.linkText("Terms of Use"));
		terms.click();
		driver.navigate().back();
		
	}

}
