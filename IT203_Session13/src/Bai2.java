import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai2 {
    public static List<String> locVaSapXepThuoc(List<String> danhSachThuoc) {
        List<String> thuocKhongTrung = new ArrayList<>();
        for (String thuoc : danhSachThuoc) {
            if (!thuocKhongTrung.contains(thuoc)) {
                thuocKhongTrung.add(thuoc);
            }
        }
        Collections.sort(thuocKhongTrung);
        return thuocKhongTrung;
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("Paracetamol");
        input.add("Ibuprofen");
        input.add("Panadol");
        input.add("Paracetamol");
        input.add("Aspirin");
        input.add("Ibuprofen");
        System.out.println("Input: " + input);
        List<String> output = locVaSapXepThuoc(input);
        System.out.println("Output: " + output);
    }
}