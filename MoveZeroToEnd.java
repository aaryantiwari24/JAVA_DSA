public class MoveZeroToEnd {
    public static void main(String[] args) {
        int [] arr={1,0,4,0,50,6,0,2,4,5,0};
        int z=0;
        for(int i=0;i<arr.length;i++){   
               if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[z];
                arr[z]=temp;
                z++;
               }
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
