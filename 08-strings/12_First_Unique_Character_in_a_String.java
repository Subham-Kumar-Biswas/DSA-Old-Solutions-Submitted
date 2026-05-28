// Leetcode - #387 First Unique Character in a String
// Input: s = "leetcode"
// Output: 0

class FirstUniqChar {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    
    

    public static int firstUniqChar(String s) {
        int[] frequency = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequency[c - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(frequency[c - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}