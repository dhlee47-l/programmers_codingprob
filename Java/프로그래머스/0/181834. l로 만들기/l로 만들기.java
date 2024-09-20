class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] c_myString=myString.toCharArray();
        for(int i=0;i<myString.length();i++){
            if(c_myString[i]<'l'){
                c_myString[i]='l';
            }
        }
        answer=new String(c_myString);
        return answer;
    }
}