package seleniumtest;

import acuity.pages.ContactUsPage;
import acuity.pages.HomePage;
import com.acuity.framework.base.DriverContext;
import com.acuity.framework.base.FrameworkInitialize;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class ContactUsTest extends FrameworkInitialize {


    @Before
    public void Initialize()

    {

        String path = System.getProperty("user.dir");
         //Open the browser
                System.setProperty("webdriver.chrome.driver", path + "//chromedriver");
                // System.setProperty("webdriver.chrome.driver",path+"\\chromedriver.exe"); // For windows users

                DriverContext.Driver = new ChromeDriver();
                DriverContext.Driver.navigate().to("https://www.acuityads.com/");


         /*
        InitializeBrowser(BrowserType.Chrome);
        DriverContext.Browser.GoToUrl("https://www.acuityads.com/");
         */
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
    public void TearDownTest()
    {

        //Closing the browser
       // DriverContext.Driver.quit();


    }
}
