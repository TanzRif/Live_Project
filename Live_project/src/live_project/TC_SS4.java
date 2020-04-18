package guru99_live_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SS4 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanzi\\Desktop\\java standlon\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("kjdgcjkdbfk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dvsdfsd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

		Alert alert = driver.switchTo().alert();

		String AlertText = driver.switchTo().alert().getText();

		System.out.println("AlerText:" + AlertText);

		if (AlertText.contentEquals("User or Password is not valid")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		alert.accept();
		driver.close();
	}

}
