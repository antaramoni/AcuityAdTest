package acuityad.pages;

import com.acuity.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    public HomePage() {
    }

    // Contact Us button at the top right corner
    @FindBy(how = How.LINK_TEXT, using = "Contact Us")
    public WebElement btnContactUs;

    // Scedule a demo button at the home page
    @FindBy(how = How.LINK_TEXT, using = "Schedule a demo")
    public WebElement btnScheduleADemo;

    // Solutions link at the home page header
    @FindBy(how = How.LINK_TEXT, using = "Solutions")
    public WebElement linkSolutions;

    // Insights link at the home page header
    @FindBy(how = How.LINK_TEXT, using = "Insights")
    public WebElement linkInsights;

    // News link at the home page header
    @FindBy(how = How.LINK_TEXT, using = "News")
    public WebElement linkNews;

    // Company link at the home page header
    @FindBy(how = How.LINK_TEXT, using = "Company")
    public WebElement linkCompany;


    /*--------Foorter section -------------- */

    // Footer: Company Privacy Policy link
    @FindBy(how = How.LINK_TEXT, using = "Company Privacy Policy")
    public WebElement linkComPolicy;


    // Foorter: Terms & Conditions link
    @FindBy(how = How.LINK_TEXT, using = "Terms & Conditions")
    public WebElement linkTermsCondition;


    // Footer: Cookie Policy link
    @FindBy(how = How.LINK_TEXT, using = "Cookie Policy")
    public WebElement linkCookiePolicy;

    // Footer: Opt-out link
    @FindBy(how = How.LINK_TEXT, using = "Opt-out")
    public WebElement linkOptOut;

    // Technology Privacy Policy link
    @FindBy(how = How.LINK_TEXT, using = "Privacy Policy")
    public WebElement linkPrivacyPolicy;


    //Footer: AODA link
    @FindBy(how = How.LINK_TEXT, using = "AODA")
    public WebElement linkAODA;


    // Click on Contact Us button
    public void ContactUsButton() {
        btnContactUs.click();
    }
}
