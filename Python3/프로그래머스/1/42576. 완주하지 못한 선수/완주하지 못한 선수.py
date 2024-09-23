#Hash 함수
def solution(participant, completion):
    participant_dict={}
    
    for person in participant:
        if person in participant_dict:
            participant_dict[person]+=1
        else:
            participant_dict[person]=1
            
    for person in completion:
        if person in participant_dict:
            participant_dict[person]-=1
            
    for person, count in participant_dict.items():
        if count>0:            
            return person

#Sorting을 이용한 방법
# def solution(participant, completion):
#     participant.sort()
#     completion.sort()
#     for i in range(len(completion)):
#         if participant[i] != completion[i]:
#             return participant[i]
#     return participant[-1]

#Collection 이용한 방법
# from collections import Counter
# def solution(participant, completion):
#     answer=Counter(participant)-Counter(completion)
#     return list(answer.keys())[0]
