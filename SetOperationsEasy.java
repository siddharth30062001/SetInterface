package SetInterface;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class PersonTreeSet implements Comparable<PersonTreeSet> {
    String name;
    int age;

    // Constructor
    public PersonTreeSet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Compare by name first then age
    @Override
    public int compareTo(PersonTreeSet other) {
        int nameComparison = this.name.compareTo(other.name);
        return (nameComparison != 0) ? nameComparison : Integer.compare(this.age, other.age);
    }

    // toString for easy printing
    @Override
    public String toString() {
        return "Person(" + name + ", " + age + ")";
    }
}

public class SetOperationsEasy {

    // Union of two sets
    public static Set<PersonTreeSet> union(Set<PersonTreeSet> set1, Set<PersonTreeSet> set2) {
        Set<PersonTreeSet> result = new TreeSet<>(set1);
        result.addAll(set2);
        return result;
    }

    // Difference of two sets
    public static Set<PersonTreeSet> difference(Set<PersonTreeSet> set1, Set<PersonTreeSet> set2) {
        Set<PersonTreeSet> result = new TreeSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<PersonTreeSet> set1 = new TreeSet<>(Arrays.asList(
            new PersonTreeSet("Alice", 30),
            new PersonTreeSet("Bob", 25)
        ));

        Set<PersonTreeSet> set2 = new TreeSet<>(Arrays.asList(
            new PersonTreeSet("Bob", 25),
            new PersonTreeSet("Charlie", 35)
        ));

        // Union
        Set<PersonTreeSet> unionSet = union(set1, set2);
        System.out.println("Union: " + unionSet);  

        // Difference
        Set<PersonTreeSet> differenceSet = difference(set1, set2);
        System.out.println("Difference: " + differenceSet); 
    }
    
}
