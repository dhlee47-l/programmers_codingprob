//내 방식
// import java.util.Arrays;

// class Solution {
//     public boolean solution(String[] phone_book) {
//         boolean answer = true;
        
//         StringBuilder phone=new StringBuilder();
        
//         for(int i=0;i<phone_book.length;i++){
//             phone.append(phone_book[i]);
//         }
        
//         for(int i=0;i<phone_book.length;i++){
//             String stringToRemove = phone_book[i];
//             int startIndex = phone.indexOf(stringToRemove);
//             int endIndex = startIndex + stringToRemove.length();
            
//             String phone_deleted=(phone.delete(startIndex, endIndex)).toString();
            
//             if (phone_deleted.contains(phone_book[i])){
//                 answer=false;
//                 break;
//             }
//         }
        
//         return answer;
//     }
// }

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        // Step 1: Sort the phone book
        Arrays.sort(phone_book);

        // Step 2: Check each phone number with the next one
        for (int i = 0; i < phone_book.length - 1; i++) {
            // Check if the current number is a prefix of the next number
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false; // Found a prefix
            }
        }

        return true; // No prefixes found
    }
}
