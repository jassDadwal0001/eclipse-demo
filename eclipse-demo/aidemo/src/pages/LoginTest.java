package pages;

public class LoginTest {

    public void testLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.performLogin();
        loginPage.login("user", "pass");
    }
}