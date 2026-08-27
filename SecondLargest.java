public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,5,23,5,7,9,4};
        int max=arr[0];
        int secondlargest=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max)max=arr[i];

        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=max && arr[i]>secondlargest)secondlargest=arr[i];
        }
        System.out.println("Second Largest Element : "+secondlargest);
        
    }
}
