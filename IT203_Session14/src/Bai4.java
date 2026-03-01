import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Bai4 {
    public static List<String> taoDanhSachCaBenh() {
        List<String> danhSach = new ArrayList<>();
        danhSach.add("Cúm A");
        danhSach.add("Sốt xuất huyết");
        danhSach.add("Cúm A");
        danhSach.add("Covid-19");
        danhSach.add("Cúm A");
        danhSach.add("Sốt xuất huyết");
        return danhSach;
    }

    public static Map<String, Integer> thongKeCaBenh(List<String> danhSach) {
        Map<String, Integer> thongKe = new TreeMap<>();
        for (String benh : danhSach) {
            if (thongKe.containsKey(benh)) {
                int soCa = thongKe.get(benh);
                thongKe.put(benh, soCa + 1);
            } else {
                thongKe.put(benh, 1);
            }
        }
        return thongKe;
    }

    public static void inBaoCao(Map<String, Integer> thongKe) {
        for (String benh : thongKe.keySet()) {
            System.out.println(benh + ": " + thongKe.get(benh) + " ca");
        }
    }

    public static void main(String[] args) {
        List<String> danhSach = taoDanhSachCaBenh();
        Map<String, Integer> ketQua = thongKeCaBenh(danhSach);
        inBaoCao(ketQua);
    }
}