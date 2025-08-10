// Check if any number is missing from 1 to n
// time complexity = n*n

public class A12MissingNoBru {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int flag;
        String missingNumber = "";

        for(int i=1; i<arr.length;i++){
                flag = 0;
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                missingNumber += i;
                break;
            }
        }
        System.out.println(missingNumber);
    }
}
