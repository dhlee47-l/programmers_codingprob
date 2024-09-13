import java.util.ArrayList;
import java.util.List;
//List<Integer> resultList = new ArrayList<>();

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> resultList = new ArrayList<>();
        for(int i:arr){
            boolean toDelete = false;
            
            for(int j:delete_list){
                if (i == j) {
                    toDelete = true;
                    break;
                }
                
            }
            if (!toDelete) {
                    resultList.add(i);
                }
            
        }
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}