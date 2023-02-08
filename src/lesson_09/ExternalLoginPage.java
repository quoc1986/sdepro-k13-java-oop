package lesson_09;

public class ExternalLoginPage extends LoginPage{
    @Override
    protected String usernameLocator() {
        return "ExternalPage|usernameLocator";
    }

    @Override
    protected String passwordLocator() {
        return "ExternalPage|passwordLocator";
    }

    @Override
    protected String loginBtnLocator() {
        return "ExternalPage|loginBtnLocator";
    }
}
