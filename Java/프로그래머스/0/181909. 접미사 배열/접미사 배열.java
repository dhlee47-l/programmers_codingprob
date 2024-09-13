//내 풀이:
//import java.util.Arrays;
// class Solution {
//     public String[] solution(String my_string) {
//         int n = my_string.length();
//         String[] answer = new String [n];
//         String my_reversed = new StringBuilder(my_string).reverse().toString();
//         //StringBuilder()
//         //reverse().toString();
        
//         for(int i=0;i<n;i++){
//             String substring=my_reversed.substring(0,i+1);
//             answer[i] = new StringBuilder(substring).reverse().toString();
//         }
        
//         Arrays.sort(answer);
//         return answer;
//     }
// }


//다른 사람 풀이:
import java.util.Arrays;

class Solution {

    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_string.substring(i, my_string.length());
        }

        Arrays.sort(answer);
        return answer;
    }
}