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
}
