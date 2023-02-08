package lesson_09;

public class InternalLoginPage extends LoginPage{
    @Override
    protected String usernameLocator() {
        return "InternalPage|usernameLocator";
    }

    @Override
    protected String passwordLocator() {
        return "InternalPage|passwordLocator";
    }

    @Override
    protected String loginBtnLocator() {
        return "InternalPage|loginBtnLocator";
    }
}
