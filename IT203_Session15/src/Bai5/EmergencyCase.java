package Bai5;

import java.util.Stack;

public class EmergencyCase {
    private Patient2 patient;
    private Stack<TreatmentStep> steps = new Stack<>();
    public EmergencyCase(Patient2 patient) {
        this.patient = patient;
    }

    public Patient2 getPatient() {
        return patient;
    }

    // Thêm bước xử lý
    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Đã thêm bước xử lý cho " + patient.getName() + ": " + step);
    }

    // Hoàn tác bước xử lý gần nhất
    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Không có bước xử lý nào để hoàn tác.");
            return null;
        }
        TreatmentStep undone = steps.pop();
        System.out.println("Hoàn tác bước xử lý: " + undone);
        return undone;
    }

    // Hiển thị toàn bộ các bước xử lý
    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý nào cho bệnh nhân " + patient.getName());
            return;
        }
        System.out.println("=== Các bước xử lý cho bệnh nhân " + patient.getName() + " ===");
        for (TreatmentStep step : steps) {
            System.out.println(step);
        }
    }
}
