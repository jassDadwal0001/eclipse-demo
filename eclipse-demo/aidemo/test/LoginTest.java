package pages;

public class LoginTest {

    // Test data constants
    private static final String TEST_USERNAME = "user";
    private static final String TEST_PASSWORD = "pass";

    // Simple, easy-to-read test method
    public void testLogin() {
        LoginPage loginPage = new LoginPage();

        // Open the login page
        loginPage.performLogin();

        // Enter credentials and submit
        loginPage.login(TEST_USERNAME, TEST_PASSWORD);

        // In this simple example, we treat successful execution as a pass.
        System.out.println("Login flow executed for user: " + TEST_USERNAME);
    }

    // Run the test from the command line
    public static void main(String[] args) {
        try {
            new LoginTest().testLogin();
            System.out.println("[TEST PASS] LoginTest");
        } catch (Throwable t) {
            System.err.println("[TEST FAIL] LoginTest: " + t.getMessage());
            t.printStackTrace();
            System.exit(1);
        }
    }
}