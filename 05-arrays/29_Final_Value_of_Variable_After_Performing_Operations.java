// Leetcode - #2011 Final Value of Variable After Performing Operations
// Input: operations = ["--X","X++","X++"]
// Output: 1

class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') {
                X++;
            } else {
                X--;
            }
        }
        return X; 
    }
}