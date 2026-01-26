import java.util.Scanner;

public class Session02Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int luot;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int tong = 0;
        int dem = 0;
        for (int i = 1; i <= 7; i++) {
            if (i == 1) {
                System.out.print("Nhap luot muon ngay Thu 2: ");
            } else if (i == 2) {
                System.out.print("Nhap luot muon ngay Thu 3: ");
            } else if (i == 3) {
                System.out.print("Nhap luot muon ngay Thu 4: ");
            } else if (i == 4) {
                System.out.print("Nhap luot muon ngay Thu 5: ");
            } else if (i == 5) {
                System.out.print("Nhap luot muon ngay Thu 6: ");
            } else if (i == 6) {
                System.out.print("Nhap luot muon ngay Thu 7: ");
            } else {
                System.out.print("Nhap luot muon ngay Chu Nhat: ");
            }

            luot = sc.nextInt();
            if (luot == 0) {
                continue;
            }

            tong += luot;
            dem++;

            if (luot > max) {
                max = luot;
            }

            if (luot < min) {
                min = luot;
            }
        }

        double trungBinh = (dem > 0) ? (double) tong / dem : 0;
        System.out.println("\n--- KET QUA THONG KE ---");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + trungBinh);
    }
}
