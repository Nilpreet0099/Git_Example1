package GoIbiBo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String appurl = "https://www.goibibo.com/";
		driver.get(appurl);
		driver.manage().window().maximize();

	}

}
