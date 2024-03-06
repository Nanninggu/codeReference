package com.reference.codereference.parsing.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void regularExpressions() {
        String data = "apple,banana,orange";

        // Using Regular Expressions
        System.out.println("\nUsing Regular Expressions:");
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            System.out.println("RegularExpressions " + matcher.group());
        }
    }

}
