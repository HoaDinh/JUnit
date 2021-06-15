package TestLesson;

public class FindUppercaseCharacter {
   /* public static void main (String [] args )
    {
        FindUppercaseCharacter find = new FindUppercaseCharacter();

       /// System.out.printf("Số ký tự viết hoa trong chuỗi là: %d" ,find.findUppercaseCharacter());
    }*/
    public int findUppercaseCharacter(String str)
    {
         //str ="You Only Live Once. But if You do it right. once is Enough";

        int count =0;
        for(int i=0; i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                count++;
            }
        }return count;
    }


}
