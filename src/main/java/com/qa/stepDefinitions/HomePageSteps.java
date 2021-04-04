package com.qa.stepDefinitions;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePageSteps extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    @Given("user opens browser")
    public void user_opens_browser()  {
        TestBase.initialization();

    }

    @Then("user clicks on login button first time")
    public void user_clicks_on_login_button_first_time() {
        loginPage=new LoginPage();
        loginPage.loginButtonClick();
//         JavascriptExecutor js = (JavascriptExecutor)driver;
//         js.executeScript("arguments[0].click();", loginBtn);

    }

    @Then("user in on Login Page")
    public void user_in_on_Login_Page() {
        // Write code here that turns the phrase above into concrete actions
        String title=loginPage.validateLoginPageTitle();
        Assert.assertEquals("Cogmento CRM", title);

    }
    @Then("user logs into app")
    public void user_enters_the_username_and_password()  {
        // Write code here that turns the phrase above into concrete actions
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

    }

    @Then("validate home page title")
    public void validate_home_page_title()  {
        // Write code here that turns the phrase above into concrete actions
        String homeTitle=homePage.verifyHomePageTitle();
        Assert.assertEquals("Cogmento CRM", homeTitle);

    }

    @Then("validate logged in username")
    public void validate_logged_in_username()  {
        // Write code here that turns the phrase above into concrete actions
        String userDisplay=homePage.verifyCorrectUserName();
        Assert.assertEquals("Lokesh Madivala", userDisplay);
        driver.close();

    }
}
