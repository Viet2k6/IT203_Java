public class Account {
    String username;
    String password;
    String email;
    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ********");
    }

    public static void main(String[] args) {
        Account acc1 = new Account("viet2k6", "011006", "trandangviet00@gmail.com");
        System.out.println("Thông tin tài khoản ban đầu:");
        acc1.displayInfo();
        acc1.changePassword("123456");
        System.out.println("\nSau khi đã đổi mật khẩu:");
        acc1.displayInfo();
    }
}
