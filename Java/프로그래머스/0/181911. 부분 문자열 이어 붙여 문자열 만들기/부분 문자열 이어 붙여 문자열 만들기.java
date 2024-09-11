class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int j=0;j<my_strings.length;j++){
            //length: for Arrays / length(): for Strings
            for(int i=0;i<parts.length;i++){
                if(i==j){
                    answer+=my_strings[j].substring(parts[i][0], parts[i][1]+1);
                }
            }
        }
        return answer;
    }
}