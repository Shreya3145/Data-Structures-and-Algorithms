package Arrays;
import java.util.Scanner;
public class SumOfFirstHalf {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter values: ");
        
        for(int i=0; i< arr.length-1; i++){ 
           arr[i] = sc.nextInt();
        }
        sumofhalf(arr, size); 
    }
    public static int[] sumofhalf(int[] arr, int size){
        size = size/2; 
        int sum = 0;

        for(int i=0; i < size; i++){ 
            sum = sum + arr[i];
         }

        System.out.println(sum);

        return arr;
    }
    
}
