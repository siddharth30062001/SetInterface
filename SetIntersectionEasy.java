package SetInterface;

import java.util.*;

public class SetIntersectionEasy {
    // Method to find intersection of multiple sets
    public static Set<Integer> findIntersection(List<Set<Integer>> sets) {
        if (sets == null || sets.isEmpty()) {
            return new HashSet<>();
        }

        // Start with the first set
        Set<Integer> intersection = new HashSet<>(sets.get(0));

        // Retain common elements with all other sets
        for (Set<Integer> set : sets) {
            intersection.retainAll(set);
        }

        return intersection;
    }

    public static void main(String[] args) {
        // Example input
        List<Set<Integer>> sets = Arrays.asList(
            new HashSet<>(Arrays.asList(1, 2, 3, 4)),
            new HashSet<>(Arrays.asList(2, 3, 4)),
            new HashSet<>(Arrays.asList(3, 4, 5))
        );

        // Find intersection
        Set<Integer> intersection = findIntersection(sets);
        System.out.println("Intersection: " + intersection); 
    }
}
