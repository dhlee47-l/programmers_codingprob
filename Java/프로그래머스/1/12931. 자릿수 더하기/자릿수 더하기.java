import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        
        for (char i : str.toCharArray()) {
            answer += i - '0';
        }
        
        return answer;
    }
}
