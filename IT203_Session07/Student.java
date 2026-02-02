public class Student {
    private String studentId;
    private String studentName;
    private static int totalStudent = 0;
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + studentId);
        System.out.println("Tên SV: " + studentName);
        System.out.println("-------------------");
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }

    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyễn Văn A");
        Student s2 = new Student("SV002", "Trần Thị B");
        s1.displayInfo();
        s2.displayInfo();
        Student.displayTotalStudent();
    }
}
