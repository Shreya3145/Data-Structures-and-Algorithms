//find the second min element from the given int array?
package Arrays;
public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        sMin(arr);
    }

    public static void sMin(int[] arr){

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){

            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            }

            else if(arr[i] > min && arr[i] < secondMin){
                secondMin = arr[i];
            }
        }

        if(secondMin==Integer.MAX_VALUE){
            System.out.println("There is no second minimum value in the array");
        }
        else{
            System.out.println("The second minimum value in the array is: " + secondMin);
        }
    }  
}
