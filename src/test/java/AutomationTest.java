

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {
	
	public WebDriver driver;
	
	@Before
	public void connect() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@After
	public void disconnect() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
	

}
