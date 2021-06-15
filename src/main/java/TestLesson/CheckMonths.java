package TestLesson;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckMonths {
    public static void main(String[] args) {
        //System.out.println("Chán thía, vì sao nó k chạy");
        Calendar cal = Calendar.getInstance();
        int nam = cal.get(Calendar.YEAR);
       Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Nhập tháng vào đây nhé");
            int thang =Integer.valueOf(scan.nextLine());
            if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 10) {
                System.out.println(String.format("Tháng %s Có 31 ngày", thang));
            }
            if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                System.out.format("Tháng %s Có 30 ngày", thang);
            }
            if (thang == 2) {
                if (nam % 400 == 0 || nam % 4 == 0 && nam % 100 != 0) {
                    System.out.println(String.format("Tháng %s Có 29 ngày", thang));
                } else {
                    System.out.println(String.format("Tháng %s Có 28 ngày", thang));
                }

            }
            if (thang >= 13||thang <=0) throw new InputMismatchException("Đây không phải tháng trong năm, tháng không được lớn hơn 12 và nhỏ hơn 0");

        } catch (NumberFormatException e) {
            System.out.println("Đây không phải là tháng trong năm");

        }

    }
}
