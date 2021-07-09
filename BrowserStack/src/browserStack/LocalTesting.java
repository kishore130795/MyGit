package browserStack;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LocalTesting {

	public static final String AUTOMATE_USERNAME = "kishorev_m348ZK";
	public static final String AUTOMATE_ACCESS_KEY = "VtVxCoeHqoqsmdnPMNYC";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "Big Sur");
		caps.setCapability("resolution", "1920x1080");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest-beta");
		caps.setCapability("os", "OS X");
		
		caps.setCapability("name", "BStack-[Java] SampleTest2"); // test name
		caps.setCapability("build", "BStack Build Number 2"); // CI/CD job or

		caps.setCapability("browserstack.debug", "true");
		// build name
		//caps.setCapability("browserstack.local", "true");
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("chennai");
		element.submit();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}