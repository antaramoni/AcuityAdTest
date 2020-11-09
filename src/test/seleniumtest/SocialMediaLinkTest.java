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

        // Validate Youtube is enabled
        homepage.linkYoutube.isEnabled();

        Thread.sleep(2000);

        // Validate Youtube is enabled
        homepage.linkTwitter.isEnabled();

        Thread.sleep(2000);

        // Validate Youtube is enabled
        homepage.linklinkedin.isEnabled();

        Thread.sleep(2000);

        // Validate Youtube is enabled
        homepage.linkFacebook.isEnabled();

        Thread.sleep(2000);

        // Validate Youtube is enabled
        homepage.linkInstagram.isEnabled();



        Thread.sleep(2000);



    }

}