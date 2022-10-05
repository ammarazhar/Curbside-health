package test;

import org.openqa.selenium.Keys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class curbsideHealth_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://curbside-front-end.herokuapp.com/login");
		
		WebElement emailBox = driver.findElement(By.name("email"));
		emailBox.sendKeys("ammartest@", Keys.ENTER);
		emailBox.clear();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement emailBox2 = driver.findElement(By.name("email"));
		emailBox2.sendKeys("ammartest@a.com", Keys.ENTER);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin", Keys.ENTER);
		pass.clear();
		
		WebElement pass2 = driver.findElement(By.name("password"));
		pass2.sendKeys("Admin@123", Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement crtAcc = driver.findElement(By.linkText("Create Account"));
		crtAcc.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement termsLink = driver.findElement(By.linkText("Terms of Use"));
		termsLink.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement privacyLink = driver.findElement(By.linkText("Privacy"));
		privacyLink.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
	}

}
