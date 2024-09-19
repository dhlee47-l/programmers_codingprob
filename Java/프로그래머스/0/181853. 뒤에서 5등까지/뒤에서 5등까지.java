import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int length = 5;
        int[] answer = new int[length];

        System.arraycopy(num_list, 0, answer, 0, length);
        
        return answer;
    }
}
