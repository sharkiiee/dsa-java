public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,23,34,35,55,66,99,100};
        int target = 23;
        int low = 0;
        int high = arr.length - 1;
        int flag = 0;

        while(low<=high){
            int mid  = (low + high)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                flag = 1;
                break;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        if(flag == 0){
            System.out.println("Element is not found");
        }
    }
}
