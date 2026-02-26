import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectronicPrescriptionApp {
    static class Medicine {
        String drugId;
        String drugName;
        double unitPrice;
        int quantity;
        Medicine(String drugId, String drugName, double unitPrice, int quantity) {
            this.drugId = drugId;
            this.drugName = drugName;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }

        double getTotalPrice() {
            return unitPrice * quantity;
        }
    }

    static List<Medicine> cart = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }

    static void showMenu() {
        System.out.println("=================================");
        System.out.println("            MENU");
        System.out.println("1. Thêm thuốc vào đơn");
        System.out.println("2. Điều chỉnh số lượng");
        System.out.println("3. Xóa thuốc");
        System.out.println("4. In hóa đơn");
        System.out.println("5. Tìm thuốc giá rẻ");
        System.out.println("6. Thoát");
        System.out.println("=================================");
        System.out.print("Chọn lựa chọn: ");
    }

    //Thêm thuốc
    static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).drugId.equals(id)) {
                System.out.print("Nhập số lượng thêm: ");
                int addQty = sc.nextInt();
                cart.get(i).quantity += addQty;
                System.out.println("Thêm thuốc thành công !");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá thuốc: ");
        double price = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        int quantity = sc.nextInt();
        cart.add(new Medicine(id, name, price, quantity));
        System.out.println("Thêm thuốc thành công !");
    }

    // Điều chỉnh số lượng
    static void updateQuantity() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).drugId.equals(id)) {
                System.out.print("Nhập số lượng mới: ");
                int newQty = sc.nextInt();

                if (newQty == 0) {
                    cart.remove(i);
                    System.out.println("Thuốc đã bị xóa !");
                } else {
                    cart.get(i).quantity = newQty;
                    System.out.println("Cập nhật thuốc thành công !");
                }
                return;
            }
        }
        System.out.println("Thuốc không tồn tại trong đơn.");
    }

    // Xóa thuốc
    static void removeMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).drugId.equals(id)) {
                cart.remove(i);
                System.out.println("Xóa thuốc thành công !");
                return;
            }
        }
        System.out.println("Id thuốc không tồn tại !");
    }

    // In hóa đơn
    static void printInvoice() {
        if (cart.isEmpty()) {
            System.out.println("Đơn thuốc trống !");
            return;
        }

        double total = 0;
        System.out.println("Mã Thuốc | Tên Thuốc | Đơn Giá | Số Lượng");
        for (int i = 0; i < cart.size(); i++) {
            Medicine m = cart.get(i);
            System.out.println(
                    m.drugId + " | " +
                            m.drugName + " | " +
                            m.unitPrice + " | " +
                            m.quantity
            );
            total += m.getTotalPrice();
        }
        System.out.println("Tổng tiền: " + total + " VND");
        cart.clear();
    }

    // Tìm thuốc giá rẻ
    static void findCheapMedicine() {
        System.out.println("Mã Thuốc | Tên Thuốc | Đơn Giá");
        for (int i = 0; i < cart.size(); i++) {
            Medicine m = cart.get(i);
            if (m.unitPrice < 50000) {
                System.out.println(m.drugId + " | " + m.drugName + " | " + m.unitPrice);
            }
        }
    }
}