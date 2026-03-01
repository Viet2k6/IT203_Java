import java.util.HashSet;
import java.util.Set;

public class Bai3 {

    // Thành phần thuốc
    public static Set<String> taoThanhPhanThuoc() {
        Set<String> thuoc = new HashSet<>();
        thuoc.add("Aspirin");
        thuoc.add("Caffeine");
        thuoc.add("Paracetamol");
        return thuoc;
    }

    // Các chất gây dị ứng
    public static Set<String> taoDanhSachDiUng() {
        Set<String> diUng = new HashSet<>();
        diUng.add("Penicillin");
        diUng.add("Aspirin");
        return diUng;
    }

    // Tìm các chất gây dị ứng
    public static Set<String> timCanhBaoDiUng(Set<String> thuoc, Set<String> diUng) {
        Set<String> canhBao = new HashSet<>(thuoc);
        canhBao.retainAll(diUng);
        return canhBao;
    }

    // Tìm thành phần an toàn
    public static Set<String> timThanhPhanAnToan(Set<String> thuoc, Set<String> diUng) {
        Set<String> anToan = new HashSet<>(thuoc);
        anToan.removeAll(diUng);
        return anToan;
    }

    public static void main(String[] args) {
        Set<String> thanhPhanThuoc = taoThanhPhanThuoc();
        Set<String> chatDiUng = taoDanhSachDiUng();
        Set<String> canhBao = timCanhBaoDiUng(thanhPhanThuoc, chatDiUng);
        Set<String> anToan = timThanhPhanAnToan(thanhPhanThuoc, chatDiUng);
        System.out.println("Cảnh báo dị ứng: " + canhBao);
        System.out.println("Thành phần an toàn: " + anToan);
    }
}