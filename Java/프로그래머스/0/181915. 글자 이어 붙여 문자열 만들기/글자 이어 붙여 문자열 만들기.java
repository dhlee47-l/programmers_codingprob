class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        //StringBuilder:
        for(int i=0;i<index_list.length;i++){
            answer.append(my_string.charAt(index_list[i]));
            //charAt():
        }
        return answer.toString();
    }
}