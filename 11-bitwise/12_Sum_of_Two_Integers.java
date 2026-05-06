// Leetcode - #371 Sum of Two Integers
// Input: a = 1, b = 2
// Output: 3

class SumWithoutSymbol {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(getSum(a, b));
    }

    public static int getSum(int a, int b) {
        while(b != 0) {
            int carry = a&b;

            a = a ^ b;

            b = carry << 1;
        }
        return a;
    }
}