package TestLesson;
public class ChangeCharacter {
    public String changeUppercase(String str) {
        String [] arr = str.toString().split(" ");
        java.lang.StringBuilder output = new java.lang.StringBuilder();

        for(int i=0; i <arr.length; i++)
        {
            output.append(arr[i].replace(String.valueOf(arr[i].charAt(0)), String.valueOf(arr[i].charAt(0)).toUpperCase()));
            output.append(" ");

        }

        return output.substring(0,output.length()-1).trim();
    }
    public static String uppercase(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if ( chars[i]=='.' || chars[i]=='\'') { // You can add other chars here
                found = false;
            }
        }
        return String.valueOf(chars);

    }


}


