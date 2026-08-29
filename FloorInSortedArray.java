public class FloorInSortedArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,10,10,11,13};
        int l=0,h=arr.length-1, idx=-1,x=7;
        while(l<=h){
            int m=(l+h)/2;
          if(arr[m]>x)h=m-1;
          else if(arr[m]<x){
              idx=m;
              l=m+1;
          }
        }
      System.out.println(idx);
    }
}
