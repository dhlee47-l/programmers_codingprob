#MyCode
# def solution(s):
#     answer = ''
#     ss=s.replace(' ','')
#     list_s=list(ss)
    
#     for i in range(len(list_s)):
#         if i>0:
#             if list_s[i]=='-':
#                 continue
#             elif list_s[i-1]=='-':
#                 list_s[i]=-int(list_s[i])
                
#     list_s = [item for item in list_s if item != '-']
#     answer=str(min(list_s))+" "+str(max(list_s))
#     return answer

#RightCode
def solution(s):
    int_list = [int(i) for i in s.split(" ")]
    return f"{min(int_list)} {max(int_list)}"
    return answer


