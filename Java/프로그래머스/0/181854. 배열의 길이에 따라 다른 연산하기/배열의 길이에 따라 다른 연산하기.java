class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        int k = arr.length;
        if(k%2==0){
            for(int i=0;i<k;i++){
                if(i%2==1){
                    arr[i]+=n;
                }   
            }
        }
        else{
            for(int i=0;i<k;i++){
                if(i%2==0){
                    arr[i]+=n;
                }
            }
        }
        return answer;
    }
}