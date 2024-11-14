class Solution {
    public String solution(int n) {

        String answer = "수박".repeat((n + 1) / 2);
        return answer.substring(0, n);
    }
}