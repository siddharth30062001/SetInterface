package SetInterface;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class MaintainIsertionOrder {


    public static void  displayUniqueElement(List<String> list){
        LinkedHashSet<String> fruit=new LinkedHashSet<>(list);
        System.out.println(fruit);

    }
    public static void main(String[] args) {
        
        List<String> list=Arrays.asList("apple","mango", "banana","papaya","apple","mango");
        displayUniqueElement(list);
    }
    
}
