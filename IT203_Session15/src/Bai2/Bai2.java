package Bai2;

public class Bai2 {
    public static void main(String[] args) {
        PatientQueue pq = new PatientQueue();
        pq.addPatient(new Patient("01", "Nguyễn Văn A", 35));
        pq.addPatient(new Patient("02", "Trần Thị B", 20));
        pq.addPatient(new Patient("03", "Lê Văn C", 41));

        pq.displayQueue();

        pq.peekNextPatient();

        pq.callNextPatient();
        pq.callNextPatient();

        pq.displayQueue();
    }
}

