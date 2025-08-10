public class A12MissingNoOpt1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = arr.length + 1;
        int sum = n * (n+1) / 2;

        int s2 = 0;

        for(int i=0; i<n-1; i++){
            s2 += arr[i];
        }

        int missingNo = sum - s2;
        System.out.println(missingNo);
    }
}
