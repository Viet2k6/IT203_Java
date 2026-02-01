public class Employee {
    private String employeeId;
    private String employeeName;
    private double salary;

    // Không truyền tham số
    public Employee() {
        this.employeeId = "Chưa có mã";
        this.employeeName = "Chưa có tên";
        this.salary = 0;
    }

    // Constructor gồm mã và tên
    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = 0;
    }

    // Constructor gồm đầy đủ mã, tên, lương
    public Employee(String employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Lương: " + salary);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("NV01", "Nguyen Van A");
        Employee emp3 = new Employee("NV02", "Tran Thi B", 1000000);
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}
