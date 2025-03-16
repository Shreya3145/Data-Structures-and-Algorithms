//find out the min value from a first half of given int array?
package Arrays;
public class MinFromFirstHalf {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        minOfFirstHalf(arr);
    }
    public static void minOfFirstHalf(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length/2; i++){
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("The min value from a first half : "+ min);

    }
    
}
