package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @When("^User opens Amazon Login Page$")
    public void user_opens_amazon_login_page() throws Throwable {
        System.out.println("opened Login Page");

    }

    @Then("^User checks for Username and Password$")
    public void user_checks_for_username_and_password() throws Throwable {
        System.out.println("Entered username and Password");

    }
    @Then("Login with Credentials and Check Homepage is displayed")
    public void login_with_credentials_and_check_homepage_is_displayed() {
        System.out.println("HomePage is Displayed");
    }

}
