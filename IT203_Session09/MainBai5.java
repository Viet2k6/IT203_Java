import java.util.ArrayList;
import java.util.List;

abstract class Employee1 {
    protected String name;
    public Employee1(String name) {
        this.name = name;
    }
    public abstract double calculateSalary();
}

class OfficeEmployee extends Employee1 {
    private double baseSalary;
    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }
    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class ProductionEmployee extends Employee1 {
    private int numOfProducts;
    private double price;
    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }
    @Override
    public double calculateSalary() {
        return numOfProducts * price;
    }
}

public class MainBai5 {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new OfficeEmployee("Nguyen Van A", 10000000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30000));
        double totalSalary = 0;
        int index = 1;
        System.out.println("Danh sách lương nhân viên:");
        for (Employee1 emp : employees) {
            double salary = emp.calculateSalary();
            totalSalary += salary;
            System.out.println(index + ". " + emp.name + " - Lương: " + String.format("%,.0f", salary));
            index++;
        }
        System.out.println("=> TỔNG LƯƠNG CÔNG TY: " +
                String.format("%,.0f", totalSalary));
    }
}
