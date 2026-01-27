import java.util.Scanner;

public class Session03Bai05 {
    public static void displayBooks(int[] arr, int n) {
        System.out.print("Kho sach hien tai (" + n + " cuon): [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Khong tim thay sach ma " + bookId);
            return n;
        }
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Da xoa sach ma " + bookId);
        return n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101, 102, 103, 104, 105};
        int n = 5;
        while (true) {
            displayBooks(books, n);
            if (n == 0) {
                System.out.println("Kho sach da rong!");
                break;
            }

            System.out.print("Nhap ma sach can xoa (0 de thoat): ");
            int id = sc.nextInt();
            if (id == 0) {
                break;
            }
            n = deleteBook(books, n, id);
        }
        System.out.println("Da thoat chuong trinh.");
    }
}
