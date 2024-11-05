def solution(s):
    k = 0
    
    for char in s:
        if char == '(':
            k += 1
        elif char == ')':
            k -= 1
            # If k goes negative, there are unmatched closing parentheses
            if k < 0:
                return False
    
    # If k is zero, parentheses are balanced; otherwise, they're not
    return k == 0
