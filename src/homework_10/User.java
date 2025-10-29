package homework_10;

import java.util.Objects;

public class User implements Cloneable {
    private String name;
    private int age;
    private PC pc;
    private int id;

    User(int id, String name, int age, PC pc) {
        this.name = name;
        this.age = age;
        this.pc = pc;
        this.id = id;
    }

    public void setPc(PC pc) {
        this.pc = pc;
    }

    public PC getPc() {
        return this.pc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public User deepClone() {
        PC copiedPc = new PC(this.pc.getOs(), this.pc.getRam());
        return new User(this.id, this.name, this.age, copiedPc);
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\nName: " + this.name + "\n Age: " + this.age + "\n Hash: " + hashCode() + "\n PC: " + this.pc.getOs() + "\nRAM: " + this.pc.getRam() + "\n";
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

        return this.age == userObj.age
                && Objects.equals(this.name, userObj.name)
                && this.pc == userObj.pc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
