public class RemoveDuplicate {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3};
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNumber of unique elements = " + k);
    }
}