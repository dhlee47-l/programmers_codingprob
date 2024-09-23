class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] front = new int [n];
        int[] back = new int[num_list.length-n];
        
        for(int i=0;i<n;i++){
            front[i]=num_list[i];
        }
        
        for(int j=n;j<num_list.length;j++){
            back[j-n]=num_list[j];
        }
        
        int[] answer = new int[num_list.length];
        
        System.arraycopy(back,0,answer,0,back.length);
        System.arraycopy(front, 0,answer,back.length,front.length);
        
        return answer;
    }
}