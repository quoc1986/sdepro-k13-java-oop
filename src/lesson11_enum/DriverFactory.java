package lesson11_enum;

public class DriverFactory {
    public static void initPlatform(Platform platform){
        switch(platform){
            case ANDROID:
                System.out.println("Init Android driver");
                break;
            case IOS:
                System.out.println("Init IOS driver");
                break;

            default:
                throw new IllegalArgumentException("Please provide correct platform");
        }
    }
}
