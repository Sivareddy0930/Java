package TwoDimensionalArray;

public class Array2 {
    public static void main(String[] args) {
        int arr[][]={{10,20,30},{40,50,60},{70,80,90} };

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.println(arr[i][j]);
        //     }
        // }

        for (int[] a1: arr) {
            for (int a: a1) {
                System.out.println(a);
            }
            
            
        }
        



    }
}
