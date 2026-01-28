import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Session04Bai05 {
    public static void main(String[] args) {
        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranThiB | Action: RETURN | BookID: BK54321"
        };

        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: ([A-Za-z]+) \\| Action: (BORROW|RETURN) \\| BookID: ([A-Z]{2}\\d{5})";
        Pattern pattern = Pattern.compile(regex);
        int borrowCount = 0;
        int returnCount = 0;
        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);
            if (matcher.find()) {
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookID = matcher.group(4);
                System.out.println("Ngày: " + date);
                System.out.println("Người dùng: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookID);
                System.out.println();
                if (action.equals("BORROW")) {
                    borrowCount++;
                } else if (action.equals("RETURN")) {
                    returnCount++;
                }
            }
        }
        System.out.println("Tổng BORROW: " + borrowCount);
        System.out.println("Tổng RETURN: " + returnCount);
    }
}
