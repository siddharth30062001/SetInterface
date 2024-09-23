package SetInterface;
import java.util.*;

public class FirstNonDupicateElement {


    // Method to find the first non-duplicate element
    public static Integer findFirstNonDuplicate(List<Integer> list) {
        // LinkedHashSet to maintain order and track unique elements
        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();
        
        // HashSet to track duplicates
        Set<Integer> duplicates = new HashSet<>();
        
        
        for (Integer num : list) {
            if (!duplicates.contains(num)) {
                if (!uniqueElements.contains(num)) {
                    uniqueElements.add(num);
                } else {
                    uniqueElements.remove(num); 
                    duplicates.add(num); 
                }
            }
        }
        
       
        return uniqueElements.isEmpty() ? null : uniqueElements.iterator().next();
    }

    public static void main(String[] args) {
        
        List<Integer> inputList = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        
        // Find the first non-duplicate element
        Integer result = findFirstNonDuplicate(inputList);
        
        
        System.out.println("First non-duplicate element: " + result);
    }
}

    

