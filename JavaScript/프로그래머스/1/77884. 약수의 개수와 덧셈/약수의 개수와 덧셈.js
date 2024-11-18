function solution(left, right) {
    return Array.from({ length: right - left + 1 }, (_, i) => left + i)
        .reduce((acc, num) => acc + (Number.isInteger(Math.sqrt(num)) ? -num : num), 0);
}