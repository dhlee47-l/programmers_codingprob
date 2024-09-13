def solution(s):
    answer = True
    pnum=0
    ynum=0
    # initialize before using
    
    for i in s:
        if i.lower()=='p':
            #lower()
            pnum+=1
        elif i.lower()=='y':
            ynum+=1
            
    if pnum!=ynum:
        answer=False
    return answer