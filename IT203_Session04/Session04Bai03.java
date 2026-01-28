import java.time.LocalDate;

public class Session04Bai03 {
    public static void main(String[] args) {
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        long startBuilder = System.currentTimeMillis();
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        reportBuilder.append("Ngày tạo: ")
                .append(LocalDate.now())
                .append("\n");

        for (String t : transactions) {
            reportBuilder.append("Giao dịch: ")
                    .append(t)
                    .append("\n");
        }

        long endBuilder = System.currentTimeMillis();
        System.out.println(reportBuilder.toString());
        System.out.println("Số thời gian thực thi đối với StringBuilder: "
                + (endBuilder - startBuilder));

        long startString = System.currentTimeMillis();
        String report = "";
        report += "--- BÁO CÁO MƯỢN SÁCH ---\n";
        report += "Ngày tạo: " + LocalDate.now() + "\n";
        for (String t : transactions) {
            report += "Giao dịch: " + t + "\n";
        }
        long endString = System.currentTimeMillis();
        System.out.println("Số thời gian thực thi đối với String: "
                + (endString - startString));
    }
}
