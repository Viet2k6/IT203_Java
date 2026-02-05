class Employee {
    protected String name;
    protected double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void display() {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Lương cơ bản: " + baseSalary);
    }
}

class Manager extends Employee {
    private String department;
    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    public void display() {
        super.display();
        System.out.println("Phòng ban: " + department);
    }
}

public class MainBai3 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nguyễn Văn A", 20000000, "IT");
        manager.display();
    }
}
