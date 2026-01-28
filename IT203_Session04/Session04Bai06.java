import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Session04Bai06 {

    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ và nội dung thật là ngu ngốc.";
        String[] blacklist = {"tệ", "ngu ngốc"};
        String regex = "(?i)\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(review);
        StringBuilder result = new StringBuilder();
        int lastEnd = 0;

        while (matcher.find()) {
            result.append(review.substring(lastEnd, matcher.start()));
            String badWord = matcher.group();
            String stars = "*".repeat(badWord.length());
            result.append(stars);
            lastEnd = matcher.end();
        }

        result.append(review.substring(lastEnd));
        String finalReview = result.toString();
        if (finalReview.length() > 200) {
            int cut = finalReview.lastIndexOf(" ", 200);
            StringBuilder shortText = new StringBuilder();
            shortText.append(finalReview.substring(0, cut));
            shortText.append("...");
            finalReview = shortText.toString();
        }
        System.out.println("Review sau khi xử lý:");
        System.out.println(finalReview);
    }
}
