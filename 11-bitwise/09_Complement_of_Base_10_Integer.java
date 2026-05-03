// Leetcode - #1009 Complement of Base 10 Integer
// Input: n = 5
// Output: 2

class ComplementBits {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(bitwiseComplement(n));
    }

    public static int bitwiseComplement(int n) {
        if(n == 0) return 1;
        
        int mask = 0;
        int temp = n;

        while(temp != 0) {
            mask = (mask << 1) |1;
            temp >>= 1;
        }

        int res = mask ^ n;
        return res;
    }
}