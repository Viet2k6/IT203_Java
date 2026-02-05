class Person {
    protected String fullName;
    protected int age;
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void display() {
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
    }
}

class Student extends Person {
    private String studentId;
    private double averageScore;
    public Student(String fullName, int age, String studentId, double averageScore) {
        super(fullName, age);
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + averageScore);
    }
}

public class MainBai1 {
    public static void main(String[] args) {
        Student st = new Student("Trần Đăng Việt", 19, "B24DTCN293", 8.5);
        st.display();
    }
}
