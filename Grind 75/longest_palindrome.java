class Solution {
    public int longestPalindrome(String s) {
        //all even + 1 odd
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
                count = count + 2;
            }else{
                set.add(ch);
            }
        }
        if(!set.isEmpty()){
            count += 1;
        }

        return count;
    }
}