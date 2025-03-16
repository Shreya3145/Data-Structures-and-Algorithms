//find out the sum of all elements from a second half of given int array?
package Arrays;
public class SumOfSecondHalf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sumOfHalf(arr);
    }
    public static void sumOfHalf(int[] arr){
        int sum = 0;
        int count = arr.length/2;
        for(int i = count; i<arr.length; i++){
            if(i >= count){
                sum  += arr[i];
                count++;
            }
        }
        System.out.println("The sum of all elements from a second half of the array is: "+ sum);

    }
    
}
