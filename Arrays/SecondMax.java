package Arrays;
import java.util.Scanner;
public class SecondMax {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values: ");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }

        /* for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }*/

       
         

        /* for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                max = arr[i+1];
            }
            if(arr[i]>max){
                max = secondmax;
                max = arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax = arr[i];
            }
    }
    sc.close();
    System.out.println("The second maximum element in an array is " + max);
}  
    */
}
}
