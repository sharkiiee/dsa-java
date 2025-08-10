
import java.util.ArrayList;

public class A11IntersectionBru {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};
        int[] vis = new int[arr2.length];
        
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr[i] == arr2[j] && vis[j] == 0){
                    ans.add(arr[i]);
                    vis[i] = 1;
                    break;
                }

                if(arr2[j] > arr[i]) break;
            }
        }

        System.out.println(ans);
    }
}
