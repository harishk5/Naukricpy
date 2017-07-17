package testScripts;

import naukri.ProfileUpdate;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {

	@Test
	public void f() {

		ProfileUpdate pu = new ProfileUpdate();
		pu.login("haristarmech@gmail.com", "Harish-5389");
		pu.ProfileUpdateAct();
		pu.logout();
		pu.login("thenusakthi30@gmail.com", "3009honey");
		pu.ProfileUpdateAct();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Harish's Seagate Backup\\Backup\\Drive E\\Drive F\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");

	}

//	@AfterTest
//	public void afterTest() {
//		ProfileUpdate pu = new ProfileUpdate();
//		pu.logout();
//
//	}

}
