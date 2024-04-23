package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class common {


   WebDriver driver ;

    public void setUpBrowser(String browser, String url) {
        String currDir = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currDir);
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("Web driver ", currDir + "\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("Web driver ", currDir + "\\Drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("not availbale hence quitting it");
            System.exit(0);
        }

        if (url != "") {
            driver.get(url);
        } else {
            driver.get("blank url");
        }
    }

    public  void browserClose()
    {
        driver.close();
    }

    public  WebDriver getBrowser()
    {
        return driver;
    }
}



