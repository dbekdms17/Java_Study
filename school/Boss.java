package school;

public class Boss extends Teacher implements SpeacialJob {
    final static String JOB = "교장선생님";
    final static String SCHOOL = "코리아IT학원";

    private int jobLevel;
    private String jobName;
    private int roomNo;

    public Boss(char type, String name, int age) {
        super(SCHOOL, type, name, age);
        jobName = JOB;
        jobLevel = 10;
        roomNo = 101;
    }

    @Override
    public int getJobLevel() {
        return jobLevel;
    }

    @Override
    public String getJobName() {
        return jobName;
    }

    @Override
    public void setJobLevel(int level) {
        this.jobLevel = level;
    }

    @Override
    public void setJobName(String jobName) {
        this.jobName =jobName;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public  String getSchool() {
        return this.getClassName();
    }

    public void setSchool(String school) {
        this.setClassName(school);
    }

    @Override
    public void print() {
        System.out.println("================ 나의 직업 정보 ===============");
        System.out.println(this.getClassName() +"의 " + jobName +"입니다.");
        System.out.println("이름은 " + this.getName() + "입니다.");
        System.out.println("나이는 " + this.getAge() + "입니다.");
        System.out.println("방번호는 " + this.roomNo + "호 입니다.");
        System.out.println("직급으로는  " + this.jobLevel + "레벨 입니다.");
        System.out.println("============================================");
    }
}
