
import java.util.ArrayList;

// Union of two sorted array
// Using two pointer approach
// Time Complexity : O(n1+n2)
public class A10UnionOpt {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};

        ArrayList<Integer> li = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < arr.length && j < arr2.length) {
            if (arr[i] <= arr2[j]) {
                if (li.isEmpty() || li.get(li.size() - 1) != arr[i]) {
                    li.add(arr[i]);
                }
                i++;
            } else {
                if (li.isEmpty() || li.get(li.size() - 1) != arr2[j]) {
                    li.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr.length) {
            if (li.isEmpty() || li.get(li.size() - 1) != arr[i]) {
                li.add(arr[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (li.isEmpty() || li.get(li.size() - 1) != arr2[j]) {
                li.add(arr2[j]);
            }
            j++;
        }

        System.out.println(li);
    }
}
