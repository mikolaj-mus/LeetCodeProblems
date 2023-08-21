import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean isPalindrome(String s) {

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(s);

        char[] list = matcher.replaceAll("").toLowerCase().toCharArray();
        char[] arr = new char[list.length];
        int j = 0;

        if (list.length == 0) {
            return true;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = list[j];
            j++;
        }

        return Arrays.equals(list, arr);
    }
}