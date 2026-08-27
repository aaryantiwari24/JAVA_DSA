public class FirstOccurrenceInSortedArray{
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,4,5,6};
        int l=0,h=arr.length,t=3,idx=-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]>t)h=m-1;
            else if(arr[m]<t)l=m+1;
            else{
                idx=m;
                h=m-1;
            }
        }
        l=0;
        h=arr.length;
        int idx2=-1;
        while(l<=h){
             int m=(l+h)/2;
            if(arr[m]>t)h=m-1;
            else if(arr[m]<t)l=m+1;
            else{
                idx2=m;
                l=m+1;
            }
        }
        System.out.println("First : "+idx+" Last : "+idx2);
    }
}