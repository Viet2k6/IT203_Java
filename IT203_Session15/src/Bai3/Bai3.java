package Bai3;

public class Bai3 {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        // Quy trình hợp lệ
        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};
        System.out.println("Kiểm tra quy trình 1:");
        checker.checkProcess(actions1);

        checker.reset();

        // Quy trình sai (POP khi rỗng)
        String[] actions2 = {"POP", "PUSH"};
        System.out.println("\nKiểm tra quy trình 2:");
        checker.checkProcess(actions2);

        checker.reset();

        //Quy trình sai khi còn thuốc chưa phát hết
        String[] actions3 = {"PUSH", "PUSH", "POP"};
        System.out.println("\nKiểm tra quy trình 3:");
        checker.checkProcess(actions3);
    }
}

