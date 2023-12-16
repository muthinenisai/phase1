package practice_project_10;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {
        // Example 1: Matching a specific pattern in a string
        String text1 = "The quick brown fox jumps over the lazy dog.";
        String pattern1 = "fox";

        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(text1);

        System.out.println("Example 1:");
        System.out.println("Does the string contain 'fox'? " + m1.find());
        System.out.println();

        // Example 2: Matching a pattern with quantifiers
        String text2 = "aaaaabbbbcccc";
        String pattern2 = "a+b+";

        Pattern p2 = Pattern.compile(pattern2);
        Matcher m2 = p2.matcher(text2);

        System.out.println("Example 2:");
        System.out.println("Does the string match the pattern 'a+b+c+'? " + m2.matches());
        System.out.println();

        // Example 3: Extracting groups from a string
        String text3 = "John,25;Alice,30;Bob,28";
        String pattern3 = "(\\w+),(\\d+);";

        Pattern p3 = Pattern.compile(pattern3);
        Matcher m3 = p3.matcher(text3);

        System.out.println("Example 3:");
        while (m3.find()) {
            System.out.println("Name: " + m3.group(1) + ", Age: " + m3.group(2));
        }
    }
}
