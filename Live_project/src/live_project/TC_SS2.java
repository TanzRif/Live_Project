package guru99_live_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SS2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanzi\\Desktop\\java standlon\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("dkjfdskfb");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("UdYvUhU");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

		// Switching to Alert
		Alert alert = driver.switchTo().alert();

		// Capturing alert message.
		String AlertText = driver.switchTo().alert().getText();
		// Displaying alert message
		System.out.println(AlertText);
		if (AlertText.contentEquals("User or Password is not valid")) {
			System.out.println("Test Pass");
		}

		else {
			System.out.println("Test Fial");
		}
		Thread.sleep(5000);

		// Accepting alert
		alert.accept();
		driver.close();
	}

}
