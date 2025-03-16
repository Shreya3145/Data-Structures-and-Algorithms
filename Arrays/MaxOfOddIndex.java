//find out the max from all odd indexed element from the given int array?
package Arrays;
public class MaxOfOddIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        oddMax(arr);
    }
    public static void oddMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(i%2!=0){
                if(arr[i] > max)
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
    
