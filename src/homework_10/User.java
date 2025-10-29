package homework_10;

public class User {
    String name;

    User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }
}
