package school;

public class ClassRoom {
    private  String className;
    private  Teacher teacher;
    private  Student[] students;

    public ClassRoom() {
        className = "";
        teacher = new Teacher();
        students = new Student[10];
        for(int i = 0; i < students.length; i++) {
            students[i].setClassName(className);
        }
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
        this.teacher.setClassName(className);
        for(int i = 0; i < students.length; i++) {
            students[i].setClassName(className);
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public void setStudent(int index, Student students) {
        this.students[index] = students;
    }

    public void printClassName() {
        System.out.println(className + "입니다.");
    }
    public void printTeacher() {
        this.teacher.print();
    }

    public void printStudents() {
        for(int i=0; i<students.length; i++) {
            System.out.println(i+1 + "번 학생정보");
            students[i].print();
        }
    }
}
