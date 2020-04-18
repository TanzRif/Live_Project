package guru99_live_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {
	WebDriver driver;

	@BeforeMethod

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanzi\\Desktop\\java standlon\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get("http://demo.guru99.com/v4/");

	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr208713");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("UdYvUhU");
		Thread.sleep(2000);
		;
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(5000);

		if (driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr208713')]")).isDisplayed()) {
			System.out.println("Manager Id is shown");
		}

	}

	@Test(priority = 2)
	public void getUrl() {
		System.out.println("url: " + driver.getCurrentUrl());

	}

	@AfterMethod
	public void closebrower() {
		driver.close();
	}

}
