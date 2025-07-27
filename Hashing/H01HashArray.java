// If there is the problem that require number hashing we will use hash array.
/*
 * 1. We give the size to our hash array - remembering that there is difference with you declare or create hash locally and globally.
 * --- For int locally --- 10 to the power  6 in global 10 to the power 7.
 * --- For boolean locally --- 10 ro the power 7 and globally  10 to the power 8.
 * 2. we will increase the value as it appears in its location.
 * 3. As per the or and the location are same we will output how many times it was present.
 */

import java.util.Arrays;

public class H01HashArray {
    public static void main(String[] args) {
        int[] numbers = {1,3,2,1,3};
        int[] findingNo = {1,4,2,3,12};

        int[] hash = new int[13];
        int[] newArr = new int[findingNo.length];

        for(int i=0;i<numbers.length; i++){
            hash[numbers[i]] += 1;
        }

        for(int i=0; i<newArr.length; i++){
            newArr[i] = hash[findingNo[i]];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
