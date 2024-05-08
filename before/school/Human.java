package school;

public abstract class Human {
    private char type;
    private String name;
    private int age;

    public Human() {
        this.type = 0;
        name = "";
        age =0;
    }

    public Human(char type, String name, int age) {
        this.type = type;
        this.name =name;
        this.age= age;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void print();
}
