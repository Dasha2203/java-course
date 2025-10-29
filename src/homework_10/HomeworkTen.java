package homework_10;

import java.util.Scanner;

public class HomeworkTen  {
    public static void main(String[] args) throws CloneNotSupportedException {
        User userOne = new User(323,"Dasha", 15, new PC("MacOS", 32));
        User userTwo = new User(454,"Dasha", 15, new PC("MacOS", 32));

        System.out.println(userOne.toString());
        System.out.println(userTwo.toString());

        System.out.println("Пользователи равны? " + userOne.equals(userTwo));


        User[] users = new User[]{
                new User(1,"Dasha", 15, new PC("Linux", 32)),
                new User(2,"Egor", 18, new PC("MacOS", 16)),
                new User(3,"Archil", 10, new PC("Windows", 8))
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип клонирования (1 - Поверхностное, 2 - Глубокое): ");
        int cloningType = scanner.nextInt();

        System.out.println("Введите ID пользователя для клонирования (например, 1): ");
        int id = scanner.nextInt();

        for (User user: users) {
            if (id == user.getId()) {
                if (cloningType == 2) {
                    System.out.println("=".repeat(50) + " Deep clone");

                    User deepClonedUser = user.deepClone();
                    System.out.println("\nСкопированный пользователь: ");
                    System.out.println(deepClonedUser);
                    System.out.println("\nОригинал: ");
                    System.out.println(user);
                    System.out.println("Равенство скопированного пользователя: " + user.equals(deepClonedUser));


                    System.out.println("\nИзменение ссылочного типа PC (в одном изменится)");
                    deepClonedUser.getPc().setOs("Deep os");

                    System.out.println("\nСкопированный пользователь: ");
                    System.out.println(deepClonedUser);
                    System.out.println("\nОригинал: ");
                    System.out.println(user);

                    System.out.println("Равенство скопированного пользователя: " + user.equals(deepClonedUser));
                } else if (cloningType == 1) {
                    System.out.println("=".repeat(50) + " Shallow clone");
                    System.out.println("Копирование:");
                    User clonedUser = user.clone();
                    System.out.println("Скопированный пользователь: ");
                    System.out.println(clonedUser);
                    System.out.println("Оригинал: ");
                    System.out.println(user);
                    System.out.println("Равенство скопированного пользователя: " + user.equals(clonedUser));

                    user.setName("Dasha test change name");
                    System.out.println(user.getName());
                    System.out.println(clonedUser.getName());

                    System.out.println("Равенство скопированного пользователя: " + user.equals(clonedUser));

                    System.out.println("=".repeat(50));

                    System.out.println("\nИзменение ссылочного типа PC (в обоих объектах изменения)");
                    user.getPc().setOs("Test change");
                    System.out.println("\nСкопированный пользователь: ");
                    System.out.println(clonedUser);
                    System.out.println("\nОригинал: ");
                    System.out.println(user);
                    System.out.println("Равенство скопированного пользователя: " + user.equals(clonedUser));
                } else {
                    System.out.println("Пользователь с таким ID не найден.");
                    break;
                }
            }
        }

        scanner.close();
    }
}
