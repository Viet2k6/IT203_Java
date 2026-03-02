package Bai4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EmergencyQueue {
    private PriorityQueue<EmergencyPatient> queue;
    public EmergencyQueue() {
        queue = new PriorityQueue<>(new Comparator<EmergencyPatient>() {
            private int counter = 0;

            @Override
            public int compare(EmergencyPatient p1, EmergencyPatient p2) {
                if (p1.getPriority() != p2.getPriority()) {
                    return Integer.compare(p1.getPriority(), p2.getPriority());
                }
                return 0;
            }
        });
    }

    public void addPatient(EmergencyPatient p) {
        queue.add(p);
        System.out.println("Đã tiếp nhận bệnh nhân: " + p);
    }

    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân nào.");
            return null;
        }
        EmergencyPatient next = queue.poll();
        System.out.println("Bác sĩ đang khám cho: " + next);
        return next;
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách bệnh nhân trống.");
            return;
        }
        System.out.println("=== Danh sách bệnh nhân đang chờ ===");
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}

