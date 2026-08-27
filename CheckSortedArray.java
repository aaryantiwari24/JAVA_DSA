public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,23};
        boolean isSorted=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                isSorted=true;
            }
            else{isSorted=false;}
        }
        if(isSorted){
            System.out.println("Array is Sorted ");
        }
        else{
            System.out.println("Array is not Sorted");
        }
    }
}
