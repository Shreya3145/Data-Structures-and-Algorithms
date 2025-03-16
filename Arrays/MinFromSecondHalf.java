//find out the min value from a second half of given int array?
package Arrays;
public class MinFromSecondHalf {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        minOfSecondHalf(arr);
    }
    public static void minOfSecondHalf(int[] arr){
        int min = Integer.MAX_VALUE;
        int count = arr.length/2;
        for(int i = count; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                count++;
            }

        }
        System.out.println("The min value from a second half : "+ min);

    }
    
}
