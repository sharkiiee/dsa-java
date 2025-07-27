// Return the union of the two sorted array.
// Time Complexity O(n1logn)+O(n2logn) 

import java.util.HashSet;

public class A09UnionBru {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        HashSet<Integer> union = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            union.add(arr[i]);
        }

        for(int i=0; i<arr2.length; i++){
            union.add(arr2[i]);
        }

        System.out.println(union);
    }
}
