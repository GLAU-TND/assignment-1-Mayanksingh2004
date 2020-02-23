package inputManager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {
    public boolean contactNumber(long number) {
        String pattern = "^(91|0)?[1-9][0-9]{9}$";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(String.valueOf(number));
        return matcher.matches();
    }

    public boolean emailAddress(String email) {
        String pattern = "[a-zA-z][a-zA-Z0-9_.]*@[a-zA-z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(email);
        return matcher.matches();

    }
}
