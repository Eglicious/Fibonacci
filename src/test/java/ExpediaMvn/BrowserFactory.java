package ExpediaMvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    static WebDriver driver;
    public static WebDriver openBrowser(String browserName, String url){

        if(browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Java files\\chromedriver_win32 (1)\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("FireFox")){
            System.setProperty("webdriver.gecko.driver","C:\\Java files\\geckodriver-v0.24.0-win64\\gecko.exe");
            driver = new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.ie.driver","C:\\Java files\\IEDriverServer_x64_3.14.0.zip\\IeDriverServer.exe");
            driver = new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


        return driver;

    }

}
