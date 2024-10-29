import java.util.*;

class Solution {
    public long solution(long n) {
        char[] digits = Long.toString(n).toCharArray();
        Arrays.sort(digits);
        StringBuilder sortedStr = new StringBuilder(new String(digits)).reverse();
        return Long.parseLong(sortedStr.toString());
    }
}
