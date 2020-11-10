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

        try {
            // Validate Footer has Corporate Privacy Policy
            assert (homepage.linkComPolicy.getText().equals("Corporate Privacy Policy"));
            System.out.println(homepage.linkComPolicy.getText());
            Thread.sleep(2000);
        }
            catch (Exception e){
                System.out.println(" Corporate Privacy Policy Validation:"+e);
            }
        try {
            // Validate Footer has Terms & Condition Policy
            assert (homepage.linkTermsCondition.getText().contains("Terms"));
            System.out.println(homepage.linkTermsCondition.getText());
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println("Terms & Condition Policy Validation:"+e);
        }

        try {
            // Validate footer has Cookie Policy
            assert (homepage.linkCookiePolicy.getText().equals("Cookie Policy"));
            System.out.println(homepage.linkCookiePolicy.getText());
        }
        catch (Exception e){
            System.out.println("Cookie Policy Validation:"+e);
        }

        try {
            // Validate Footer has opt-out link
            assert (homepage.linkOptOut.getText().equals("Opt-out"));
            System.out.println(homepage.linkOptOut.getText());
        }
        catch (Exception e){
            System.out.println("opt-out Validation:"+e);
        }

        try {
            // Validate Footer has Technology Privacy Policy link
            assert (homepage.linkTechPrivacyPolicy.getText().equals("Technology Privacy Policy"));
            System.out.println(homepage.linkTechPrivacyPolicy.getText());
        }
        catch (Exception e){
            System.out.println("Technology Privacy Policy Validation:"+e);
        }

        try{
            // Validate Footer has AODA link
            assert (homepage.linkAODA.getText().equals("AODA"));
            System.out.println(homepage.linkAODA.getText());

            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println("AODA  Validation:"+e);
        }
    }

}
