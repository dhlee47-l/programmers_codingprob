class Solution {
    public String solution(String my_string, int n) {
        int length=my_string.length();
        //length()
        String answer =my_string.substring(length-n,length);
        return answer;
    }
}