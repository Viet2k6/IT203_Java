import java.util.Scanner;

public class Session01Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách (USD): ");
        double priceUSD = sc.nextDouble();
        float rate = 25450.0f;
        double totalVND = priceUSD * rate;
        long roundedVND = (long) totalVND;
        System.out.println("Giá chính xác (số thực): " + totalVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedVND);
    }
}
