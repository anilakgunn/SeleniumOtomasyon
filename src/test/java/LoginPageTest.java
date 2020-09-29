
public class LoginPageTest extends AutomationTest {
	
	@org.junit.Test
    public void Test2() throws InterruptedException {
		
        new LoginPage(driver).login();
        
	}

}
