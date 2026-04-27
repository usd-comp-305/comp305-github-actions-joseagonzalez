package edu.sandiego.comp305;

public final class StringUtils {

    private StringUtils(){
    }

    public static String reverseString(final String input){
        final StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
