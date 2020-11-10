package seleniumtest;

import acuity.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.testng.asserts.IAssert;

public class HomeHeaderTest extends TestInitialize {

    @Test
    public void HomeHeader() throws InterruptedException {

        HomePage homepage = new HomePage();
      try {
          // Validate header has Solutions link
          assert (homepage.linkSolutions.getText().equals("Solutions"));
          System.out.println(homepage.linkSolutions.getText());
      }
      catch (Exception e){
          System.out.println("Solutions link  Validation:"+e);
      }

      try {
          // Validate header has Insights link
          assert (homepage.linkInsights.getText().equals("Insights"));
          System.out.println(homepage.linkInsights.getText());
      }
      catch (Exception e){
          System.out.println("Insights link Validation:"+e);
      }

      try {
          // Validate header has News link
          assert (homepage.linkNews.getText().equals("News"));
          System.out.println(homepage.linkNews.getText());
      }
      catch (Exception e){
          System.out.println("News link Validation:"+e);
      }

      try {
          // Validate header has Company link
          assert (homepage.linkCompany.getText().equals("Company"));
          System.out.println(homepage.linkCompany.getText());
      }
      catch (Exception e){
          System.out.println("Company links  Validation:"+e);
      }

    }

}