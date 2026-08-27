public class MaxMin {
    public static void main(String[] args) {
        int arr[]={1,9,4,6,7,4,3};
        int max=arr[0],min=arr[0];
        for(int x:arr){
            if(x>max)max=x;
            if(x<min)min=x;
        }
        System.out.println("max = "+max+"  min = "+min);
    }
}
