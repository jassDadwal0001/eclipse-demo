package pages;

public class LoginHtmlPage {

    // locators (mapped from login.html)

    private String usernameField = "id=username";
    private String passwordField = "id=password";
    private String loginButton = "id=loginBtn";

    public void open() {
        System.out.println("Open login.html");
    }

    public void enterUsername(String user) {
        System.out.println("Enter '" + user + "' into " + usernameField);
    }

    public void enterPassword(String pass) {
        System.out.println("Enter '******' into " + passwordField);
    }

    public void clickLogin() {
        System.out.println("Click " + loginButton);
    }

    public void login(String user, String pass) {
        open();
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
        System.out.println("Logged in as " + user + " using login.html");
    }
}