// Program of the moving zeroes

// NOTE :- Out brute force can  be that we take the temp array and store all the non-zeroes in it and then we put those non-zeroes at front and zeroes at end.

// The second brute force method we did is using 2 pointer approach but We are using a extra for loop to put the zeroes at the last if present any.


import java.util.Arrays;

public class A07MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1,0,2,3,2,0,0,4,5,1};
        int pointer = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        for(int i=pointer; i< nums.length; i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
