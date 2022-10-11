package school;

import java.util.Arrays;

public class Student extends Human {
    private String className;
    private int[] score;

    public Student() {
        super();
        className = "";
        score = new int[5];
    }

    public Student(String className, String name, char type, int age, int[] score) {
        super(type, name, age);
        this.className = className;
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getScore(int index) {
        return this.score[index];
    }

    public void setScore(int index, int score) {
        this.score[index] = score;
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        return total;
    }

    public double getAvg() {
        return getTotal() / this.score.length;
    }

    public void print() {
        System.out.println("============ 학생 정보 ===========");
        System.out.println(className + "입니다.");
        System.out.println("이름은 " + this.getName() + "입니다. ");
        System.out.println("성별은 " + this.getType() + "입니다. ");
        System.out.println("나이는 " + this.getAge() + "입니다. ");
        System.out.println("점수는 " + Arrays.toString(score) + "점 입니다. ");
        System.out.println("===================================");
    }
}