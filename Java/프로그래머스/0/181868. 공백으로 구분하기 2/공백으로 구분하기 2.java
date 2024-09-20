import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {

        String[] answer={};
        answer = my_string.split(" ");
        
        return Arrays.stream(answer)
                     .filter(s -> !s.isEmpty())
                     .toArray(String[]::new);
        //stream
    }
}
