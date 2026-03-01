import java.util.LinkedHashSet;
import java.util.Set;
public class Bai1 {
    public static void main(String[] args) {
        Set<String> danhSachBenhNhan = new LinkedHashSet<>();
        danhSachBenhNhan.add("Nguyễn Văn A – Yên Bái");
        danhSachBenhNhan.add("Trần Thị B – Thái Bình");
        danhSachBenhNhan.add("Nguyễn Văn A – Yên Bái");
        danhSachBenhNhan.add("Lê Văn C – Hưng Yên");

        System.out.println("Danh sách gọi khám:");
        for (String benhNhan : danhSachBenhNhan) {
            System.out.println(benhNhan);
        }
    }
}