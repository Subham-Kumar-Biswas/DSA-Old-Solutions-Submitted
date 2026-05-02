// Leetcode - #693 Binary Number with Alternating Bits
// Input: n = 5
// Output: true

class AlternateBits {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(hasAlternatingBits(n));
    }

    public static boolean hasAlternatingBits(int n) {
        int previous = n >>> 1;

        while(previous > 0) {
            if((previous&1) == (n&1)) {
                return false;
            }
            previous >>>= 1;
            n >>>= 1;
        }
        return true;
        
    }
}