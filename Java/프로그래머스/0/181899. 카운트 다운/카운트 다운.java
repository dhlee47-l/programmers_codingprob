class Solution {
    public int[] solution(int start_num, int end_num) {
        int answer_length=start_num-end_num+1;
        int[] answer = new int[answer_length];
        // for(int i=start_num;i>=end_num;i--){
        //     answer[i]=i;
        // }
        // return answer;
        /*
        배열 인덱싱:
        Java에서 배열의 인덱스는 0부터 시작하여 array.length - 1까지 이어집니다. 만약 배열의 범위를 넘         어서는 인덱스(음수 또는 array.length - 1보다 큰 인덱스)에 접근하려고 하면 ArrayIndexOutOfB          oundsException이 발생합니다.

        원래 코드의 문제:
        원래 코드에서는 i (이 값은 start_num에서 end_num까지의 범위)를 배열 answer의 인덱스로 직접           사용했습니다. 예를 들어, start_num이 10이고 end_num이 5일 때, answer 배열의 길이는 6입니다.         answer 배열의 유효한 인덱스는 0부터 5까지입니다. 만약 10이나 9와 같은 인덱스를 사용하려고 하면,         배열의 범위를 초과하게 되어 ArrayIndexOutOfBoundsException이 발생합니다.
            
        */
        for(int i=0;i<answer.length;i++){
            answer[i]=start_num-i;
        }
        return answer;
    }
}