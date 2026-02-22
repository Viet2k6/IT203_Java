import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Bai 1
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Hình tròn:");
        System.out.println("Diện tích: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());
        System.out.println();
        System.out.println("Hình chữ nhật:");
        System.out.println("Diện tích: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());

        // Bai 2
        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle("Trek");
        car.move();
        bicycle.move();

        // Bai 3
        Duck duck = new Duck("Vịt");
        Fish fish = new Fish("Cá");
        duck.swim();
        duck.fly();
        fish.swim();

        //Bai 4
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };
        smartLight.powerOn();
        smartLight.checkBattery();

        //Bai 5
        Employee e1 = new OfficeStaff("Nguyễn Văn A", 7000000);
        Employee e2 = new Manager("Trần Văn B", 7000000, 5000000);
        printSalary(e1);
        System.out.println("------------------");
        printSalary(e2);
    }
    public static void printSalary(Employee e) {
        e.showInfo();
        System.out.println("Lương thực nhận: " + e.calculateSalary());

        // Bai 6
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Chuột Gaming", 20));
        products.add(new Product("Bàn phím", 50));
        products.add(new Product("Ipad", 300));

        // Sắp xếp theo giá (Anonymous Class)
        Collections.sort(products, new Comparator<Product>() {
            // Anonymous Class có thể có thêm biến, method nội bộ
            int count = 0;
            @Override
            public int compare(Product p1, Product p2) {
                count++;
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("--- Sắp xếp theo giá tăng dần ---");
        for (Product p : products) {
            p.showInfo();
        }

        // Sắp xếp theo tên (Lambda)
        Collections.sort(products,
                (p1, p2) -> p1.name.compareTo(p2.name)
        );
        System.out.println("\n--- Sắp xếp theo tên A-Z ---");
        for (Product p : products) {
            p.showInfo();
        }
    }
}