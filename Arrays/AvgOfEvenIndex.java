//find out the avg from all even indexed element from the given int array?
package Arrays;
public class AvgOfEvenIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        evenAvg(arr);
    }
    public static void evenAvg(int[] arr){
        int sum = 0;
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(i%2==0){
                sum  += arr[i];
                count++;
            }
        }
        double avg = (double) sum / count;

        System.out.println(avg);

    }
    
}
