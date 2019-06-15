package ExpediaMvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.plugin2.util.BrowserType;

public class ExpediaMvnRun {

    @BeforeMethod
    void sleep(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test
    void runTest(){

        WebDriver driver = BrowserFactory.openBrowser("chrome","https://www.expedia.com/");
        ExpediaMvnTest run = PageFactory.initElements(driver,ExpediaMvnTest.class);
        run.inspect("  Dull","Add");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
