package seleniumtest;

import acuity.pages.HomePage;
import com.acuity.framework.base.DriverContext;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class SocialMediaLinkTest extends TestInitialize {

    @Test
    public void SocialMediaLink() throws InterruptedException {

        HomePage homepage = new HomePage();

        // Scroll and Go to the end the page
        JavascriptExecutor jse = (JavascriptExecutor) DriverContext.Driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        try {
            // Validate Youtube is enabled
            assert (homepage.linkYoutube.isEnabled());
        }
        catch (Exception e){
            System.out.println("Youtube link  Validation:"+e);
        }
        try {

            // Validate Twitter is enabled
            assert (homepage.linkTwitter.isEnabled());
        }
        catch (Exception e){
            System.out.println("Twitter link  Validation:"+e);
        }
        try {

            // Validate Youtube is enabled
            assert (homepage.linklinkedin.isEnabled());
        }
        catch (Exception e){
            System.out.println("LinkedIn link  Validation:"+e);
        }
       try {
           // Validate Youtube is enabled
           assert (homepage.linkFacebook.isEnabled());
       }
       catch (Exception e){
           System.out.println("Facebook link  Validation:"+e);
       }
       try {

           // Validate Youtube is enabled
           assert (homepage.linkInstagram.isEnabled());

           // Clicking a social media link
           homepage.linkInstagram.click();
       }
       catch (Exception e){
           System.out.println("Instagram link  Validation:"+e);
       }

    }

}