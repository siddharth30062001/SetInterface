package SetInterface;

public class Main {

    public static void main(String[] args) {
        Person p1=new Person("Amit", 20);
        Person p2=new Person("Sumit", 23);
        Person.addPerson(p1);
        Person.checkPerson(p2);
    
    }
    
}
