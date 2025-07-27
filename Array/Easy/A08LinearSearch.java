public class A08LinearSearch {
    public static void main(String[] args) {
        int target = 9;
        int f = -1;
        int[] nums = {2,5,3,46,3,23,4,2,5,67,9,8,7};
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                f = i;
                break;
            }
        }

        if(f==-1){
            System.out.println("Element Not Found");
        }else{
            System.out.println("Element found at index : " + f);
        }
    }
}
