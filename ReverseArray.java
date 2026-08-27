public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        int left=0, right=arr.length;
        while(left<right){
            int temp=right;
            right=left;
            left=temp;
            left++;
            right--;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
