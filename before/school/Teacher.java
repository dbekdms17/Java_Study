package school;

public class Teacher extends Human{
    private String className;

    public Teacher() {
        super();
        className = "";
    }

    public Teacher(String className, char type, String name, int age) {
        super(type, name, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    @Override
    public void print() {
        System.out.println("============ 선생님 정보 ===========");
        System.out.println(className + "입니다.");
        System.out.println("이름은 " + this.getName() + "입니다. ");
        System.out.println("성별은 " + this.getType() + "입니다. ");
        System.out.println("나이는 " + this.getAge() + "입니다. ");
        System.out.println("===================================");
    }
}
