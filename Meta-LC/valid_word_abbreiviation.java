class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        while(i < word.length() && j < abbr.length()){
            char c = abbr.charAt(j);

            if(Character.isLetter(c)){
                if(i >= word.length() || word.charAt(i) != c) return false;
                i++;
                j++;
            }else if(Character.isDigit(c)){
                if(c == '0') return false;

                int num = 0;
                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))){
                    num = num * 10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i += num;
            }else{
                return false;
            }
        }
        return i == word.length() && j == abbr.length();
    }
}