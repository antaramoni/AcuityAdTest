package acuity.pages;

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
    @FindBy(how = How.LINK_TEXT, using = "Corporate Privacy Policy")
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
    @FindBy(how = How.LINK_TEXT, using = "Technology Privacy Policy")
    public WebElement linkTechPrivacyPolicy;

    //Footer: AODA link
    @FindBy(how = How.LINK_TEXT, using = "AODA")
    public WebElement linkAODA;

    //Social Media Footer: Youtube link
    @FindBy(how = How.CSS, using = "a[href*='youtube.com']")
    public WebElement linkYoutube;

    //Social Media Footer: Twitter link
    @FindBy(how = How.CSS, using = "a[href*='twitter.com/acuityads']")
    public WebElement linkTwitter;


    //Social Media Footer: linkedIn link
    @FindBy(how = How.CSS, using = "a[href*='linkedin.com']")
    public WebElement linklinkedin;

    //Social Media Footer: Facebook link
    @FindBy(how = How.CSS, using = "a[href*='facebook.com/acuityads/']")
    public WebElement linkFacebook;

    //Social Media Footer: Instagram link
    @FindBy(how = How.CSS, using = "a[href*='instagram.com/acuityads.inc/']")
    public WebElement linkInstagram;



    // Click on Contact Us button
    public void ContactUsButton() {
        btnContactUs.click();
    }
}
