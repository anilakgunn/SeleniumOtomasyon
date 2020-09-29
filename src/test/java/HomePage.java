

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class HomePage extends AutomationFuncs {

	public HomePage(WebDriver driver) {
		
		super(driver);
		driver.manage().window().maximize();
		driver.get("https://www.trendyol.com/");
		
	}
	
	public void checkHomePage() throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(2);
		clickCssSelector("body > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a"); // For closing the fancybox ad
		TimeUnit.SECONDS.sleep(1);
		writeElement("#headerMain > div > div.header-top > ul > li:nth-child(1) > a");
		System.out.println("Anasayfa başarı ile yüklendi.");
		
	}
	
	
	
	
	
	

}
