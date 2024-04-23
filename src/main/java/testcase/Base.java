package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import util.common;

public class Base {

   static WebDriver driver;
    util.common common;

    String browser = "chrome";
    String url = "https://www.facebook.com";

@BeforeTest
   public void beforeTest()
    {
       common = new common();
       common.setUpBrowser(browser, url );
       driver = common.getBrowser();

    }

    @AfterTest
    public void afterTest()
    {
      common.browserClose();
    }


}
