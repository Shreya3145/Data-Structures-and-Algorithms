package Arrays;
public class TwoDimAddress {

    public static void main(String[] args) {
        /* int[][] arr = new int[3][];
        System.out.print(arr[0]+" "); null */
        int[][] arr = new int[3][3];
    
        for(int i = 0; i < arr.length ; i++){
            //for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i]+" ");
            //}
            System.out.println();
        }
        
    }
}
