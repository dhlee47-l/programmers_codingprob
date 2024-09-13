class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pnum=0;
        int ynum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P'){
                //charAt(i)
                pnum+=1;
            }
            else if(s.charAt(i)=='y' || s.charAt(i)=='Y'){
                ynum+=1;
            }
        }
        
        if(pnum!=ynum){
            answer=false;
        }
        return answer;
    }
}