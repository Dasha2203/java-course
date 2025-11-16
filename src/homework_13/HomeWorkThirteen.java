package homework_13;

public class HomeWorkThirteen {
    public static void main(String[] args) {
        System.out.println("Valid data: " +
                Auth.validateCredentials("user123", "password123", "password123"));

        System.out.println("Different password: " +
                Auth.validateCredentials("user123", "password123", "password121"));

        System.out.println("Length of login: " +
                Auth.validateCredentials("user123dksklklsdklsdkldskldkslkdsk", "password123", "password123"));

        System.out.println("Length contains space: " +
                Auth.validateCredentials("user123 d", "password123", "password123"));
    }
}
