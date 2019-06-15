package fbCreatAcc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BeginFbHomePage {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"u_0_p\"]")
    WebElement inoutfname;

    @FindBy(how = How.XPATH, using = "//*[@id=\"u_0_r\"]")
    WebElement inputlname;

    @FindBy(how = How.XPATH, using = "//*[@id=\"u_0_u\"]")
    WebElement inputemail;

    public BeginFbHomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void credintials (String fname, String lname, String email){

        inoutfname.clear();
        inoutfname.sendKeys(fname);
        inputlname.clear();
        inputlname.sendKeys(lname);
        inputemail.clear();
        inputemail.sendKeys(email);

    }
}
