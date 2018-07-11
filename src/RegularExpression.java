import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static boolean regularCheck(String checkWord) {
        Pattern checkRegExp = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher regularExpressionMatcher = checkRegExp.matcher(checkWord);
        return regularExpressionMatcher.find();
    }
}
