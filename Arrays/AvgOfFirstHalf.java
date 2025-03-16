//Find out the avg value from a first half of given int array?
package Arrays;
public class AvgOfFirstHalf {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 4};
        avgOfFirstHalf(arr);
    }
    public static void avgOfFirstHalf(int[] arr){
        int sum = 0;
        int count = 0;
        for(int i = 0; i<arr.length/2; i++){
                sum  += arr[i];
                count++;
        }
        double avg = (double) sum / count;

        System.out.println("The average value of the first half of the array is: " + avg);
    };

    }
