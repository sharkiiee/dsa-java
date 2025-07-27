// HashSet is the one of the most important data structure.

// - It is important because of it's time complexity.
// - Constant time is used for the insertion, deletion and searching of any element in hashset.
//     i.e. O(1)


// HashSet is unordered in nature means it will store values in the unordered way.

import java.util.HashSet;
import java.util.Iterator;

public class H03HashSet {
    public static void main(String[] args) {
        // Creating hashSet
        HashSet<Integer> set = new HashSet<>();

        // To add the element in hashSet we use the add function
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // To search the element in the hashSet we use the contains function

        if(set.contains(1)){
            System.out.println("set contains one");
        }
        if(!set.contains(6)){{
            System.out.println("Do not contain 6");
        }}

        // To delete the element from the hashset we use the remove function

        set.remove(2);
        if(!set.contains(2)){
            System.out.println("2 is not present in the hashset");
        }

        // Checking the size of the hashSet
        System.out.println("Size of the hash set is " + set.size() );

        // Printing all the elements of the hashSet

        System.out.println(set);

        // Iterator the hashset

        Iterator it = set.iterator();
        
        // Two main function of the Iterator : 1. hasNext 2. next
        //it.hasNext --- return true or false on the basis of next value is present or not.
        // it.next --- will give you next value - null - 1 - 2 - 3

        //example

        while(it.hasNext()){
            System.out.print(it.next());
        }

    }
}
