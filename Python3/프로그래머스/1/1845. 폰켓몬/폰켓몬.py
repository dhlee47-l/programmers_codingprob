def solution(nums):
    answer = 0
    picked=len(nums)//2
    kind=len(list(set(nums)))
    print(picked)
    for i in range(picked):
        if kind>picked:
            answer=picked
            break
        else:
            if picked==kind:
                answer=picked
                break
            else:
                picked-=1
        
    
    return answer