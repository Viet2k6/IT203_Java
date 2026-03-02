package Bai4;

public class Bai4 {
    public static void main(String[] args) {
        EmergencyQueue eq = new EmergencyQueue();
        eq.addPatient(new EmergencyPatient("01", "Nguyễn Văn A", 2));
        eq.addPatient(new EmergencyPatient("02", "Trần Thị B", 2));
        eq.addPatient(new EmergencyPatient("03", "Lê Văn C", 1));

        eq.displayQueue();

        eq.callNextPatient();
        eq.callNextPatient();
        eq.callNextPatient();
        eq.callNextPatient();
    }
}

