// time Complexity = 1;

public class A12MissingNoBet {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int[] hash = new int[arr.length+1];
        int missingNumber = -1;
        for(int i=0; i<arr.length-1; i++){
            hash[arr[i]] = 1;
        }

        for(int i=0;i<hash.length; i++){
            if(hash[i]==0){
                missingNumber = i;
            }
        }

        System.out.println(missingNumber);
    }
}
