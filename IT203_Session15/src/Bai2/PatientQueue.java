package Bai2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue = new LinkedList<>();

    // Thêm bệnh nhân vào cuối hàng (enqueue)
    public void addPatient(Patient p) {
        queue.add(p);
        System.out.println("Đã tiếp nhận bệnh nhân: " + p);
    }

    // Gọi bệnh nhân đầu tiên (dequeue)
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân nào trong hàng.");
            return null;
        }
        Patient next = queue.poll();
        System.out.println("Bác sĩ đang khám cho: " + next);
        return next;
    }

    // Xem bệnh nhân tiếp theo (peek)
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân nào đang chờ.");
            return null;
        }
        Patient next = queue.peek();
        System.out.println("Bệnh nhân tiếp theo sẽ được khám: " + next);
        return next;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách bệnh nhân trống.");
            return;
        }
        System.out.println("=== Danh sách bệnh nhân đang chờ ===");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}

