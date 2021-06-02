package Day11;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Checkemail {
    //private static final String regex = "^(.+)@(.+)$";
    private static final String regex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
    public boolean checkEmail(String email){
        Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\"", Pattern.CASE_INSENSITIVE);

        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        //Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        boolean check=false;
       // Matcher matcher = pattern.matcher(email);
        check = matcher.find();
        System.out.println(check);
        return check;
    }

}
