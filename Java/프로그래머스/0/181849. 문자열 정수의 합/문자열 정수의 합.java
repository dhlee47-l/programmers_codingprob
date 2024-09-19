class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char [] num_array = num_str.toCharArray();
        for(char i:num_array){
            answer+=Character.getNumericValue(i);
            // Character.isDigit(char ch): Checks if the character is a digit.
            // Character.isLetter(char ch): Checks if the character is a letter.
            // Character.toUpperCase(char ch): Converts the character to uppercase.
            // Character.toLowerCase(char ch): Converts the character to lowercase.

        }
        return answer;
    }
}