// Leetcode - #1773 Count Items Matching a Rule
// Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
// Output: 1

import java.util.List;
import java.util.ArrayList;

class CountMatches {
    public static void main(String[] args) {
        List<List<String>> items = List.of(List.of("phone","blue","pixel"),List.of("computer","silver","lenovo"),List.of("phone","gold","iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int itemsCount = 0;

        for(int i = 0; i < items.size(); i++) {
            if(ruleKey.equals("type")) {
                if(ruleValue.equals(items.get(i).get(0))) {
                    itemsCount++;
                } else {
                    continue;
                }
            }

            if(ruleKey.equals("color")) {
                if(ruleValue.equals(items.get(i).get(1))) {
                    itemsCount++;
                } else {
                    continue;
                }
            }

            if(ruleKey.equals("name")) {
                if(ruleValue.equals(items.get(i).get(2))) {
                    itemsCount++;
                } else {
                    continue;
                }
            }
        }
        return itemsCount;
    }
}