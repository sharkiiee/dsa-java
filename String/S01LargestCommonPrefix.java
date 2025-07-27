package String;

import java.util.Arrays;

// Input: strs = ["flower","flow","flight"]
// Output: "fl"

public class S01LargestCommonPrefix {
     public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String ans = "";
        Arrays.sort(strs);
        for(int i=0; i<Math.min(strs[0].length(),strs[strs.length -1].length()); i++){
            if(strs[0].charAt(i) == strs[strs.length - 1].charAt(i)){
                ans += strs[0].charAt(i);
            }else{
                break;
            }
        }
        System.out.println(ans);
    }
}
