package SetInterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveElementCon {

    public static void removeElement(TreeSet<Integer> li,int n){

        if(li.contains(n)){
        Iterator<Integer> iterator=li.iterator();
        while(iterator.hasNext()){
            Integer m=iterator.next();
            if(m<n){
                iterator.remove();
            }
        }
    }else{
        System.out.println("Element not present");
    }
    

    }
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(set);
        removeElement(set,n);
        System.out.println(set);
    }
    
}
