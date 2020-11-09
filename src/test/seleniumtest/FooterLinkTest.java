package seleniumtest;

import acuity.pages.HomePage;
import com.acuity.framework.base.DriverContext;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class FooterLinkTest extends TestInitialize {

    @Test
    public void FooterLink() throws InterruptedException {

        HomePage homepage = new HomePage();

        // Scroll and Go to the end the page
        JavascriptExecutor jse = (JavascriptExecutor) DriverContext.Driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");


        // Validate Footer has Corporate Privacy Policy
        homepage.linkComPolicy.getText().equals("Corporate Privacy Policy");
        System.out.println(homepage.linkComPolicy.getText());

        // Validate Footer has Terms & Condition Policy
        homepage.linkTermsCondition.getText().equals("Terms & Condition");
        System.out.println(homepage.linkTermsCondition.getText());

        // Validate footer has Cookie Policy
        homepage.linkCookiePolicy.getText().equals("Cookie Policy");
        System.out.println(homepage.linkCookiePolicy.getText());

        // Validate Footer has opt-out link
        homepage.linkOptOut.getText().equals("Opt-out");
        System.out.println(homepage.linkOptOut.getText());

        // Validate Footer has Technology Privacy Policy link
        homepage.linkTechPrivacyPolicy.getText().equals("Technology Privacy Policy");
        System.out.println(homepage.linkTechPrivacyPolicy.getText());

        // Validate Footer has AODA link
        homepage.linkAODA.getText().equals("AODA");
        System.out.println(homepage.linkAODA.getText());

        Thread.sleep(2000);

    }

}
