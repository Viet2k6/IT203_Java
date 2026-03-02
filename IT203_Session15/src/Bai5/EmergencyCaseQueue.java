package Bai5;
import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases = new LinkedList<>();

    // Thêm ca cấp cứu vào hàng đợi
    public void addCase(EmergencyCase c) {
        cases.add(c);
        System.out.println("Đã tiếp nhận ca cấp cứu của bệnh nhân: " + c.getPatient().getName());
    }

    // Lấy ca cấp cứu tiếp theo
    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Không còn ca cấp cứu nào.");
            return null;
        }
        EmergencyCase next = cases.poll();
        System.out.println("Đang xử lý ca cấp cứu của bệnh nhân: " + next.getPatient().getName());
        return next;
    }

    // Hiển thị danh sách ca cấp cứu đang chờ
    public void displayQueue() {
        if (cases.isEmpty()) {
            System.out.println("Danh sách ca cấp cứu trống.");
            return;
        }
        System.out.println("=== Danh sách ca cấp cứu đang chờ ===");
        for (EmergencyCase c : cases) {
            System.out.println("Bệnh nhân: " + c.getPatient().getName());
        }
    }
}
