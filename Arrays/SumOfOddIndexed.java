//find the sum of all odd indexed element from the given int array?
package Arrays;
public class SumOfOddIndexed {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        odd(arr);
    }

    public static void odd(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(i%2!=0){
                sum +=arr[i];
            }
        }
        System.out.println(sum);

    }
    
}
