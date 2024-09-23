import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] myStringArr=myString.split("x");
        int length = myStringArr.length;
        int[] answer = new int[length + (myString.endsWith("x") ? 1 : 0)];
        
        for(int i=0;i<myStringArr.length;i++){
            answer[i]=myStringArr[i].length();
        }
        if (myString.endsWith("x")) {
            answer[length] = 0;
        }
        
        return answer;
    }
}