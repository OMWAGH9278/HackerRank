import java.util.regex.*;

public class Problem47 
{
    public static void main(String a[]) 
    {
        String input = "The quick brown fox jumps over the lazy dog.";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
}
    }
}
