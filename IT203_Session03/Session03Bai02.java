import java.util.Scanner;

public class Session03Bai02 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {
                "Doraemon",
                "Conan",
                "Harry Potter"
        };

        System.out.print("Nhap ten sach can tim: ");
        String search = sc.nextLine();
        int result = searchBooks(books, search);
        if (result != -1) {
            System.out.println("Tim thay sach '" + search + "' tai vi tri so: " + result);
        } else {
            System.out.println("Sach khong ton tai trong thu vien.");
        }
    }
}
