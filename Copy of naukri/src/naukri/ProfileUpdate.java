package naukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfileUpdate {

	WebDriver driver = new ChromeDriver();
	

	public void login(String usrn, String pwd) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://naukri.com");
		driver.findElement(By.xpath(".//*[(@class='mTxt') and (contains(text(),'Login')) ]")).click();
		driver.findElement(By.id("eLogin")).sendKeys(usrn);
		driver.findElement(By.id("pLogin")).sendKeys(pwd);
		driver.findElement(By.xpath(".//button[(@class='blueBtn') and (@value='Login')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameDisplaySpan")));

	}

	public void ProfileUpdateAct() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(
				By.xpath(".//*[@id='compDetail']/div[4]/div[1]/button"))
				.click();
		driver.findElement(
				By.xpath(".//*[@id='rPanel']/div/div[1]/div[2]/h1/a")).click();

		driver.findElement(
				By.xpath(".//*[@id='rPanel']/div/div/form/div[5]/div/button"))
				.click();

		System.out.println(driver.findElement(By.id("confirmMessage"))
				.getText());
		

	}
	
	public void logout(){
		driver.get("https://login.naukri.com/nLogin/Logout.php");
//		
//		driver.quit();
//		driver.quit();
		
	}
}
