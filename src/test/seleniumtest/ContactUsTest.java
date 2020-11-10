package seleniumtest;

import acuity.pages.ContactUsPage;
import acuity.pages.HomePage;
import com.acuity.framework.base.DriverContext;
import org.junit.After;
import org.junit.Test;



public class ContactUsTest extends TestInitialize {




    @Test
    public void ContactUs() throws InterruptedException {

        try {
            // Clicking on Contact Us button from Home Page
            HomePage homepage = new HomePage();
            homepage.ContactUsButton();

            Thread.sleep(2000);

            // Submit the Contact us form with all filled up fields
            ContactUsPage contactpage = new ContactUsPage();
            contactpage.ContactUs("firstnametest", "LastNametest", "t@gmail.com", "acuity", "role1", "don't reply");

            Thread.sleep(2000);

            // Validating User should see Thank you note after submitting the Contact Us forms
            assert (contactpage.ThankYou.getText().contains("Thank you"));
        }
        catch (Exception e){
            System.out.println("ContactUs Validation:"+e);
        }


    }

    @After
    public void TearDownTest() {

        //Closing the browser
        DriverContext.Driver.quit();


    }
}
