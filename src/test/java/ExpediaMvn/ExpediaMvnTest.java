package ExpediaMvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExpediaMvnTest {
    WebDriver driver;
    @FindBy (how = How.XPATH, using = "//*[@id=\"package-origin-hp-package\"]")
    WebElement originInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"typeaheadDataPlain\"]/div/li[2]")
    WebElement originPlace;

    @FindBy (how = How.XPATH, using = "//*[@id=\"package-destination-hp-package\"]")
    WebElement destinationInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"typeaheadDataPlain\"]/div/li[2]")
    WebElement destinationPlace;

    @FindBy(how = How.XPATH, using = "//*[@id=\"package-departing-hp-package\"]")
    WebElement departureSelect;

    @FindBy(how = How.XPATH, using = "//*[@id=\"package-departing-wrapper-hp-package\"]/div/div/div[2]/table/tbody/tr[4]/td[3]/button")
    WebElement departureDate;


    @FindBy(how = How.XPATH, using = "//*[@id=\"package-returning-hp-package\"]")
    WebElement returningSelect;

    @FindBy(how = How.XPATH, using = "//*[@id=\"package-returning-wrapper-hp-package\"]/div/div/div[2]/table/tbody/tr[5]/td[6]/button")
    WebElement returningDate;

    @FindBy(how = How.XPATH, using = "//*[@id=\"traveler-selector-hp-package\"]/div/ul/li/button")
    WebElement travlers;

    @FindBy(how = How.XPATH, using = "//*[@id=\"package-advanced-preferred-class-hp-package\"]")
    WebElement prefferedClass;

    @FindBy(how = How.LINK_TEXT, using = "First class")
    WebElement prefferedClassList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"search-button-hp-package\"]")
    WebElement searchButton;





    public ExpediaMvnTest(WebDriver driver){

            this.driver = driver;

        }
    public void inspect(String or, String ds){
        originInput.sendKeys(or);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        originPlace.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        destinationInput.sendKeys(ds);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        destinationPlace.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        departureSelect.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        departureDate.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        returningSelect.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        returningDate.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        prefferedClass.click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        prefferedClassList.click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        searchButton.click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }





    }

}
