package seleniumtest;

import acuity.pages.ContactUsPage;
import acuity.pages.HomePage;
import org.junit.After;
import org.junit.Test;



public class ContactUsTest extends TestInitialize {




    @Test
    public void ContactUs() throws InterruptedException {

        // Clicking on Contact Us button from Home Page
        HomePage homepage = new HomePage();
        homepage.ContactUsButton();

        Thread.sleep(2000);

        // Submit the Contact us form with all value
        ContactUsPage contactpage = new ContactUsPage();
        contactpage.ContactUs("firstnametest", "LastNametest", "t@gmail.com", "acuity", "role1", "don't reply");


    }

    @After
    public void TearDownTest() {

        //Closing the browser
        // DriverContext.Driver.quit();


    }
}
