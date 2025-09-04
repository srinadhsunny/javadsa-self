
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        return words[words.length-1].length();
        
    }
}
///optimimzed code
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int length = 0;

        // traverse from end
        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                length++;       // count letters
            } else if (length > 0) {
                break;          // stop once last word ends
            }
            i--;
        }

        return length;
    }
}
