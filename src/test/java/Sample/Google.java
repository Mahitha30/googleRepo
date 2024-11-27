package Sample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	@Test
	public void launchGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
