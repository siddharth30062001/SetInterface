package SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SetSubsetOperation {

    public static void checkSubset(List<Integer> l1,List<Integer> l2){
        HashSet<Integer> list1=new HashSet<>(l1);
        HashSet<Integer> list2=new HashSet<>(l2);
        System.out.println(list1);
        System.out.println(list2);

        if(list2.containsAll(list1)){
            System.out.println("subset");
        }
        else{
            System.out.println("not subset");
        }
    }
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(1,23,4,5);
        List<Integer> l2=Arrays.asList(1,0,4,5,23);
        checkSubset(l1,l2);
    }
    
}
