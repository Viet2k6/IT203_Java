public class Session07Bai02 {
    static class Student {
        String name;
    }

    public static void main(String[] args) {
        // Biến nguyên thủy (primitive)
        int a = 10;
        int b = a;   // b sao chép giá trị của a
        b = 20;      // thay đổi b
        System.out.println("Biến nguyên thủy:");
        System.out.println("a = " + a); // vẫn là 10
        System.out.println("b = " + b); // 20


        // Biến tham chiếu (reference)
        Student s1 = new Student();
        s1.name = "Nguyen Van A";
        Student s2 = s1; // s2 sao chép địa chỉ của s1 (cùng trỏ 1 object)
        s2.name = "Nguyen Thi B"; // thay đổi qua s2
        System.out.println("\nBiến tham chiếu:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
