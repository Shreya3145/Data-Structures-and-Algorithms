package Arrays;
public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {-2, -5, -11, -10, -34};
        //int[] arr = {2, 3, 4, 5, 6};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }


        for (int i = 0; i < n; i++) {
            

            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
