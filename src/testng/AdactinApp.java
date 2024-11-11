package testng;
     
import org.testng.annotations.Test;

public class AdactinApp {
@Test
public void LoginTest()
{
	System.out.println("Browser Started...");
	System.out.println("App Launched.. ");
	System.out.println("Login Successful..");
	System.out.println("Browser closed");
}
      @Test
      public void registration() {
    	  
    	  System.out.println("Browser Started..");
    	  System.out.println("App Launched...");
    	  System.out.println("Login Successfully..");
    	  System.out.println("Browser Closed..");
      }
      @Test
      public void forgotpassword() {
    	  
    	  System.out.println("Browser Started..");
    	  System.out.println("App Launched...");
    	  System.out.println(" Forgot Password Successfully..");
    	  System.out.println("Browser Closed..");
      } 
}
