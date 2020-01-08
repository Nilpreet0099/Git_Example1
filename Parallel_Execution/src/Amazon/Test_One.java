package Amazon;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_One {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String appurl = "https://www.amazon.in/";
		driver.get(appurl);
		driver.manage().window().maximize();
		System.out.println("Done!");
  }
}
