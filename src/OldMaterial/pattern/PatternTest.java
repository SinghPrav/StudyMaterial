package OldMaterial.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        String data = "|1300|_|2000|";
        Pattern pattern = Pattern.compile("\\|(\\d+)\\|_\\|(\\d+)\\|");
        Matcher matcher = pattern.matcher(data);

        if (matcher.find()) {
            System.out.println("First number: " + matcher.group(1));
            System.out.println("Second number: " + matcher.group(2));
        } else {
            System.out.println("No match found");
        }

        String input = "|1300|_|2000|";

        String[] parts = input.split("\\|");

        for (String part : parts) {
            System.out.println(part);
        }
    }
}
