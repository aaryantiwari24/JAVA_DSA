public class BinarySearchDecendingArray {
     public static void main(String[] args) {
        int nums[]={10,9,8,7,3,2,1};
        int target=8;
        int n=nums.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]<target)hi=mid-1;
            else if(nums[mid]>target)lo=mid+1;
            else {
                 System.out.println(target+" Is At : "+mid);
                 break;
            }
        }
     }
}
