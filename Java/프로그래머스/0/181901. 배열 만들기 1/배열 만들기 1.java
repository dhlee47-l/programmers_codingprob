class Solution {
    public int[] solution(int n, int k) {
        int size=n/k;
        int[] answer = new int[size];
        //java는 0으로 시작. outOfRange 조심
        for(int i=0;i<size;i++){
            answer[i]=(i+1)*k;
        }
        return answer;
    }
}