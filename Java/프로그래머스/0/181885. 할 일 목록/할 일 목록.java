import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        ArrayList<String> list = new ArrayList<>();
        //String[] answer 초기화: 배열을 직접 초기화하는 대신 ArrayList<String>을 사용하여 동적으로 결과를 저장
        for(int i=0;i<todo_list.length;i++){
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }
        String[] answer = new String[list.size()];
        return list.toArray(answer);
    }
}