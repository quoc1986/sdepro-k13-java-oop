package lesson11_enum;

public class TestDriverFactory {
    public static void main(String[] args) {
        boolean isRunningOnIOS = System.getenv("platform").equals("ios");
        if (isRunningOnIOS) {
            DriverFactory.initPlatform(Platform.IOS);
        } else {
            DriverFactory.initPlatform(Platform.ANDROID);
        }
    }
}
