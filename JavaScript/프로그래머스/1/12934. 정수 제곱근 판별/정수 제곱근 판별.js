function solution(n) {
    var answer = -1;
    if(Number.isInteger(Math.sqrt(n))){
        answer=(Math.sqrt(n)+1)*(Math.sqrt(n)+1);
    };
    return answer;
}