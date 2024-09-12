class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aString = a + "";
        String bString = b + "";
        String first=aString+bString;
        String sec=bString+aString;
        
        int numFirst = Integer.parseInt(first);
        int numSec = Integer.parseInt(sec);
        
        if(numFirst>numSec){
            answer=numFirst;
        }else{
            answer=numSec;
        }
        
        return answer;
    }
}