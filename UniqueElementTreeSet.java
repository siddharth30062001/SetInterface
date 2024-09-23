package SetInterface;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class UniqueElementTreeSet {

    public static void displayUniqueSortedElement(List<Integer> list){
        TreeSet<Integer> t=new TreeSet<>(list);
        System.out.println(t);
    }
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(3,4,6,9,2,4,10);
        displayUniqueSortedElement(list);
    }
    
}
