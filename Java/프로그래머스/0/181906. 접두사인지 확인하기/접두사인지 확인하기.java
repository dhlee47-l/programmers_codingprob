def solution(my_string, is_prefix):
    answer = 0
    str_array=[]
    for i in range(len(my_string)):
        str_array.append(my_string[:i])
    if is_prefix in str_array:
        answer=1
    else:
        answer=0
    return answer