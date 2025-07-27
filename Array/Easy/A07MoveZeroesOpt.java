// Move zeroes to end

// Uses a two pointer approach
// Time Complexity : = O(n) + O{n-n} = O(n);
import java.util.Arrays;

public class A07MoveZeroesOpt {
    public static void main(String[] args) {
        int[] nums = {1,0,2,3,2,0,0,4,5,1};

        int pointerToZero = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                pointerToZero = i;
                break;
            }
        }

        //If find there is no zero in our program
        if (pointerToZero == -1){
            System.out.println(Arrays.toString(nums));
        }else{
            
        for(int i=pointerToZero+1; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[pointerToZero];
                nums[pointerToZero] = temp;
                pointerToZero++;
            }
        }

        System.out.println(Arrays.toString(nums));
        }
    }
}
