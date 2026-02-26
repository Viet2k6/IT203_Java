import java.util.LinkedList;
public class EmergencyRoom {
    private LinkedList<String> waitingQueue = new LinkedList<>();
    public void patientCheckIn(String name) {
        waitingQueue.addLast(name);
    }

    // Bệnh nhân cấp cứu
    public void emergencyCheckIn(String name) {
        waitingQueue.addFirst(name);
    }

    // Bác sĩ khám bệnh
    public void treatPatient() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Không còn bệnh nhân nào.");
            return;
        }

        String patient = waitingQueue.removeFirst();
        if (patient.equals("C")) {
            System.out.println("Đang cấp cứu: " + patient);
        } else {
            System.out.println("Đang khám: " + patient);
        }
    }

    public static void main(String[] args) {
        EmergencyRoom er = new EmergencyRoom();
        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");
        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}