import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Session04Bai04 {
    public static void main(String[] args) {
        String cardID = "TV202312345";
        Pattern prefixPattern = Pattern.compile("^[A-Z]{2}");
        Pattern yearPattern = Pattern.compile("^[A-Z]{2}(\\d{4})");
        Pattern fullPattern = Pattern.compile("^[A-Z]{2}\\d{9}$");
        Matcher prefixMatcher = prefixPattern.matcher(cardID);
        Matcher yearMatcher = yearPattern.matcher(cardID);
        Matcher fullMatcher = fullPattern.matcher(cardID);

        if (!prefixMatcher.find()) {
            System.out.println("Thiếu tiền tố TV hoặc không viết hoa");
            return;
        }
        if (!yearMatcher.find()) {
            System.out.println("Năm không hợp lệ");
            return;
        }
        if (!fullMatcher.matches()) {
            System.out.println("Mã thẻ sai định dạng");
            return;
        }
        System.out.println("Mã thẻ hợp lệ!");
    }
}
