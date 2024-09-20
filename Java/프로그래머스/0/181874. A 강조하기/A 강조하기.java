class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        String new_myString = myString.toLowerCase();
        
        for (int i = 0; i < new_myString.length(); i++) {
            char currentChar = new_myString.charAt(i);
            if (currentChar == 'a') {
                answer.append('A'); 
            } else {
                answer.append(currentChar);
            }
        }
        
        return answer.toString();
    }
}
