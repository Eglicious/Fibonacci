package fbCreatAcc;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunFbHomePage {
    @Test()
  // @Parameters({"browser", "url", "fname", "lname", "email"})
    public void run( String fname, String lname, String email) throws Exception {

        // System.out.println();

        WebDriver driver= BrowserFactory.openbrowser("chrome","http://facebook.com");

        BeginFbHomePage obj = new BeginFbHomePage(driver);
        obj.credintials("User1","Lastname1","Email1");

        // BeginFBHomePage run = PageFactory.initElements(driver, BeginFBHomePage.class);
        // run.credintials(fname,lname,email);

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
