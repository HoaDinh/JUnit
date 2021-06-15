package TestLesson;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputPassword {
    public static void inputPassword(String password) {
        Pattern pattern1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{10,}$",Pattern.CASE_INSENSITIVE);
        Matcher match = pattern1.matcher(password);
        boolean check = match.find();

        if (password.length() < 10) {
            System.out.println("Mật khẩu yếu");
        } else if (check)
            System.out.println("Mật khẩu mạnh");
        else System.out.println("Mật khẩu chưa đủ mạnh");
    }
}
