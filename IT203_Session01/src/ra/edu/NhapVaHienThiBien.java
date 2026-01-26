package ra.edu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NhapVaHienThiBien {
    public static void main(String[] args) {
        int a;
        float b;
        double c;
        long d;
        String name;
        char ch;
        Date birthday;
        boolean flag;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số thực b: ");
        b = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập vào số double c: ");
        c = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào số long d: ");
        d = Long.parseLong(sc.nextLine());
        System.out.println("Nhập vào họ tên của bạn: ");
        name = sc.nextLine();
        System.out.println("Nhập vào 1 kí tự bất kỳ: ");
        ch = sc.nextLine().charAt(0);
        System.out.println("Nhập vào ngày sinh của bạn: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            birthday = sdf.parse(sc.nextLine());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Nhập vào 1 giá trị boolean: ");
        flag = Boolean.parseBoolean(sc.nextLine());

        System.out.println("\nThông tin vừa nhập: ");
        System.out.println("a = "+a+", d = "+d);
        System.out.println("b = "+b+", c = "+c);
        System.out.println("name = "+name);
        System.out.println("ch = "+ch);
        System.out.println("birthday = "+sdf.format(birthday));
        System.out.println("flag = "+flag);
    }
}