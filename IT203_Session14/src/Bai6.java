import java.util.*;

class Patient2 {
    String name;
    int age;
    String department;
    public Patient2(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (Tuổi " + age + ")";
    }
}

public class Bai6 {
    public static void main(String[] args) {
        List<Patient2> patients = Arrays.asList(
                new Patient2("Lan", 30, "Tim mạch"),
                new Patient2("Hùng", 45, "Nội tiết"),
                new Patient2("Mai", 28, "Tim mạch"),
                new Patient2("An", 50, "Nội tiết"),
                new Patient2("Bình", 40, "Thần kinh")
        );

        Map<String, List<Patient2>> departmentMap = new HashMap<>();
        for (Patient2 p : patients) {
            departmentMap.putIfAbsent(p.department, new ArrayList<>());
            departmentMap.get(p.department).add(p);
        }
        System.out.println("Danh sách bệnh nhân theo khoa:");
        for (Map.Entry<String, List<Patient2>> entry : departmentMap.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + " -> " + entry.getValue());
        }


        String busiestDept = null;
        int maxCount = 0;
        for (Map.Entry<String, List<Patient2>> entry : departmentMap.entrySet()) {
            int count = entry.getValue().size();
            if (count > maxCount) {
                maxCount = count;
                busiestDept = entry.getKey();
            }
        }
        System.out.println("\nKhoa " + busiestDept + " đang đông nhất (" + maxCount + " bệnh nhân).");
    }
}
