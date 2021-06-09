package Day12;


public class StringBuilder {
    public  static void main (String [] args  )
    {
        //Khởi tạo string builder
        java.lang.StringBuilder str = new java.lang.StringBuilder(); //Khởi tạo chuỗi rỗng
        java.lang.StringBuilder str1 = new java.lang.StringBuilder("Abc"); //Khởi tạo chuỗi có giá trị
        java.lang.StringBuilder str2 = new java.lang.StringBuilder(50); //Khởi tạo chuỗi với độ dài bao nhiêu
        CharSequence obj = "Cat";
        java.lang.StringBuilder str3 = new java.lang.StringBuilder(obj); //Khởi tạo chuỗi với Sequence
        //Nối chuỗi dùng append
        System.out.println("Chuỗi ban đầu: "+str1);
        str1.append(1);
        str1.append("EF");
        str1.append(true);
        //str1.append("acc",);
        System.out.println("Sau khi nối chuỗi "+str1);
        str1.insert(1,"Hoa");
        System.out.printf("Sau khi insert: %s",str1);
        str1.replace(4,7,"Xinh");
        System.out.printf("Sau khi replace %s: ",str1);
        String str4 = "Hoa Xinh";
        String [] arr = str4.toString().split("\\s");
        java.lang.StringBuilder output = new java.lang.StringBuilder();
        for(int i= arr.length-1; i>=0; i--)
        {

            output=output.append(arr[i]);
            output.append(' ');
        }

        System.out.printf(" Chuối đảo ngược là %s ",output.toString().trim());

    }
}
