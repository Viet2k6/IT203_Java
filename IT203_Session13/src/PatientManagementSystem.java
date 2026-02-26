import java.util.*;

class Patient {
    private String id;
    private String fullName;
    private int age;
    private String diagnosis;
    public Patient(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "|| ID : " + id + " || FullName : " + fullName + " || Age : " + age + " || Diagnosis : " + diagnosis + " ||";
    }
}

public class PatientManagementSystem {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    displayPatients();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 6);
    }

    private static void showMenu() {
        System.out.println("======================MENU======================");
        System.out.println("|| 1. Tiếp nhận bệnh nhân                      ||");
        System.out.println("|| 2. Cập nhật chẩn đoán                      ||");
        System.out.println("|| 3. Xuất viện                               ||");
        System.out.println("|| 4. Sắp xếp danh sách bệnh nhân             ||");
        System.out.println("|| 5. Hiển thị danh sách bệnh nhân            ||");
        System.out.println("|| 6. Thoát                                   ||");
        System.out.println("===============================================");
    }

    private static void addPatient() {
        System.out.print("Nhập ID bệnh nhân: ");
        String id = sc.nextLine();
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                System.out.println("ID đã tồn tại, không thể thêm.");
                return;
            }
        }

        System.out.print("Nhập tên bệnh nhân: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();
        patients.add(new Patient(id, name, age, diagnosis));
        System.out.println("Bệnh nhân đã được thêm thành công.");
    }

    private static void updateDiagnosis() {
        System.out.print("Nhập ID bệnh nhân để cập nhật chẩn đoán: ");
        String id = sc.nextLine();
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                String newDiagnosis = sc.nextLine();
                p.setDiagnosis(newDiagnosis);
                System.out.println("Chẩn đoán đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
    }

    private static void dischargePatient() {
        System.out.print("Nhập ID bệnh nhân để xuất viện: ");
        String id = sc.nextLine();
        Iterator<Patient> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.getId().equals(id)) {
                iterator.remove();
                System.out.println("Bệnh nhân đã được xuất viện.");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
    }

    private static void sortPatients() {
        patients.sort(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.getAge() != p2.getAge()) {
                    return Integer.compare(p2.getAge(), p1.getAge());
                }
                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });
        System.out.println("Danh sách bệnh nhân đã được sắp xếp.");
    }

    private static void displayPatients() {
        System.out.println("==================Danh sách bệnh nhân==================");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }
}
