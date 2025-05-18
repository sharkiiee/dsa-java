public class SecondSmallestBru {
    public static void main(String[] args) {
        int[] arr ={10, 25, 5, 50, 30, 5};
        
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        
        for(int i=1;i < arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]!= smallest && arr[i]<secondSmallest){
                secondSmallest = arr[i];
            }
        }
        
        if(secondSmallest == Integer.MAX_VALUE){
            System.out.println("Second smallest value not found");
        }else{
            System.out.println("Second Smallest :" + secondSmallest);
        }}
}
