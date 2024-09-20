class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char [] c_myString=myString.toCharArray();
        for(int i=0;i<c_myString.length;i++){
            if (c_myString[i]=='A'){
                c_myString[i]='B';
            }
            else{
                c_myString[i]='A';
            }
        }
        
        String new_myString=new String(c_myString);
        
        if (new_myString.contains(pat)){
            answer=1;
        }
        
        return answer;
    }
}