class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list[num_list.length-1];
        int sec_last = num_list[num_list.length-2];
        int k=last-sec_last;
        
        if(last<=sec_last){
            k=2*last;
        }
        
        int[] answer = new int[num_list.length+1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        //arraycopy();
        //Java는 문자열에 += 안됨.
        //새로운 문자열을 만들어 기존의 문자열을 copy한 것.
        answer[num_list.length]=k;
        
        return answer;
    }
}