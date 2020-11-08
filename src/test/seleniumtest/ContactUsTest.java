package seleniumtest;

import acuityad.pages.ContactUsPage;
import acuityad.pages.HomePage;
import com.acuity.framework.base.Base;
import com.acuity.framework.base.DriverContext;
import com.acuity.framework.config.ConfigReader;
import com.acuity.framework.config.Settings;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


public class ContactUsTest extends Base {



    @Before
    public void Initialize() throws IOException {


        ConfigReader.PopulateSettings();

        String path = System.getProperty("user.dir");

        //Open the browser
        System.setProperty("webdriver.chrome.driver", path + "//chromedriver");
        // System.setProperty("webdriver.chrome.driver",path+"\\chromedriver.exe"); // For windows users

        DriverContext.Driver = new ChromeDriver();

        String url = Settings.TestUrl;
        DriverContext.Driver.navigate().to(url);

     

    }

    @Test
    public void ContactUs() throws InterruptedException {

        // Clicking on Contact Us button from Home Page
        HomePage homepage = new HomePage();
        homepage.ContactUsButton();

        Thread.sleep(2000);

        // Submit the Contact us form with required value
        ContactUsPage contactpage = new ContactUsPage();
        contactpage.ContactUs("test", "test2", "c@gmail.com", "c", "c", "don't reply");


    }

    @After
    public void TearDownTest() {

        //Closing the browser
        // DriverContext.Driver.quit();


    }
}
