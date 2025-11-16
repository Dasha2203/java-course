package homework_13;

public class HomeWorkThirteen {
    public static void main(String[] args) {
        // TASK 1
        System.out.println("Valid data: " +
                Auth.validateCredentials("user123", "password123", "password123"));

        System.out.println("Different password: " +
                Auth.validateCredentials("user123", "password123", "password121"));

        System.out.println("Length of login: " +
                Auth.validateCredentials("user123dksklklsdklsdkldskldkslkdsk", "password123", "password123"));

        System.out.println("Length contains space: " +
                Auth.validateCredentials("user123 d", "password123", "password123"));

        // TASK *: Написать try/catch/finally, в котором finally вызван не будет
        try {
            System.out.println("Try");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("block catch");
        } finally {
            System.out.println("finally");
        }
    }
}
