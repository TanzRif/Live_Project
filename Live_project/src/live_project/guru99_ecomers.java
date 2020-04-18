package guru99_live_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99_ecomers {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanzi\\Desktop\\java standlon\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.get("http://live.guru99.com/index.php/");
		String pageTitle = driver.getTitle();
		System.out.println("pageTitle");
		if (pageTitle.contentEquals("Home Page")) {

			System.out.println("test pass");

		}

		else {
			System.out.println("test Fail");
		}

		driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
		Thread.sleep(3000);

		String pageTitle1 = driver.getTitle();

		if (pageTitle1.contentEquals("Mobile")) {
			System.out.println("test pass");
		}

		else {
			System.out.println("test fail");
		}

	}

}
