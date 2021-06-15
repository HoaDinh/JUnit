package Day14;

import java.io.UncheckedIOException;
import java.util.Scanner;

public class Main {

    public static void main (String [] args )
    {
       /* String str = null;
        int length=0;
        try {
            length = str.length();
        }
        catch (Exception e)
        {
            System.out.println("Chuỗi rỗng không lấy được length của chuỗi");
            System.out.println(e);
        }*/
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int tu=0;
        int mau=0;
        float result =0;
        while (flag==false)
        {
            try
            {
                System.out.println("Nhập tử số");
                tu=Integer.valueOf(sc.nextLine());
                System.out.printf("Nhập mẫu số \n");
                mau=Integer.valueOf(sc.nextLine());
                result =(float)(tu/mau);
                flag=true;
                System.out.println("Kết quả phép chia là đây: "+result);

            }
            catch (ArithmeticException e)
            {
                System.out.println("Nhập mẫu sai rồi mời nhập lại từ đầu");
                flag=false;
            }

            catch (NumberFormatException e)
            {
                System.out.println("Nhập sai rồi mời nhập lại từ đầu");
                flag=false;
            }


        }

    }
}
