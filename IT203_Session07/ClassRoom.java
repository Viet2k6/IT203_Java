public class ClassRoom {
    private static double classFund = 0;
    private String studentName;
    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void payToFund(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng " + amount + " vào quỹ lớp.");
        } else {
            System.out.println("Số tiền đóng không hợp lệ.");
        }
    }

    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }


    public static void main(String[] args) {
        ClassRoom sv1 = new ClassRoom("Việt");
        ClassRoom sv2 = new ClassRoom("Linh");
        ClassRoom sv3 = new ClassRoom("Quang");
        sv1.payToFund(100000);
        sv2.payToFund(120000);
        sv3.payToFund(300000);
        ClassRoom.showClassFund();
    }
}
