package homework_10;

public class HomeworkTen {
    public static void main(String[] args) {
        User userOne = new User("Dasha", 15);
        User userTwo = new User("Dasha", 15);

        System.out.println(userOne.toString());
        System.out.println(userTwo.toString());

        System.out.println("Пользователи равны? " + userOne.equals(userTwo));
    }
}
