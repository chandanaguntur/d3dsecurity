//step definition file
package d3dCom.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import d3dCom.Basepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3dCom.Pages.FreeQuote_Page;
import d3dCom.Pages.Register_Page;
import d3dCom.Pages.signin_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DThreeD_SD extends Basepage {
    // WebDriver driver;( until before we created base page we used to write this command globally with in a class;)

    public signin_page Spage = PageFactory.initElements(Basepage.driver, signin_page.class);
    public Register_Page Reg_Page = PageFactory.initElements(Basepage.driver, Register_Page.class);
    public FreeQuote_Page FQ_Page = PageFactory.initElements(Basepage.driver, FreeQuote_Page.class);

    @Given("^I entered \"([^\"]*)\"$")
    public void iEntered(String ABC) throws Throwable {
        Open_url(ABC);
    }

    @When("^I click Login button$")
    public void iClickLoginButton() throws Throwable {
        Spage.Click_Login();
    }

    @Given("^i entered username as \"([^\"]*)\"$")
    public void iEnteredUsernameAs(String username) throws Throwable {
        Spage.Enter_username(username);
    }

    @And("^i entered password as \"([^\"]*)\"$")
    public void iEnteredPasswordAs(String password) throws Throwable {
        Spage.Enter_password(password);
    }

    @When("^I click Login button on login page$")
    public void iClickLoginButtonOnLoginPage() throws Throwable {
        Spage.submit();
    }

//    @Then("^I should see \"([^\"]*)\" header$")
//   public void iShouldSeeHeader(String expected_header) throws Throwable {
//     Spage.d3d_header(expected_header);
//    }

    @Then("^I should see My Account button on the top right hand side$")
    public void iShouldSeeMyAccountButtonOnTheTopRightHandSide() throws Throwable {
        Spage.My_account();
        // gettxt we use, to "get" actual result so always u should have gettxt in variable.
    }

    @And("^I should see Logout button on the top right corner of page$")
    public void iShouldSeeLogoutButtonOnTheTopRightCornerOfPage() throws Throwable {
        Spage.Logout();
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String expected_error) throws Throwable {
        String actual_error = driver.findElement(By.cssSelector(".cleanlogin-notification.error>p")).getText();
        assertEquals(expected_error, actual_error);
    }

    @When("^I click register button$")
    public void iClickRegisterButton() throws Throwable {
        Reg_Page.Click_Register();
    }

    @Given("^i entered username as \"([^\"]*)\" in register page$")
    public void iEnteredUsernameAsInRegisterPage(String name) throws Throwable {
        Reg_Page.Enter_User(name);
    }

    @And("^i entered password as \"([^\"]*)\" in register page$")
    public void iEnteredPasswordAsInRegisterPage(String password) throws Throwable {
        Reg_Page.Enter_Password(password);
    }

    @And("^I entered confirm password as \"([^\"]*)\"$")
    public void iEnteredConfirmPasswordAs(String confirm) throws Throwable {
        Reg_Page.Conf_Password(confirm);
    }

    @When("^I click register button on register page$")
    public void iClickRegisterButtonOnRegisterPage() throws Throwable {
        Reg_Page.Click_submit();
    }

    @Then("^I should see url \"([^\"]*)\" on register page$")
    public void iShouldSeeUrlOnRegisterPage(String reg_url) throws Throwable {
        Reg_Page.MyAcc_url();
    }

    @When("^I click Online Demo Button on home page$")
    public void iClickOnlineDemoButtonOnHomePage() throws Throwable {
        FQ_Page.Click_Onlinedemo();
    }

//    @Then("^I should see header \"([^\"]*)\" on the left hand side$")
//    public void iShouldSeeHeaderOnTheLeftHandSide() throws Throwable {
//        boolean Actual_Quote = driver.findElement(By.xpath(".//*[@id='wpc_5a0e28a1962d6']/div/div/div[1]/div/div[2]/h2")).isDisplayed();
//       assertTrue(Actual_Quote);
//    }

    @Given("^I enter \"([^\"]*)\" in security alarm page$")
    public void iEnterInSecurityAlarmPage(String First_Name) throws Throwable {
        FQ_Page.Enter_Name(First_Name);
    }

    @And("^I enter last name as \"([^\"]*)\"$")
    public void iEnter(String Last_name) throws Throwable {
        FQ_Page.LastName(Last_name);
    }

    @And("^I enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String Email_id) throws Throwable {
        FQ_Page.Email(Email_id);
    }

    @And("^I enter phone number as \"([^\"]*)\"$")
    public void iEnterPhoneNumberAs(String phone_number) throws Throwable {
        FQ_Page.Phone(phone_number);
    }

    @And("^I enter subject \"([^\"]*)\"$")
    public void iEnterSubject(String subject) throws Throwable {
        FQ_Page.Enter_sub(subject);
            }

    @And("^I enter message \"([^\"]*)\"$")
    public void iEnterMessage(String Message) throws Throwable {
       FQ_Page.EnterMessage(Message);
    }

    @When("^I click send message button$")
    public void iClickSendMessageButton() throws Throwable {
        FQ_Page.Click_Send();
        Thread.sleep(15000);
    }


    @Then("^I should see error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String Expected_Error) throws Throwable {
        String Actual_error = driver.findElement(By.cssSelector(".wpcf7-response-output.wpcf7-display-none.wpcf7-validation-errors")).getText();
        assertEquals(Expected_Error, Actual_error);
    }

    @Then("^I should see url \"([^\"]*)\"$")
   public void iShouldSeeUrl(String url) throws Throwable {
      //  FQ_Page.current_url(url);
     //  123 assertEquals(Expected_Error, Actual_error);
    }

    @Given("^I entered details:$")
    public void iEnteredDetails(DataTable details) throws Throwable {
       String E_mail =details.raw().get(1).get(0);
        String newpassword =details.raw().get(1).get(1);
       String confirmpassword=details.raw().get(1).get(2);
        System.out.println(E_mail);
        System.out.println(newpassword);
        System.out.println(confirmpassword);
    }
    //raw delete the pipes of datatable
}

