import java.util.Arrays; 
class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] bA=binomial.split(" ");
        if (bA[1].equals("+")) {
            answer = Integer.parseInt(bA[0]) + Integer.parseInt(bA[2]);
        }
        else if (bA[1].equals("-")) {
            answer = Integer.parseInt(bA[0]) - Integer.parseInt(bA[2]);
        }
        else{
            answer = Integer.parseInt(bA[0]) * Integer.parseInt(bA[2]);
        }
        return answer;
    }
}