public class Student {
    String studentId;
    String fullName;
    int birthYear;
    double gpa;
    public Student(String studentId, String fullName, int birthYear, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Điểm trung bình: " + gpa);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyen Van A", 2006, 8.2);
        Student student2 = new Student("SV002", "Tran Thi B", 2007, 7.5);
        student1.displayInfo();
        student2.displayInfo();
    }
}
