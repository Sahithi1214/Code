class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder string = new StringBuilder("");
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                string.append(Character.toLowerCase(ch));
            }
        }
        String initialString = string.toString();
        String reverseString = string.reverse().toString();
        
        return (initialString.equals(reverseString));
    }
}