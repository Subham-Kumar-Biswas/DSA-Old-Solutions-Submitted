// Leetcode - #1436 Destination City
// Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
// Output: "Sao Paulo" 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class DestCity {
    public static void main(String[] args) {
        List<List<String>> testPaths = new ArrayList<>();

        testPaths.add(Arrays.asList("London", "New York"));
        testPaths.add(Arrays.asList("New York", "Lima"));
        testPaths.add(Arrays.asList("Lima", "Sao Paulo"));

        String destination = destCity(testPaths);
        System.out.println("The destination city is: " + destination);
    }

    public static String destCity(List<List<String>> paths) {
        Set<String> newSet = new HashSet<>();
        for(List<String> path : paths) {
            newSet.add(path.get(0));
        }
        for(List<String> path : paths) {
            String candidate = path.get(1);
            if(newSet.contains(candidate)) {
                continue;
            } else {
                return candidate;
            }
        }
        return "";
    }
}