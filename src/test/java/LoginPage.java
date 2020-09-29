
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class LoginPage extends AutomationFuncs {
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		driver.manage().window().maximize();
		driver.get("https://www.trendyol.com/");
		
	}
	
	public void login() throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(2);
		clickCssSelector("body > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a"); // For closing the fancybox ad
		TimeUnit.SECONDS.sleep(2);
		clickCssSelector("#accountBtn > div.icon-container > i");
		TimeUnit.SECONDS.sleep(2);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an email : ");
		String email = sc.nextLine();
		setElement("#email",email);
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Enter a password : ");
		String password = sc.nextLine();
		setElement("#password",password);
		TimeUnit.SECONDS.sleep(2);
		clickCssSelector("#loginSubmit");
		TimeUnit.SECONDS.sleep(4);
		writeElement("#logged-in-container");
		System.out.println("Kullanıcı giriş sayfası başarı ile yüklendi.");
		
		
	}

}
