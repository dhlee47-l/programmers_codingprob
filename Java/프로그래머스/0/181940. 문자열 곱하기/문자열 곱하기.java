class Solution {
    public String solution(String my_string, int k) {
        StringBuilder answer=new StringBuilder();
        int i=0;
        while(i<k){
            answer.append(my_string);
            i++;
        }
        return answer.toString();
    }
}