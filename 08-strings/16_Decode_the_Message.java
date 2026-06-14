// Leetcode - #2325 Decode the Message
// Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
// Output: "this is a secret"

class DecodedMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key, message));
    }

    public static String decodeMessage(String key, String message) {
        int[] mapping = new int[26];
        for(int i = 0; i < 26; i++){
            mapping[i] = -1;
        }
 
        int characterCounter = 0;

        for(int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ') {
                continue;
            }

            if (mapping[(key.charAt(i) - 'a')] == -1) {
                mapping[(key.charAt(i) - 'a')] = characterCounter;
                characterCounter++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                sb.append(" ");
            } else {
                int decodedOffset = mapping[message.charAt(i) - 'a'];
                char decodedChar = (char) ('a' + decodedOffset);
                sb.append(decodedChar);
            }
        }

        return sb.toString();
    }
}