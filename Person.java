package SetInterface;

import java.util.HashSet;

public class Person {

    private String name;
    private int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    static HashSet<Person> p=new HashSet<>();
    public static void addPerson(Person t){
         p.add(t);
    }

    public static void checkPerson(Person m){
          
        if(p.contains(m)){
           System.out.println("Person is Present in list");
        }
        else{
            System.out.println("person is not present");
        }
    }
    
}
