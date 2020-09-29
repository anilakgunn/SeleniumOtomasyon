

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends AutomationFuncs {
	
	public ShoppingCartPage(WebDriver driver) {
		
		super(driver);
		driver.manage().window().maximize();
		driver.get("https://www.trendyol.com/");
	}
	
	public void search(String item) throws InterruptedException {
		
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
		TimeUnit.SECONDS.sleep(3);
		setElement("#auto-complete-app > div > div > input",item);
		TimeUnit.SECONDS.sleep(1);
		clickCssSelector("#auto-complete-app > div > div > i");
		TimeUnit.SECONDS.sleep(2);
		int random = new Random().nextInt(20);
		scrollClickElement("//*[@class='prdct-cntnr-wrppr']/div[@class='p-card-wrppr']["+random+"]");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Ürün sayfasındaki fiyat: "+ getElementText("#product-detail-app > div > div.pr-cn > div.pr-cn-in > div.pr-in-w > div:nth-child(1) > div.pr-in-cn > div:nth-child(3) > div > div > div.pr-bx-pr-dsc > div:nth-child(2) > span"));
		TimeUnit.SECONDS.sleep(5);
		clickCssSelector("div[class='pr-in-at']>div>button");
		TimeUnit.SECONDS.sleep(2);
		clickXPath("//*[@id=\"myBasketListItem\"]/div[1]/a/i");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Sepetteki fiyat: "+getElementText("#basketAside > div > div.col-lg-12.col-md-12.col-xs-12.shoppingReview.grid-pad-20 > dl > dd.total-price"));
		TimeUnit.SECONDS.sleep(3);
		clickXPath("//*[@id=\"partial-basket\"]/div/div[2]/div[2]/div[3]/div[1]/div/button[2]");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Sepetteki ürün sayısı: "+getElementTextValue("div[class='pb-basket-item-actions']>div>div>input"));
		TimeUnit.SECONDS.sleep(2);
		clickCssSelector("#partial-basket > div > div.pb-merchant-group > div.pb-basket-item > div.pb-basket-item-actions > button > i");
		TimeUnit.SECONDS.sleep(2);
		clickCssSelector("#ngdialog1 > div.ngdialog-content > form > div > div.footer > div > div.left > button.btn-item.btn-remove > span");
		System.out.println("Sepet durumu : " + getElementText("#basketNoProductPage > div.col-lg-10.col-md-10.col-xs-10.no-padding > div > div.col-lg-8.col-md-8.col-xs-8 > p > span"));
		
	}
	
	

}
