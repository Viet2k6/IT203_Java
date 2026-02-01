import java.util.regex.Pattern;

public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            System.out.println("Mật khẩu không được trống");
        } else {
            this.password = password;
        }
    }

    public void setEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (Pattern.matches(regex, email)) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ");
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + (email == null ? "Chưa có" : email));
        System.out.println("Password: ******");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        User u1 = new User(1, "admin", "123456", "admin@gmail.com");
        u1.displayInfo();
        User u2 = new User(2, "Viet2k6", "", "viet2k6@gmail.com");
        u2.displayInfo();
        User u3 = new User(3, "Delulu123", "101010", "qeqweqweqwe");
        u3.displayInfo();
    }
}
