public class Config {
    public static final double MAX_SCORE = 10.0;
    public static final double MIN_SCORE = 0.0;

    public static void main(String[] args) {
        double score = 9.5;
        if (score >= MIN_SCORE && score <= MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        } else {
            System.out.println("Điểm không hợp lệ!");
        }
    }
}
