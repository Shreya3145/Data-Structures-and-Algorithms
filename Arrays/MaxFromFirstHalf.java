//find out the max value from a first half of given int array?
package Arrays;
public class MaxFromFirstHalf {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        minOfFirstHalf(arr);
    }
    public static void minOfFirstHalf(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length/2; i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println("The max value from a first half : "+ max);

    }
    
}
