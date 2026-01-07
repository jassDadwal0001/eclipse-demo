package steps;

import pages.LoginPage;

// Cucumber annotations are commented out so this file compiles without cucumber on the classpath.
// When Cucumber is added to the project, uncomment the imports and the annotations.
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.When;
// import io.cucumber.java.en.Then;

public class LoginFeatureSteps {

    private LoginPage loginPage = new LoginPage();

    // @Given("the login page is open")
    public void the_login_page_is_open() {
        loginPage.performLogin();
    }

    // @When("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    // @Then("I should be logged in")
    public void i_should_be_logged_in() {
        // Placeholder: LoginPage currently prints actions instead of returning state.
        // In a future implementation, add an isLoggedIn() method to LoginPage and assert it here.
        System.out.println("[STEP] Verify user is logged in (placeholder)");
    }

    // @Then("I should see an authentication error")
    public void i_should_see_an_authentication_error() {
        // Placeholder: Replace with real assertion once LoginPage exposes error state.
        System.out.println("[STEP] Verify authentication error is shown (placeholder)");
    }
}
