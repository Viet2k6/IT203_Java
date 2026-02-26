import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> commonList = new ArrayList<>();
        for (T item : listA) {
            if (listB.contains(item) && !commonList.contains(item)) {
                commonList.add(item);
            }
        }
        return commonList;
    }

    public static void main(String[] args) {

        // Integer
        List<Integer> khoaNoi = List.of(101, 102, 105);
        List<Integer> khoaNgoai = List.of(102, 105, 108);
        List<Integer> ketQua1 = findCommonPatients(khoaNoi, khoaNgoai);
        System.out.println("Test Case 1 Output: " + ketQua1);

        // String
        List<String> bhytNoi = List.of("DN01", "DN02", "DN03");
        List<String> bhytNgoai = List.of("DN02", "DN04");
        List<String> ketQua2 = findCommonPatients(bhytNoi, bhytNgoai);
        System.out.println("Test Case 2 Output: " + ketQua2);
    }
}