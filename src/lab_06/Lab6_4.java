package lab_06;

public class Lab6_4 {
    public static void main(String[] args) {
        String myString="https://google.com";
        String httpMethod=myString.split(":")[0];
        if(httpMethod.equals("http"))
            System.out.println("http method is http");
        else
            System.out.println("http method is https");
        String domain=myString.split("\\.")[1];
        if(domain.equals("com"))
            System.out.println("domain is .com");
        else
            System.out.println("http method is .net");
    }
}
