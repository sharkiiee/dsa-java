// chech if any number is missing between 1 - n


// NOTE :- Here the solution is still wrong

public class A12MissingNoOpt {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int xor1 = 0;
        int xor2 = 0;
        int missingNumber;

        for(int i=0; i<arr.length-1; i++){
            xor2 = xor2  ^ arr.length;
            xor1 = xor1 ^ (i+1);
        }

        xor1 = xor1 ^ arr.length;
        missingNumber = xor1 ^ xor2;

        System.out.println(missingNumber);
    }
}
