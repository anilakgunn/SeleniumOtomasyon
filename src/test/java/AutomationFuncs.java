
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationFuncs {
	
	public WebDriver driver;
	
	public AutomationFuncs(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void clickXPath(String xpath) {
		
		WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		element.click();
		
	}
	
	
	public void clickCssSelector(String selectorPath) {
		
		WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selectorPath)));
		element.click();
		
	}
	
	public void writeElement(String selectorPath) {
		
		WebElement element = new WebDriverWait (driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selectorPath)));
		String element_text = element.getText();
		System.out.println(element_text);
		
	}
	
	public void setElement(String selectorPath,String text) {
		driver.findElement(By.cssSelector(selectorPath)).sendKeys(text);
		
	}
	
	public void scrollClickElement(String xpath) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
	}
	
	public String getElementText(String selectorPath) {
		
		WebElement element = new WebDriverWait (driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selectorPath)));
		String element_text = element.getText();
		return element_text;
	}
	
	public String getElementTextValue(String selectorPath) {
		WebElement element = new WebDriverWait (driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selectorPath)));
		String element_text = element.getAttribute("value");
		return element_text;
	}
	
	
	
}
