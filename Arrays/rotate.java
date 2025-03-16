package Arrays;
import java.util.Scanner;
public class rotate {
    @SuppressWarnings("resource")
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int k = 0; k< arr.length; k++){
            arr[k] = sc.nextInt(); 
        }

        int rotate = 1; 
        int i = 1;

        while(i <= rotate){
        int last = arr[arr.length-1];

        for(int j = arr.length-1; j >= 0; j--){

            if(j==0)
            arr[j] = last;

            else
            arr[j] = arr[j-1];
        
        }
        i++;
    }
    
    for(int k = 0; k < arr.length; k++){
    System.out.print(arr[k]+" ");
    }
    }

    
}
