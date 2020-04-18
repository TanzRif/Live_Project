package guru99_live_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SS1 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanzi\\Desktop\\java standlon\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr208713");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("UdYvUhU");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

		System.out.println("currentUrk: " + driver.getCurrentUrl());
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//a[contains(text(),'Manager')]")).isDisplayed()) {
			System.out.println("Test Pass");
		} else {
			System.out.println("test fail");

		}
		driver.close();
	}
}
