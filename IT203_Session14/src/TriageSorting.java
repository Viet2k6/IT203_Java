import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Patient {
    String name;
    int severity;
    int arrivalTime;
    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Bệnh nhân " + name + " (Mức " + severity + ", đến lúc " + arrivalTime + ")";
    }
}

public class TriageSorting {
    public static void main(String[] args) {
        Comparator<Patient> comparator = new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.severity != p2.severity) {
                    return p1.severity - p2.severity;
                }
                return p1.arrivalTime - p2.arrivalTime;
            }
        };

        Set<Patient> emergencyRoom = new TreeSet<>(comparator);
        emergencyRoom.add(new Patient("A", 3, 800));
        emergencyRoom.add(new Patient("B", 1, 815));
        emergencyRoom.add(new Patient("C", 1, 805));
        System.out.println("Thứ tự xử lý:");
        for (Patient p : emergencyRoom) {
            System.out.println(p);
        }
    }
}