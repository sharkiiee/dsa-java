
import java.util.ArrayList;

//program of finding intersection of elements from the two sorted array

public class A11IntersectionOpt {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,4,5,6};
        int[] b = {2,3,3,5,6,6,7};

        int i=0;
        int j=0;

        ArrayList<Integer> ans = new ArrayList<>();

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }else if(b[j] < a[i]){
                j++;
            }
            else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}
