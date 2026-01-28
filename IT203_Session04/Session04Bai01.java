import java.util.Scanner;

public class Session04Bai01 {
    public static String formatName(String author) {
        author = author.trim().toLowerCase();
        author = author.replaceAll("\\s+", " ");
        String[] words = author.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String firstChar = word.substring(0, 1).toUpperCase();
            String remain = word.substring(1);
            result.append(firstChar).append(remain).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();
        title = title.trim().replaceAll("\\s+", " ").toUpperCase();
        author = formatName(author);
        System.out.println();
        System.out.println("[" + title + "] - Tác giả: " + author);
    }
}
