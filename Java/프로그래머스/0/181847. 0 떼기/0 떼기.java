class Solution {
    public String solution(String n_str) {
        String answer="0";
        for(int i=0;i<n_str.length();i++){
            if (n_str.charAt(i)!='0'){
                //charAt() 잊지 말기
                answer = n_str.substring(i);
                break;
            }
        }
        return answer;
    }
}