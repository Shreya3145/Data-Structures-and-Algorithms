//find out the max value from a second half of given int array?
package Arrays;
public class MaxFromSecondHalf {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        minOfSecondHalf(arr);
    }
    public static void minOfSecondHalf(int[] arr){
        int max = Integer.MIN_VALUE;
        int count = arr.length/2;
        for(int i = count; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }

        }
        System.out.println("The max value from a second half : "+ max);

    }
}
