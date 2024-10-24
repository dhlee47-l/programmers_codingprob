function solution(s) {
    let pnum = 0;
    let ynum = 0;

    Array.from(s.toLowerCase()).forEach(e => {
        if (e === 'p') pnum++;
        if (e === 'y') ynum++;
    });

    return pnum === ynum;
}
