public class BinarySearch {
    public static void main(String[] args) {
        int nums[]={1,2,3,7,9,10,11};
        int target=10;
        int n=nums.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]<target)lo=mid+1;
            else if(nums[mid]>target)hi=mid-1;
            else {
                 System.out.println(target+" Is At : "+mid);
                 break;
            }
        }
       
    }
}
