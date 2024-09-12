class Solution {
    public int solution(int n, String control) {
        for(int i=0;i<control.length();i++){
            char command = control.charAt(i);
            //charAt();
            if (command=='w'){
                n+=1;
            }
            if (command=='s'){
                n-=1;
            }
            if (command=='d'){
                n+=10;
            }
            if (command=='a'){
                n-=10;
            }
        }
        return n;
    }
}