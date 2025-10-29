package homework_10;

import java.util.Objects;

public class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n Hash: " + hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (obj == null || getClass() != obj.getClass()) return false;
        User userObj = (User) obj;

        return this.age == userObj.age && Objects.equals(this.name, userObj.name);
    }
}
