package Day12;

public class CheckName {

    public String checkName (String name)
    {

        String [] arr = name.toString().split(" ");
        java.lang.StringBuilder output = new java.lang.StringBuilder();
        String str="";
        for(int i=0; i <arr.length; i++)
        {


            output.append(arr[i].replace(String.valueOf(arr[i].charAt(0)), String.valueOf(arr[i].charAt(0)).toUpperCase()));
            output.append("_");

        }

       return output.substring(0,output.length()-1).trim();


    }
}
