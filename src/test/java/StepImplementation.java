import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.thoughtworks.gauge.Step;

import driver.Driver;

public class StepImplementation {

	private static final Object findElement2 = null;

	@Step("Navigate to the site")
	public void navigateToTheSite(){
		
        Driver.webDriver.get("https://careers.xenonstack.com/onboarding/login");
		
	}

	/**
	 * @throws InterruptedException
	 */
	@Step("Enter username and password")
	public void enterUsernameAndPassword() throws InterruptedException{
		
		Driver.webDriver.findElement(By.id("email")).sendKeys("2018cscloudgopal6699@poornima.edu.in");
		Thread.sleep(2000);
		Driver.webDriver.findElement(By.id("password")).sendKeys("J5prime@khushi");
		Thread.sleep(2000);
		Driver.webDriver.findElement(By.id("send-invite")).submit();
		Thread.sleep(2000);
		
	}
}

