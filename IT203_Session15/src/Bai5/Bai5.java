package Bai5;

public class Bai5 {
    public static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();
        Patient2 p1 = new Patient2("BN01", "Nguyễn Văn A", 40);
        Patient2 p2 = new Patient2("BN02", "Trần Thị B", 55);

        EmergencyCase case1 = new EmergencyCase(p1);
        EmergencyCase case2 = new EmergencyCase(p2);

        queue.addCase(case1);
        queue.addCase(case2);

        queue.displayQueue();

        EmergencyCase currentCase = queue.getNextCase();
        currentCase.addStep(new TreatmentStep("Tiếp nhận bệnh nhân", "10:00"));
        currentCase.addStep(new TreatmentStep("Chẩn đoán ban đầu", "10:05"));
        currentCase.addStep(new TreatmentStep("Điều trị khẩn cấp", "10:10"));

        currentCase.displaySteps();

        currentCase.undoStep();
        currentCase.displaySteps();
    }
}
