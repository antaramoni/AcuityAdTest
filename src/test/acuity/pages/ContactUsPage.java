package acuity.pages;

import com.acuity.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUsPage extends BasePage {

    public ContactUsPage() {

    }

    @FindBy(how = How.ID, using = "153781_19559pi_153781_19559")
    public WebElement txtFirstName;

    @FindBy(how = How.ID, using = "153781_19561pi_153781_19561")
    public WebElement txtLastName;

    @FindBy(how = How.ID, using = "153781_19563pi_153781_19563")
    public WebElement txtEmail;

    @FindBy(how = How.ID, using = "153781_19565pi_153781_19565")
    public WebElement txtCompany;

    @FindBy(how = How.ID, using = "153781_19567pi_153781_19567")
    public WebElement txtRole;

    @FindBy(how = How.XPATH, using = "//*[@id=\"pardot-form\"]/div[6]/div[1]/div")
    public WebElement ddlRegion;

    // Canada option Selection
    @FindBy(how = How.XPATH, using = "//*[@id=\"pardot-form\"]/div[6]/div[1]/ul/li[2]")
    public WebElement ddlRegionCa;


    @FindBy(how = How.XPATH, using = "//*[@id=\"pardot-form\"]/div[7]/div[1]/div")
    public WebElement ddlTypeSolution;

    // Not Sure option selection
    @FindBy(how = How.XPATH, using = "//*[@id=\"pardot-form\"]/div[7]/div[1]/ul/li[4]")
    public WebElement ddlTypeSolutionNotSure;


    @FindBy(how = How.ID, using = "153781_19577pi_153781_19577")
    public WebElement txtWeHelpYou;

    @FindBy(how = How.XPATH, using = "//*[@id=\"pardot-form\"]/div[10]/input")
    public WebElement btnSubmit;

    @FindBy(how = How.ID, using = "content")
    public WebElement ThankYou;


    public void ContactUs(String firstName, String lastName, String email, String company, String role, String help) throws InterruptedException {
        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        txtEmail.sendKeys(email);
        txtCompany.sendKeys(company);
        txtRole.sendKeys(role);

        ddlRegion.click();
        ddlRegionCa.click();

        ddlTypeSolution.click();
        ddlTypeSolutionNotSure.click();

        Thread.sleep(2000);

        txtWeHelpYou.sendKeys(help);


        btnSubmit.submit();
        Thread.sleep(2000);

    }

}
