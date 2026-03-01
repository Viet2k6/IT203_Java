import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static Map<String, String> taoDanhMucThuoc() {
        Map<String, String> danhMuc = new HashMap<>();
        danhMuc.put("T01", "Paracetamol");
        danhMuc.put("T02", "Ibuprofen");
        danhMuc.put("T03", "Panadol Extra");
        danhMuc.put("T04", "Vitamin C");
        danhMuc.put("T05", "Alpha Choay");
        return danhMuc;
    }

    public static void traCuuThuoc(Map<String, String> danhMuc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String maThuoc = sc.nextLine();
        if (danhMuc.containsKey(maThuoc)) {
            System.out.println("Tên thuốc: " + danhMuc.get(maThuoc));
        } else {
            System.out.println("Thuốc không tồn tại.");
        }
    }

    public static void main(String[] args) {
        Map<String, String> danhMucThuoc = taoDanhMucThuoc();
        traCuuThuoc(danhMucThuoc);
    }
}