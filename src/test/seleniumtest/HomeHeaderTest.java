package seleniumtest;

import acuity.pages.HomePage;
import org.junit.Test;

public class HomeHeaderTest extends TestInitialize {

    @Test
    public void HomeHeader() throws InterruptedException {

        HomePage homepage = new HomePage();

        // Validate header has Solutions link
        homepage.linkSolutions.getText().equals("Solutions");
        System.out.println(homepage.linkSolutions.getText());

        // Validate header has Insights link
        homepage.linkInsights.getText().equals("Insights");
        System.out.println(homepage.linkInsights.getText());

        // Validate header has News link
        homepage.linkNews.getText().equals("News");
        System.out.println(homepage.linkNews.getText());

        // Validate header has Company link
        homepage.linkCompany.getText().equals("Company");
        System.out.println(homepage.linkCompany.getText());


    }

}