package SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetBehaviour {

     public static void demonstrateSetBehavior(List<Integer> list) {
        // HashSet: No specific ordering
        Set<Integer> hashSet = new HashSet<>(list);
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet: Maintains insertion order
        Set<Integer> linkedHashSet = new LinkedHashSet<>(list);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet: Maintains natural sorted order (ascending)
        Set<Integer> treeSet = new TreeSet<>(list);
        System.out.println("TreeSet: " + treeSet);
    }

    public static void main(String[] args) {
        
          List<Integer> inputList = Arrays.asList(5, 3, 5, 1, 2, 9, 8, 9 );
        
        // Demonstrate set behavior
        demonstrateSetBehavior(inputList);
    }
    
}