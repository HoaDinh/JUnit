package Day12;

public class Reverse {
    public String reverseString(String str)
    {
        String [] arr = str.toString().split("\\s");
        java.lang.StringBuilder output = new java.lang.StringBuilder();
        for(int i= arr.length-1; i>=0; i--)
        {

            output=output.append(arr[i]);
            output.append(' ');
        }
        return output.toString().trim();
    }
}
