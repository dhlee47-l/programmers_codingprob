class Solution {
    public long solution(long n) {
        long answer = -1;
        double sqrt=Math.sqrt(n);
        if(sqrt==(long)sqrt){
            long m=(long)sqrt+1;
            answer=m*m;
        }
        return answer;
    }
}