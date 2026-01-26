import java.util.Scanner;

public class Session01Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Nhập số ngày chậm trễ: ");
        a = sc.nextInt();
        System.out.print("Nhập số lượng sách mượn: ");
        b = sc.nextInt();

        double total = a * b * 5000;
        System.out.println("Tiền phạt gốc: " + total + " VNĐ");

        if (a > 7 && b >= 3) {
            total = total * 1.2;
        }
        System.out.println("Tiền phạt sau điều chỉnh: " + total + " VNĐ");

        boolean lockCard = total > 50000;
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);
    }
}
